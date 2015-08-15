angular.module("timesFutebol").controller("listaTimesController", function ($scope, $http, listaTimesService) {
	$scope.times = [];
	
	var esconderFormulario = function () {
		$scope.formulario = false;
	};

	var carregarTimes = function () {
		listaTimesService.getTimes().success(function (data) {
			$scope.times = data;
		}).error (function (data) {
			$scope.error = "Deu treta!" + data;
		});
	};

	$scope.btnLimpar = function () {
		delete $scope.time;
	};

	$scope.cadastrar = function (time) {
		console.log("entrei no método cadastrar");
		listaTimesService.salvarTime(time).success(function (data) {
			delete $scope.time;
			carregarTimes();
		}).error (function (data) {
			$scope.error = "Erro ao excluir!" + data;
		});
	}

	$scope.mostrarFormulario = function () {
		$scope.formulario = true;
	}

	carregarTimes();
	esconderFormulario();
});