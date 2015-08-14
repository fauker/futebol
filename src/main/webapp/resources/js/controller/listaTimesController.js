angular.module("timesFutebol").controller("listaTimesController", function ($scope, $http, listaTimesService) {
	$scope.times = [];

	var carregarTimes = function () {
		listaTimesService.getTimes().success(function (data) {
			$scope.times = data;
		}).error (function (data) {
			$scope.error = "Deu treta!" + data;
		});
	};

	$scope.cadastrar = function (time) {
		console.log("entrei no método cadastrar");
		listaTimesService.salvarTime(time).success(function (data) {
			carregarTimes();
		}).error (function (data) {
			$scope.error = "Erro ao excluir!" + data;
		});
	}

	carregarTimes();
});