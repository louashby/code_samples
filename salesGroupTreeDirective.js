/**
 * Directive for the sales group tree widget
 * @type {*}
 */

var uflWidgetsModule = angular.module('UFL.Widget.SalesGroupTree');
uflWidgetsModule.directive('salesgrouptree', ['$compile', '$http', '$templateCache', function ($compile, $http, $templateCache) {

  // basic template url to use
  var baseTemplateUrl = '../html/salesGroupTreeTemplate.html';

  var getTemplate = function (templateUrl) {
    var templateLoader;
    templateLoader = $http.get(templateUrl, {cache: $templateCache});
    return templateLoader;

  }

  var linker = function (scope, element, attrs) {
    var templateUrl = baseTemplateUrl;

    if (attrs.templateurl !== undefined) {
      templateUrl = attrs.templateurl;
    }

    var loader = getTemplate(templateUrl);

    var promise = loader.success(function (html) {
      element.html(html);
    }).then(function (response) {
          element.replaceWith($compile(element.html())(scope));
        });
  }

  return {
    restrict: 'E',  // usage directive as element
    replace: true,  // replace the directive tag e.g. <salesgrouptree> in the resulting html
    transclude: false,
    link: linker,
    controller: 'salesgrouptreeController'
  }
}]);
