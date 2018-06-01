"use strict";

(function() {

    var TrainerController =  function(trainerService, $log, $state) {
        
    	var vm = this;
        
        vm.isHidden = false;
        
        vm.hideTable = function()
        {
        	vm.isHidden = !vm.isHidden
        };

        vm.changeState = function(trainerId)
        {
            console.log("This is the value of trainerId " + trainerId);
            var paramObj = {obj:trainerId};
        	$state.go('info', paramObj);
        };
        
        function init() {
        	trainerService.getTrainers().then(function (results) {
           	vm.trainers = results;
           	$log.log("In the trainer controller the value of the result promise is ");
        	$log.log(JSON.stringify(vm.trainers));
            }, function (error) {
                vm.error = true;
                vm.errorMessage = error;
            });
       }
       
       init();
            
    };

    angular.module('trainerApp').controller('trainerController', ['trainerService','$log','$state', TrainerController]);
}());