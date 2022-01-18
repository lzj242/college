"use strict";function _classCallCheck(e,t){if(!(e instanceof t))throw new TypeError("Cannot call a class as a function")}function _defineProperties(e,t){for(var n=0;n<t.length;n++){var s=t[n];s.enumerable=s.enumerable||!1,s.configurable=!0,"value"in s&&(s.writable=!0),Object.defineProperty(e,s.key,s)}}function _createClass(e,t,n){return t&&_defineProperties(e.prototype,t),n&&_defineProperties(e,n),e}var output,webpackPath,fs=require("fs"),path=require("path"),process=require("child_process"),qjsc=path.join(__dirname,"..","bin","qjsc"),forward='(global.___mainEntry___ = function (globalObjects) {\n  const define = globalObjects.define;\n  const require = globalObjects.require;\n  const bootstrap = globalObjects.bootstrap;\n  const register = globalObjects.register;\n  const render = globalObjects.render;\n  const $app_define$ = globalObjects.$app_define$;\n  const $app_bootstrap$ = globalObjects.$app_bootstrap$;\n  const $app_require$ = globalObjects.$app_require$;\n  const history = globalObjects.history;\n  const Image = globalObjects.Image;\n  (function(global) {\n    "use strict";\n',last="\n})(this.__appProto__);\n})",firstFileEXT=".jtc",sencondFileEXT=".c",lastFileEXT=".bin",GenBinPlugin=function(){function e(t,n){_classCallCheck(this,e),output=t,webpackPath=n}return _createClass(e,[{key:"apply",value:function(e){(fs.existsSync(path.resolve(webpackPath,"qjsc.exe"))||fs.existsSync(path.resolve(webpackPath,"qjsc")))&&e.hooks.emit.tap("GenBinPlugin",function(e){var t=e.assets;Object.keys(t).forEach(function(e){if(output&&webpackPath&&".js"===path.extname(e)){var n=forward+t[e].source()+last,s=e.replace(/\.js$/,firstFileEXT);writeFileSync(n,path.resolve(output,s),e)}})})}}]),e}();function writeFileSync(e,t,n){var s=path.join(t,"..");fs.existsSync(s)&&fs.statSync(s).isDirectory()||mkDir(s),fs.writeFileSync(t,e),fs.existsSync(t)?qjscFirst(t,t.replace(/\.jtc$/,sencondFileEXT)):console.error("[31m","Failed to convert file ".concat(n," to bin. ").concat(t," is lost"),"[39m")}function mkDir(e){var t=path.join(e,"..");fs.existsSync(t)&&!fs.statSync(t).isFile()||mkDir(t),fs.mkdirSync(e)}function qjscFirst(e,t){var n='"'.concat(qjsc,'" -o "').concat(t,'" -N buf -c "').concat(e,'"');try{process.execSync(n)}catch(t){console.error("[31m","Failed to convert file ".concat(e," to bin"),"[39m")}fs.existsSync(e)?(fs.unlinkSync(e),qjscSecond(t)):console.error("[31m","Failed to convert file ".concat(e," to bin. ").concat(e," is lost"),"[39m")}function qjscSecond(e){var t=fs.readFileSync(e,"utf8");t=t.substr(t.indexOf("{")+1,t.indexOf("}")-t.indexOf("{")-1).trim();var n=e.replace(/\.c$/,lastFileEXT),s=path.join(n,"..");fs.existsSync(s)&&fs.statSync(s).isDirectory()||mkDir(s),fs.writeFileSync(n,toBuffer(t)),fs.existsSync(e)?fs.unlinkSync(e):console.error("[31m","Failed to clean file ".concat(e,"."),"[39m")}function toBuffer(e){for(var t=e.split(","),n=Buffer.alloc(t.length),s=0;s<t.length;s++)n[s]=t[s];return n}module.exports=GenBinPlugin;