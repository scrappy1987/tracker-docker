"use strict";

(function () {

    
    function TrainerService (trainerDal) {

        this.getTrainers = function()
        {
        	return trainerDal.getTrainers();
        };
        
        this.getTrainer = function(trainerId)
        {
        	return trainerDal.getTrainer(trainerId);
        };
        
    }
    
    angular.module("trainerApp").service("trainerService", ['trainerDal', TrainerService]);

}());