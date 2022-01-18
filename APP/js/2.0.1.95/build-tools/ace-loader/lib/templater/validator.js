var exp=require("./exp"),styler=require("../styler"),styleValidator=require("../styler/lib/validator"),path=require("path");const projectPath=process.env.aceModuleRoot||process.cwd(),REG_TAG_DATA_ATTR=/^data-\w+/,REG_FOR=/(.*) (?:in) (.*)/,REG_EVENT=/([^(]*)\((.+)\)/,{DEVICE_LEVEL:DEVICE_LEVEL}=require("../lite/lite-enum"),{richCommonTag:richCommonTag,richNativeTag:richNativeTag}=require("./rich-validator"),{liteCommonTag:liteCommonTag,liteNativeTag:liteNativeTag}=require("./lite-validator");var nativeTag=process.env.DEVICE_LEVEL===DEVICE_LEVEL.LITE?liteNativeTag:richNativeTag,commonTag=process.env.DEVICE_LEVEL===DEVICE_LEVEL.LITE?liteCommonTag:richCommonTag,aliasTagMap={},notRootTag=[],atomicsTag=[],textContentTag=[],reservedTag=[],pathAttrTag=[],attrTagMap={},funcAttrTagMap={},defaultAttrTagMap={},requireAttrTagMap={},enumAttrTagMap={},rootAttrTagMap={},parentsTagMap={},childAttrsTagMap={},childrenTagMap={},eventsTagMap={};function checkTagName(e,t){let n=e.tagName,a=e.childNodes||[],o=e.__location||{},i=t.result,l=t.deps,r=t.log;process.env.DEVICE_LEVEL===DEVICE_LEVEL.RICH&&"dialog"===n&&checkDialogChild(n,a,o,r),process.env.DEVICE_LEVEL!==DEVICE_LEVEL.LITE||reservedTag.includes(n)||"img"===n||r.push({line:o.line||1,column:o.col||1,reason:"ERROR: The tag name `"+n+"` does not meet specifications."}),checkAliasTagMap(n,i,o,r),l.indexOf(n)<0&&"string"==typeof n&&l.push(n),checkAtomicsTag(n,a,o,r);let c=e.attrs||[],s=[];c.forEach(function(e){s.push(e.name.toLowerCase())}),i.attr=i.attr||{},checkAttrTagMap(n,s,o,r),checkDefaultAttrTagMap(n,c,s,o,r),checkRootNode(e,n,s,o,r),checkRequireAttrTagMap(n,s,o,r),checkEnumAttrTagMap(n,s,c,o,r),checkFuncAttrTagMap(n,s,c,o,r),checkEventsTagMap(n,s,o,r),checkReservedTag(n,a,o,r),validatorForLite(n,c,s,r,o)}function checkDialogChild(e,t,n,a){t.filter(e=>e&&"#text"!==e.nodeName&&"#comment"!==e.nodeName).length>1&&a.push({line:n.line||1,column:n.col||1,reason:"ERROR: The `"+e+"` tag can have only one child node."})}function checkAliasTagMap(e,t,n,a){aliasTagMap[e]&&("img"!==e&&a.push({line:n.line||1,column:n.col||1,reason:"NOTE: The tag name `"+e+"` is automatically fixed to `"+aliasTagMap[e]+"`."}),e=aliasTagMap[e]),t.type=e}function checkAtomicsTag(e,t,n,a){atomicsTag.indexOf(e)>=0&&t.length>0&&!isSupportedSelfClosing(e)&&(textContentTag.indexOf(e)<0?t.every(function(t){return"#text"===t.nodeName||"#comment"===t.nodeName||a.push({line:n.line||1,column:n.col||1,reason:"ERROR: The `"+e+"` tag cannot have child tags."})}):t.every(function(t){return"#text"===t.nodeName||"#comment"===t.nodeName||a.push({line:n.line||1,column:n.col||1,reason:"ERROR: The `"+e+"` tag can have only one text node."})}))}function checkAttrTagMap(e,t,n,a){"img"===e&&(e="image"),attrTagMap[e]&&t.forEach(function(t){t.match(/^(on|@)/)||t in attrTagMap[e]||(t in commonTag.attrs?a.push({line:n.line||1,column:n.col||1,reason:"ERROR: The `"+e+"` tag does not support the `"+t+"` attribute."}):checkDataAttr(t)||a.push({line:n.line||1,column:n.col||1,reason:"WARNING: The `"+e+"` tag uses the custom `"+t+"` attribute."}))})}function checkDefaultAttrTagMap(e,t,n,a,o){defaultAttrTagMap[e]&&Object.keys(defaultAttrTagMap[e]).forEach(function(i){let l=n.indexOf(i);l>=0&&""===t[l].value&&(t[l].value=defaultAttrTagMap[e][i],o.push({line:a.line||1,column:a.col||1,reason:"ERROR: The `"+i+"` attribute of the `"+e+"` tag is null."}))})}function checkRootNode(e,t,n,a,o){e._isroot&&notRootTag.indexOf(t)&&o.push({line:a.line||1,column:a.col||1,reason:"ERROR: The `"+t+"` component cannot serve as a root component."}),e._isroot&&rootAttrTagMap[t]&&rootAttrTagMap[t].forEach(function(e){n.indexOf(e)>=0&&o.push({line:a.line||1,column:a.col||1,reason:"ERROR: The `"+t+"` root node cannot use the `"+e+"` attribute."})})}function checkRequireAttrTagMap(e,t,n,a){requireAttrTagMap[e]&&requireAttrTagMap[e].forEach(function(o){t.indexOf(o)<0&&a.push({line:n.line||1,column:n.col||1,reason:"ERROR: Attribute `"+o+"` is not defined for the `"+e+"` tag."})})}function checkEnumAttrTagMap(e,t,n,a,o){enumAttrTagMap[e]&&Object.keys(enumAttrTagMap[e]).forEach(function(i){let l=t.indexOf(i);if(l>=0){let t=n[l].value.trim();if(!exp.isExpr(t)){let r=enumAttrTagMap[e][i];r.indexOf(t)<0&&(n[l].value=r[0],o.push({line:a.line||1,column:a.col||1,reason:"ERROR: Value `"+t+"` of the `"+i+"` attribute of the `"+e+"` tag is illegal."}))}}})}function checkFuncAttrTagMap(e,t,n,a,o){funcAttrTagMap[e]&&Object.keys(funcAttrTagMap[e]).forEach(function(i){let l=t.indexOf(i);if(l>=0){let t=n[l].value;if(!exp.isExpr(t)){let r=funcAttrTagMap[e][i],c=styleValidator.validateFuncMap[r];if("function"==typeof c){let e=c(t);if(e&&e.reason){n[l].value=e.value;let r=e.reason(i,t,e.value);o.push({line:a.line||1,column:a.col||1,reason:r})}}}}})}function checkEventsTagMap(e,t,n,a){if(eventsTagMap[e]){let o=eventsTagMap[e];t.forEach(function(t){if(t.match(/^(on|@)/)){let i=t.replace(/^(on|@)/,"");o.indexOf(i.toLowerCase())<0&&a.push({line:n.line||1,column:n.col||1,reason:"ERROR: The `"+e+"` tag does not support the `"+i+"` event."})}})}}function checkReservedTag(e,t,n,a){if(reservedTag.indexOf(e)>=0&&t.length>0){let o=childrenTagMap[e],i="tabs"===e,l=void 0,r=void 0;i&&(r=0,l=0),t.forEach(function(t){if(reservedTag.indexOf(t.nodeName)>=0){let c=parentsTagMap[t.nodeName];if((c&&c.indexOf(e)<0||o&&o.indexOf(t.nodeName)<0)&&(a.push({line:n.line||1,column:n.col||1,reason:"ERROR: The `"+e+"` tag does not support the `"+t.nodeName+"` child tag."}),i)){let e=0;"tab-content"===t.nodeName&&(e=++l),"tab-bar"===t.nodeName&&(e=++r),e>1&&a.push({line:n.line||1,column:n.col||1,reason:"ERROR: The `tabs` tag supports at most one `"+t.nodeName+"` child node."})}}})}}function validatorForLite(e,t,n,a,o){process.env.DEVICE_LEVEL===DEVICE_LEVEL.LITE&&(inputLite(e,t,n,a,o),ismatchIfAndFor(n)&&a.push({line:o.line||1,column:o.col||1,reason:"ERROR: The `if` and `for` attributes cannot be written to the same `"+e+"` tag."}),classLite(e,t,a,o))}function inputLite(e,t,n,a,o){let i;"input"===e&&(t.map(function(e){"type"===e.name&&(i=e.value)}),isMatchChange(i,n)&&a.push({line:o.line||1,column:o.col||1,reason:"ERROR: The `"+e+"` tag does not support the `change` event when the type is neither checkbox nor radio."}))}function isMatchChange(e,t){return!["checkbox","radio"].includes(e)&&(t.includes("onchange")||t.includes("@change"))}function ismatchIfAndFor(e){return e.includes("if")&&e.includes("for")}function classLite(e,t,n,a){t.map(function(t){"class"===t.name&&exp.containExpr(t.value)&&n.push({line:a.line||1,column:a.col||1,reason:"ERROR: Class selector in tag `"+e+"` does not support data binding."})})}function checkId(e,t){e&&(t.result.id=exp.isExpr(e)?exp(e):e,t.result.attr=t.result.attr||{},t.result.attr[styler.util.hyphenedToCamelCase("id")]=exp(e))}function checkClass(classNames,out){classNames=classNames.trim(),exp.containExpr(classNames)?out.result.classList=eval(exp.transExprForList(classNames)):out.result.classList=classNames.split(/\s+/)}function checkStyle(e,t,n){let a=t.log,o={};if(e){let i=e.split(";");for(let e=0;e<i.length;e++){let l,r,c,s=i[e].trim().split(":");if(2===s.length)if(l=s[0].trim(),l=styler.util.hyphenedToCamelCase(l),r=s[1].trim(),r=exp(r),"flex"===l&&"string"==typeof r)expandFlex(l,r,o,n,a);else{if(r=(c=styler.validateItem(l,r)).value,c.log){let e={};e.line=n.line,e.column=n.col,e.reason=c.log.reason,a.push(e)}["[object Number]","[object String]","[object Function]","[object Object]","[object Array]"].includes(Object.prototype.toString.call(r))&&expandStyle(l,r,c,o,t,n,a)}s.length>2&&(s[1]=s.slice(1).join(":"),s=s.slice(0,2),exp.isExpr(s[1])&&(o[s[0]]=exp(s[1])))}t.result.style=o}}function expandFlex(e,t,n,a,o){let i=t.split(/\s+/);1===i.length?expandFlexOne(e,i,n,a,o):2===i.length?expandFlexTwo(e,t,i,n,a,o):3===i.length?expandFlexThree(e,t,i,n,a,o):o.push({line:a.line,column:a.column,reason:"ERROR: Value `"+t+"` of the `"+e+"` attribute is incorrect."})}function expandFlexOne(e,t,n,a,o){["none","auto","initial"].includes(t[0])?n.flex=t[0]:"px"===styler.getUnit(t[0])?n.flexBasis=t[0]:"none"===styler.getUnit(t[0])?n.flexGrow=t[0]:o.push({line:a.line,column:a.column,reason:"ERROR: Value `"+t[0]+"` of the `"+e+"` attribute is incorrect.It must be a number, a number with unit `px`, none, auto, or initial."})}function expandFlexTwo(e,t,n,a,o,i){"none"===styler.getUnit(n[0])?(a.flexGrow=n[0],"px"===styler.getUnit(n[1])?a.flexBasis=n[1]:"none"===styler.getUnit(n[1])?a.flexShrink=n[1]:i.push({line:o.line,column:o.column,reason:"ERROR: Value `"+t+"` of the `"+e+"` attribute is incorrect. Value `"+n[1]+"` must be a number or a number with unit `px`."})):i.push({line:o.line,column:o.column,reason:"ERROR: Value `"+t+"` of the `"+e+"` attribute is incorrect. Value `"+n[0]+"` must be a number."})}function expandFlexThree(e,t,n,a,o,i){"none"===styler.getUnit(n[0])&&"none"===styler.getUnit(n[1])&&"px"===styler.getUnit(n[2])?(a.flexGrow=n[0],a.flexShrink=n[1],a.flexBasis=n[2]):i.push({line:o.line,column:o.column,reason:"ERROR: Value `"+t+"` of the `"+e+"` attribute is incorrect. It must be in the format of (1, 1, 1px)."})}function expandStyle(e,t,n,a,o,i,l){Object.values(styler.util.SPLECIAL_ATTR).includes(e)&&"function"!=typeof t?styler.expand(n,e,a):process.env.DEVICE_LEVEL===DEVICE_LEVEL.LITE&&"border"===e&&"function"==typeof t?l.push({line:i.line||1,column:i.col||1,reason:"ERROR: The "+e+" shorthand inline style does not support data binding."}):process.env.DEVICE_LEVEL===DEVICE_LEVEL.LITE&&"list"===o.result.type&&"flexDirection"==e&&"function"==typeof t?l.push({line:i.line||1,column:i.col||1,reason:"ERROR: The `flex-direction` inline style of the `list` tag does not support data binding."}):a[e]=t}function checkIf(e,t,n){exp.isExpr(e)||(e="{{"+e+"}}"),e&&(n&&(e="{{!("+e.substr(2,e.length-4)+")}}"),t.result.shown=exp(e))}function checkElif(e,t,n){if(exp.isExpr(e)||(e="{{"+e+"}}"),e){if(n){let t=e.indexOf("&&");e="{{!("+e.substr(2,t-2)+")"+e.substr(t,e.length)}t.result.shown=exp(e)}}function checkFor(e,t,n){let a=t.log;if(e){let n,a;exp.isExpr(e)&&(e=e.substr(2,e.length-4));let o,i=e.match(REG_FOR);if(i){let t=i[1].match(/\((.*),(.*)\)/);t?(n=t[1].trim(),a=t[2].trim()):a=i[1].trim(),e=i[2]}e="{{"+e+"}}",n||a?(o={exp:exp(e)},n&&(o.key=n),a&&(o.value=a)):o=exp(e),t.result.repeat=o}else a.push({line:n.line||1,column:n.col||1,reason:"WARNING: Attribute `for` is null."})}function checkAppend(e,t){e&&(t.result.append=exp(e))}function checkEvent(eventName,val,out){let name=eventName.replace(/^(on|@)/,"");if(name&&val){exp.isExpr(val)&&(val=exp.removeAllExprFix(val.trim()));let m=val.match(REG_EVENT),params1=val.match(/(.*)\(\)$/);if(m){let functionName=m[1],paramList=m[2];val=transExprForEvent(functionName,paramList),val=eval("(function (evt) {"+exp(val,!1).replace(/this.\$event|\$event/,"evt")+"})")}params1&&(val=params1[1]),out.result.events=out.result.events||{},out.result.events[name]=val}}function transExprForEvent(e,t){let n;return t?-1===(t=(t=exp.parseExpression(t,!0)).split(/\s*,\s*/)).indexOf("$event")&&(t[t.length]="$event"):t=["$event"],n="{{"+e+"("+t.join(",")+")}}"}function checkAttr(e,t,n,a,o,i){if(t&&("number"==typeof n||"string"==typeof n)){if(pathAttrTag.indexOf(t)>=0&&n.match(/^\.\.\/|^\.\//)){if(!e)return;n.indexOf("./")>=0&&(e=e.substring(0,e.lastIndexOf(path.sep)+1),n=path.resolve(e,n)),n=n.replace(projectPath,"").replace(/\\/g,"/")}a.result.attr=a.result.attr||{},a.result.attr[styler.util.hyphenedToCamelCase(t)]=exp(n),"value"===t&&"text"===o&&a.log.push({line:i.line,column:i.col,reason:"WARNING: `value` should be written as text content in <text>"})}}function isSupportedSelfClosing(e){if(e&&"string"==typeof e){let t=aliasTagMap[e];if(t){if(nativeTag[t]&&nativeTag[t].selfClosing)return!0}else if(nativeTag[e]&&nativeTag[e].selfClosing)return!0}return!1}function checkDataAttr(e){return REG_TAG_DATA_ATTR.test(e)}function isReservedTag(e){return reservedTag.indexOf(e)>-1}function extend(e){let t=arguments.length,n=Array(t>1?t-1:0);for(let e=1;e<t;e++)n[e-1]=arguments[e];if("function"==typeof Object.assign)Object.assign.apply(Object,[e].concat(n));else{let t=n.shift();for(let n in t)e[n]=t[n];n.length&&extend.apply(void 0,[e].concat(n))}return e}function merge(e){let t=arguments.length,n=Array(t>1?t-1:0);for(let e=1;e<t;e++)n[e-1]=arguments[e];return n.length&&n.forEach(function(t){e=e.concat(t)}),e}Object.keys(nativeTag).forEach(function(e){reservedTag.push(e);let t=nativeTag[e];t.alias&&t.alias.length&&t.alias.forEach(function(t){aliasTagMap[t]=e}),t.excludeRoot&&notRootTag.push(e),t.atomic&&atomicsTag.push(e),t.textContent&&textContentTag.push(e);let n=void 0,a={},o={},i=[],l=[],r=[],c=[];n=t.uattrs?extend({},t.uattrs):extend({},commonTag.attrs,t.attrs),Object.keys(n).forEach(function(e){let t=n[e];t.enum&&t.enum.length>0&&(o[e]=t.enum,a[e]=t.enum[0]),t.def&&(a[e]=t.def),t.required&&l.push(e),t.excludeRoot&&c.push(e),t.checkFunc&&(i[e]=t.checkFunc),t.checkChildAttrs&&(r[e]=t.checkChildAttrs),t.checkPath&&pathAttrTag.push(e)}),attrTagMap[e]=n,funcAttrTagMap[e]=i,defaultAttrTagMap[e]=a,requireAttrTagMap[e]=l,enumAttrTagMap[e]=o,rootAttrTagMap[e]=c,childAttrsTagMap[e]=r,childrenTagMap[e]=t.children?merge([],commonTag.children,t.children):null,parentsTagMap[e]=t.parents?merge([],commonTag.parents,t.parents):null;let s=void 0;s=t.uevents?merge([],t.uevents,t.events):merge([],commonTag.events,t.events),eventsTagMap[e]=s}),module.exports={checkTagName:checkTagName,checkId:checkId,checkClass:checkClass,checkStyle:checkStyle,checkIf:checkIf,checkElif:checkElif,checkFor:checkFor,checkAppend:checkAppend,checkEvent:checkEvent,checkAttr:checkAttr,isReservedTag:isReservedTag,isSupportedSelfClosing:isSupportedSelfClosing};