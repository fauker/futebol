angular.module("timesFutebol").service("listaTimesService", function ($http, config) {
	this.getTimes = function () {
		return $http.get(config.baseUrl + "times/todos");
	};

	this.salvarTime = function (time) {
		return $http.post(config.baseUrl + "times/cadastrar", time);
	};
});
