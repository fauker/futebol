package br.com.fauker.futebol.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "TIME_FUTEBOL")
@Entity
public class TimeFutebol {

	@Id
	@GeneratedValue
	private Long id;
	
	private String nome;
	
	private String divisao;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getDivisao() {
		return divisao;
	}
	
	public void setDivisao(String divisao) {
		this.divisao = divisao;
	}
	
}
