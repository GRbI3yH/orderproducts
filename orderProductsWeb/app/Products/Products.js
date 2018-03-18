'use strict';

angular.module('app.Products', ['ngRoute'])

.config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/Products', {
    templateUrl: 'Products/Products.html',
    controller: 'ProductsCtrl'
  });
}])

.controller('ProductsCtrl', function($scope) {

    $scope.products = [{
      code:"1",
      name:"Имя",
      provider:"provider",
      category:"category",
      amount:"amount",
      price:"3242623426",
      manufacturer:"manufacturer"
    },{
      code:"2",
      name:"про",
      provider:"provider2",
      category:"category2",
      amount:"amount2",
      price:"11113151",
      manufacturer:"manufacturer2"
  }];

});