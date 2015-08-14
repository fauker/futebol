angular.module("timesFutebol").service("listaTimesService", function ($http) {
	this.getTimes = function () {
		return $http.get("http://localhost:8080/futebol/pages/times/todos");
	};

	this.salvarTime = function (time) {
		return $http.post("http://localhost:8080/futebol/pages/times/cadastrar", time);
	};
});
