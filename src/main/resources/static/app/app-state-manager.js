"use strict";

(function () {

    angular.module('trainerApp').config(function ($stateProvider, $urlRouterProvider) {
        $urlRouterProvider.otherwise("/dashboard");

        $stateProvider.state("dashboard", {
            url: "/dashboard",
            templateUrl: "app/feature/dashboard/dashboard.html"
        }).state("trainers", {
                url: "/trainers",
                templateUrl: "app/feature/trainer/trainer.html"
        }).state("info", {
            url: "/info",
            templateUrl: "app/feature/trainer/info.html",
            params: {
                obj: null
            }
    })
    });
}());