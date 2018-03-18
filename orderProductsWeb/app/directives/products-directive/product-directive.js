'use strict';

angular.module('tko.ef-rtko-r-item', ['ngRoute'])
    .directive('efRtkoRItem',
        function () {
            return {
                restrict: 'E',
                scope: {
                    item: '='
                },
                templateUrl: 'directives/ef-rtko-r-item/ef-rtko-r-item.tpl.html',
                controller: 'efRtkoRItemCtrl'

            };
        }
    )

    .controller('efRtkoRItemCtrl',
        function () {

        });