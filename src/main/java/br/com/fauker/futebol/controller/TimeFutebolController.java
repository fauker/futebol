package br.com.fauker.futebol.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.fauker.futebol.domain.TimeFutebol;
import br.com.fauker.futebol.service.TimeFutebolService;

@Controller
public class TimeFutebolController {

	@Autowired 
	private TimeFutebolService timeFutebolService;
	
	@ResponseBody
	@RequestMapping(value = "/futebol/times", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<TimeFutebol> obterTodos() {
		return this.timeFutebolService.getTimeFutebolRepository().findAll();
	}
	
}
