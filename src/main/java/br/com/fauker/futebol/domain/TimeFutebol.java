package br.com.fauker.futebol.domain;

public class TimeFutebol {

	private Long id;
	private String nome;
	private String divisao;
	
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
