package br.com.fauker.futebol.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fauker.futebol.domain.TimeFutebol;
import br.com.fauker.futebol.repository.TimeFutebolRepository;

@Service
public class TimeFutebolService {

	@Autowired
	private TimeFutebolRepository timeFutebolRepository;
	
	public TimeFutebolRepository getTimeFutebolRepository() {
		return timeFutebolRepository;
	}

	public void excluir(Long id) {
		TimeFutebol timeFutebol = this.timeFutebolRepository.findOne(id);
		this.timeFutebolRepository.delete(timeFutebol);
	}
	
}
