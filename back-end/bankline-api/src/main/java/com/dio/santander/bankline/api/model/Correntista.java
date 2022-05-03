package com.dio.santander.bankline.api.model;

public class Correntista {

	private Integer id;
	private String cpf;
	private String nome;
	
	private Conta conta;
	
	public Correntista() {
		
	}
	
	public Correntista(Integer id, String cpf, String nome, Conta conta) {
		super();
		this.id = id;
		this.cpf = cpf;
		this.nome = nome;
		this.conta = conta;
	}

	public Conta getConta() {
		return conta;
	}
	
	public void setConta(Conta conta) {
		this.conta = conta;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
