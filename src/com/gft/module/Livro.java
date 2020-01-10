package com.gft.module;

import com.gft.interfaces.Impostos;

public class Livro extends Produto implements Impostos{

	private String autor;
	
	private String tema;
	
	private int qtdePag;
	
	//Getters and Setters
	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public int getQtdePag() {
		return qtdePag;
	}

	public void setQtdePag(int qtdePag) {
		this.qtdePag = qtdePag;
	}
	
	//Construtores
	public Livro() {
		super();
	}
	
	public Livro(String nome, double preco, int qtde, String autor, String tema, int qtdePag) {
		super(nome, preco, qtde);
		this.autor = autor;
		this.tema = tema;
		this.qtdePag = qtdePag;
	}

	//Métodos
	@Override
	public double calculaImposto() {
		double imposto = 0;
		if(this.tema == "educativo")
			System.out.println("Livro educativo não tem imposto: " + getNome());
		else {
			imposto = getPreco() * 0.10;
			System.out.println("R$ " + imposto + " de impostos sobre o livro" + getNome());
		}
		return 0;
	}
	
}
