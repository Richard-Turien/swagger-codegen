'use strict';
myApp.controller('SwaggerController', [ '$scope', '$window',
		function($scope, $window) {

			var self = this;

			self.openSwaggerCatalog = function() {
				loadUrl("/virtualservices/swagger-ui.html");
			};
			self.openSwaggerUI = function() {
				loadUrl("/virtualservices/swaggerui.html");
			};
			self.openSwaggerEUI = function() {
				loadUrl("/virtualservices/swaggerex-ui.html");
			};
			self.openSwaggerEditor = function() {
				loadUrl("/virtualservices/swagger-editor.html")
			};
			
			function loadUrl(url) {
				$window.open(url, "_blank", "location=no,toolbar=yes,scrollbars=yes,resizable=yes,top=500,left=500,width=1000,height=600");
			}
		} ]);
