'use strict';

angular.module('app.Order', ['ngRoute'])

.config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/Order', {
    templateUrl: 'Order/Order.html',
    controller: 'OrderCtrl'
  });
}])

.controller('OrderCtrl', function() {

});