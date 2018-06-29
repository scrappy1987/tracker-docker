"use strict";

(function () {

    function TrainerDal (dal) {

        this.getTrainers = function () {
            return dal.http.GET("trainer/getAllTrainers");
        };
        
        this.getTrainer = function (trainerId) {
            return dal.http.GET("trainer/getTrainer/" + trainerId);
        };

        this.saveTrainer = function (trainerToSave) {
            return dal.http.POST("rest/trainer/json", trainerToSave);
        };

        this.updateTrainer = function (trainerToUpdate) {
            return dal.http.PUT("rest/trainer/json/", trainerToUpdate);
        };

        this.deleteTrainer = function (trainerToDelete) {
            return dal.http.DELETE("/rest/trainer/json/", trainerToDelete);
        };
    }
    
    angular.module("trainerApp").service("trainerDal", ["dal", TrainerDal]);
}());