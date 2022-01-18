"use strict";var css=require("css"),util=require("./lib/util"),validateItem=require("./lib/validator").validate,fs=require("fs"),path=require("path"),SELECTOR_MATCHER=/^[\.#]?[A-Za-z0-9_\-:]+$/,DESCENDANT_SELECTOR_MATCHER=/^([.#]?[A-Za-z0-9_-]+(\s+|\s*>\s*))+([.#]?[A-Za-z0-9_\-:]+)$/,IMPORT_MATCHER=/(['"]([^()]+?)['"])|(['"]([^()]+?)['"]\s+(only|not)?\s?(screen)?\s?((and|or|,|not|landscape)?\s?[(]([^()])+[)]\s*)+)/g,LENGTH_REGEXP=/^[-+]?\d*\.?\d+(\S*)$/;const CARD_SELECTOR=/^[\.#][A-Za-z0-9_\-]+$/,card="card"===process.env.DEVICE_LEVEL;function expand(e,t,o){if("border"===t)e.value.forEach(function(e){if("Width"===e.type||"Color"===e.type||"Style"===e.type){const i=[t+"Top"+e.type,t+"Right"+e.type,t+"Bottom"+e.type,t+"Left"+e.type];util.splitAttr(o,e.value,i)}else o[t+e.type]=e.value});else if(["borderTop","borderRight","borderBottom","borderLeft"].includes(t))e.value.forEach(function(e){o[t+e.type]=e.value});else if("margin"===t||"padding"===t){const i=[t+"Top",t+"Right",t+"Bottom",t+"Left"];util.splitAttr(o,e.value,i)}else"borderWidth"===t?util.splitAttr(o,e.value,["borderTopWidth","borderRightWidth","borderBottomWidth","borderLeftWidth"]):"borderColor"===t?util.splitAttr(o,e.value,["borderTopColor","borderRightColor","borderBottomColor","borderLeftColor"]):"borderStyle"===t?util.splitAttr(o,e.value,["borderTopStyle","borderRightStyle","borderBottomStyle","borderLeftStyle"]):"borderRadius"===t?util.splitAttr(o,e.value,["borderBottomLeftRadius","borderBottomRightRadius","borderTopLeftRadius","borderTopRightRadius"]):"gridGap"===t?util.splitAttr(o,e.value,["gridRowsGap","gridColumnsGap"]):"boxShadow"===t&&e.value.forEach(function(e){"H"!==e.type&&"V"!==e.type&&"Blur"!==e.type&&"Spread"!==e.type&&"Color"!==e.type||util.splitAttr(o,e.value,[t+e.type])})}function flexExpand(e,t){for(let o=0;o<e.declarations.length;o++){let i=e.declarations[o];if("flex"===i.property){let r=i.value.split(/\s+/);e.declarations.splice(o,1),1===r.length?checkFlexOne(e,t,i,r,o):2===r.length?checkFlexTwo(e,t,i,r,o):3===r.length?checkFlexThree(e,t,i,r,o):t.push({line:i.position.start.line,column:i.position.start.column,reason:"ERROR: Value `"+i.value+"` of the `"+i.property+"` attribute is incorrect."})}}}function getUnit(e){let t=(e=e.toString().trim()).match(LENGTH_REGEXP);if(t){let e=t[1];if(!e)return"none";if("px"===e)return"px"}return null}function checkFlexOne(e,t,o,i,r){["none","auto","initial"].includes(i[0])?e.declarations.splice(r,0,{type:"declaration",property:"flex",value:i[0],position:o.position}):"px"===getUnit(i[0])?e.declarations.splice(r,0,{type:"declaration",property:"flex-basis",value:i[0],position:o.position}):"none"===getUnit(i[0])?e.declarations.splice(r,0,{type:"declaration",property:"flex-grow",value:i[0],position:o.position}):t.push({line:o.position.start.line,column:o.position.start.column,reason:"ERROR: Value `"+o.value+"` of the `"+o.property+"` attribute is incorrect.It must be a number, a number with unit `px`, none, auto, or initial."})}function checkFlexTwo(e,t,o,i,r){"none"===getUnit(i[0])?(e.declarations.splice(r,0,{type:"declaration",property:"flex-grow",value:i[0],position:o.position}),"px"===getUnit(i[1])?e.declarations.splice(r,0,{type:"declaration",property:"flex-basis",value:i[1],position:o.position}):"none"===getUnit(i[1])?e.declarations.splice(r,0,{type:"declaration",property:"flex-shrink",value:i[1],position:o.position}):t.push({line:o.position.start.line,column:o.position.start.column,reason:"ERROR: Value `"+o.value+"` of the `"+o.property+"` attribute is incorrect. Value `"+i[1]+"` must be a number or a number with unit `px`."})):t.push({line:o.position.start.line,column:o.position.start.column,reason:"ERROR: Value `"+o.value+"` of the `"+o.property+"` attribute is incorrect. Value `"+i[0]+"` must be a number."})}function checkFlexThree(e,t,o,i,r){"none"===getUnit(i[0])&&"none"===getUnit(i[1])&&"px"===getUnit(i[2])?(e.declarations.splice(r,0,{type:"declaration",property:"flex-grow",value:i[0],position:o.position}),e.declarations.splice(r,0,{type:"declaration",property:"flex-shrink",value:i[1],position:o.position}),e.declarations.splice(r,0,{type:"declaration",property:"flex-basis",value:i[2],position:o.position})):t.push({line:o.position.start.line,column:o.position.start.column,reason:"ERROR: Value `"+o.value+"` of the `"+o.property+"` attribute is incorrect. It must be in the format of (1, 1, 1px)."})}function parse(e,t,o){var i,r,n={},a=[];(i=css.parse(e,{silent:!0})).stylesheet.parsingErrors&&i.stylesheet.parsingErrors.length&&(r=i.stylesheet.parsingErrors).forEach(function(e){a.push({line:e.line,column:e.column,reason:e.toString().replace("Error","ERROR")})}),i&&"stylesheet"===i.type&&i.stylesheet&&i.stylesheet.rules&&i.stylesheet.rules.length&&i.stylesheet.rules.forEach(function(e){var t=e.type,i={},r=[];if("rule"===t)e.declarations&&e.declarations.length&&(flexExpand(e,r),e.declarations.forEach(function(e){var t,o,n,a;"declaration"===e.type&&(t=e.property,o=e.value,a=util.hyphenedToCamelCase(t),(n=validateItem(a,o)).value&&-1!==Object.values(util.SPLECIAL_ATTR).indexOf(a)&&expand(n,a,i),"number"!=typeof n.value&&"string"!=typeof n.value||Object.values(util.SPLECIAL_ATTR).includes(a)||(i[a]=n.value),n.log&&(n.log.line=e.position.start.line,n.log.column=e.position.start.column,r.push(n.log)))}),card&&e.selectors.length>1?a.push({line:e.position.start.line,column:e.position.start.column,reason:"ERROR: The `"+e.selectors.join(", ")+"` selector is not supported."}):e.selectors.forEach(function(t){if(card?t.match(CARD_SELECTOR):t.match(SELECTOR_MATCHER)||t.match(DESCENDANT_SELECTOR_MATCHER)){var o=t,r=o.indexOf(":");if(r>-1){var l=o.slice(r);o=o.slice(0,r);var s={};Object.keys(i).forEach(function(e){s[e+l]=i[e]}),i=s}Object.keys(i).forEach(function(e){if(0===e.indexOf("transition")&&"transition"!==e){var t=e.replace("transition","");t=t[0].toLowerCase()+t.slice(1),n["@TRANSITION"]=n["@TRANSITION"]||{},n["@TRANSITION"][o]=n["@TRANSITION"][o]||{},n["@TRANSITION"][o][t]=i[e]}n[o]=n[o]||{},n[o][e]=i[e]})}else a.push({line:e.position.start.line,column:e.position.start.column,reason:"ERROR: The `"+t+"` selector is not supported."})}),a=a.concat(r));else if("font-face"===t)e.declarations&&e.declarations.length&&(e.declarations.forEach(function(e){if("declaration"===e.type){var t=util.hyphenedToCamelCase(e.property),o=e.value;"fontFamily"===t&&"\"'".indexOf(o[0])>-1&&(o=o.slice(1,o.length-1)),i[t]=o}}),n["@FONT-FACE"]||(n["@FONT-FACE"]=[]),n["@FONT-FACE"].push(i));else if("import"===t)parseImport(o,e,n,a);else if("keyframes"!==t||card){if("media"===t){n["@MEDIA"]||(n["@MEDIA"]=[]);var l=e.media,s={};s.condition=l,e.rules&&e.rules.length&&e.rules.forEach(function(e){i={},"import"===e.type&&parseImport(o,e,s,a),e.declarations&&e.declarations.length&&(flexExpand(e,r),e.declarations.forEach(function(e){var t,o,n,a;"declaration"===e.type&&(t=e.property,o=e.value,a=util.hyphenedToCamelCase(t),(n=validateItem(a,o)).value&&-1!==Object.values(util.SPLECIAL_ATTR).indexOf(a)&&expand(n,a,i),"number"!=typeof n.value&&"string"!=typeof n.value||Object.values(util.SPLECIAL_ATTR).includes(a)||(i[a]=n.value),n.log&&(n.log.line=e.position.start.line,n.log.column=e.position.start.column,r.push(n.log)))}),e.selectors.forEach(function(t){if(t.match(SELECTOR_MATCHER)||t.match(DESCENDANT_SELECTOR_MATCHER)){var o=t,r=o.indexOf(":");if(r>-1){var n=o.slice(r);o=o.slice(0,r);var l={};Object.keys(i).forEach(function(e){l[e+n]=i[e]}),i=l}Object.keys(i).forEach(function(e){if(0===e.indexOf("transition")&&"transition"!==e){var t=e.replace("transition","");t=t[0].toLowerCase()+t.slice(1),s["@TRANSITION"]=s["@TRANSITION"]||{},s["@TRANSITION"][o]=s["@TRANSITION"][o]||{},s["@TRANSITION"][o][t]=i[e]}s[o]=s[o]||{},s[o][e]=i[e]})}else a.push({line:e.position.start.line,column:e.position.start.column,reason:"ERROR: The `"+t+"` selector is not supported."})}),a=a.concat(r))}),n["@MEDIA"].push(s)}}else{n["@KEYFRAMES"]||(n["@KEYFRAMES"]={});var p=e.name;n["@KEYFRAMES"][p]=[],e.keyframes&&e.keyframes.length&&(card?a.push({line:e.position.start.line,column:e.position.start.column,reason:"ERROR: The keyframes is not supported!"}):(e.keyframes.forEach(function(e){if("keyframe"===e.type){if(e.declarations&&e.declarations.length&&e.declarations.forEach(function(e){var t,o,n,a;"declaration"===e.type&&(t=e.property,o=e.value,a=util.hyphenedToCamelCase(t),"number"!=typeof(n=validateItem(a,o)).value&&"string"!=typeof n.value||(i[a]=n.value),n.log&&(n.log.line=e.position.start.line,n.log.column=e.position.start.column,r.push(n.log)))}),"from"===e.values[0]){var t={};Object.keys(i).forEach(function(e){t[e]=i[e]}),t.time=0,n["@KEYFRAMES"][p].push(t)}if("to"===e.values[0]){t={};Object.keys(i).forEach(function(e){t[e]=i[e]}),t.time=100,n["@KEYFRAMES"][p].push(t)}}}),a=a.concat(r)))}}),t(r,{jsonStyle:n,log:a})}function parseImport(e,t,o,i){if(!e)return;let r,n=t.import,a="",l="";if(n.match(IMPORT_MATCHER)){r=n.match(/['"]([^()]+?)['"]/)[1],a=n.replace(r,"").replace(/['"]/g,"")}/^(\.)|(\.\.)\//.test(r)&&(e=e.substring(0,e.lastIndexOf(path.sep)+1),r=path.resolve(e,r)),fs.existsSync(r)?(l=fs.readFileSync(r).toString(),0!==a.length&&(l="@media "+a+"{\n"+l+"\n}"),parse(l,(e,t)=>{if(e)throw e;o=Object.assign(o,t.jsonStyle)},r)):i.push({line:t.position.start.line,column:t.position.start.column,reason:"ERROR: no such file or directory, open "+r})}function validate(e,t){var o,i=[];try{e=JSON.parse(JSON.stringify(e))}catch(t){o=t,e={}}Object.keys(e).forEach(function(t){var o=e[t];Object.keys(o).forEach(function(e){var t=o[e],r=validateItem(e,t);"number"==typeof r.value||"string"==typeof r.value?o[e]=r.value:delete o[e],r.log&&i.push(r.log)})}),t(o,{jsonStyle:e,log:i})}module.exports={parse:parse,validate:validate,validateItem:validateItem,util:util,expand:expand,getUnit:getUnit};