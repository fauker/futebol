package br.com.fauker.futebol.controller;

import java.util.List;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.fauker.futebol.domain.TimeFutebol;
import br.com.fauker.futebol.service.TimeFutebolService;

@Controller
@RequestMapping(value = "times/**")
public class TimeFutebolController {
	
	private static Logger logger = Logger.getLogger(TimeFutebolController.class);
	
	@Autowired
	private TimeFutebolService timeFutebolService;

	@RequestMapping(value = "/listar", method = RequestMethod.GET)
	public String home() {
		
		logger.debug("entrando na página de listagem os times de futebol");
		
		return "/WEB-INF/views/times.html";
	}
	
	@ResponseBody
	@RequestMapping(value = "/todos", method = RequestMethod.GET)
	public ResponseEntity<List<TimeFutebol>> obterTodos() {
		
		logger.debug("iniciando a busca pelos times de futebol");
		
		List<TimeFutebol> timesFutebol = timeFutebolService.getTimeFutebolRepository().findAll();
		
		logger.debug("busca pelos times de futebol finalizada");
		
		return new ResponseEntity<>(timesFutebol, HttpStatus.OK);
	}
	
	@ResponseBody
	@RequestMapping(value = "/cadastrar", method = RequestMethod.POST)
	public ResponseEntity<List<TimeFutebol>> cadastrar(@RequestBody TimeFutebol timeFutebol) {
		try {
			logger.debug("salvando um time de futebol");
			
			this.timeFutebolService.getTimeFutebolRepository().save(timeFutebol);
			
		} catch (Exception e) {
			logger.error(e);
		}
		return obterTodos();
	}
	
}
