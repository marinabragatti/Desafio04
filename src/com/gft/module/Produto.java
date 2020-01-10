package com.gft.module;

public abstract class Produto {
	
	private String nome;
	
	private double preco;
	
	private int qtde;

	//Getters and Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQtde() {
		return qtde;
	}

	public void setQtde(int qtde) {
		this.qtde = qtde;
	}
	
	
	//Construtores
	public Produto() {
		super();
	}

	public Produto(String nome, double preco, int qtde) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.qtde = qtde;
	}

	//Métodos
	
}
