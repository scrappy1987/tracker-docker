(function() {

    var InfoController =  function(trainerService, $stateParams, $log) {
        
    	var vm = this;
    	
    	vm.test = "this is a test";
    	
    	function init()
    	{	
    		var trainerId = $stateParams.obj
    		console.log("This is the value of trainerId" + trainerId);
    		trainerService.getTrainer(trainerId).then(function (results) {
               	vm.trainer = results;
               	$log.log("In the trainer controller the value of the result promise is ");
            	$log.log(JSON.stringify(vm.trainer));
                }, function (error) {
                    vm.error = true;
                    vm.errorMessage = error;
                });
    	}
         
         init();
    	
    };

    angular.module('trainerApp').controller('infoController', ['trainerService', '$stateParams', '$log', InfoController]);
}());