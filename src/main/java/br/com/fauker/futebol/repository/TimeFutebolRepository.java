package br.com.fauker.futebol.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fauker.futebol.domain.TimeFutebol;


public interface TimeFutebolRepository extends JpaRepository<TimeFutebol, Long>{
	
}
