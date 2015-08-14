angular.module("timesFutebol").controller("listaTimesController", function ($scope, $http) {
	$scope.times = [];

	var carregarTimes = function () {
		$http.get("http://localhost:8080/futebol/pages/times/todos").success(function (data) {
			$scope.times = data;
		}).error (function (data) {
			$scope.error = "Deu treta!" + data;
		});
	};

	var cadastrar = function (time) {
		$http.post("http://localhost:8080/futebol/pages/times/todos", time).success(function (data) {
			carregarTimes();
		}).error (function (data) {
			$scope.error = "Erro ao excluir!" + data;
		});
	}

	carregarTimes();
});