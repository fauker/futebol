package br.com.fauker.futebol.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fauker.futebol.repository.TimeFutebolRepository;

@Service
public class TimeFutebolService {

	@Autowired
	private TimeFutebolRepository timeFutebolRepository;
	
	public TimeFutebolRepository getTimeFutebolRepository() {
		return timeFutebolRepository;
	}
	
}
