package com.gft.module;

import com.gft.interfaces.Impostos;

public class VideoGame extends Produto implements Impostos{
	
	private String marca;
	
	private String modelo;
	
	private boolean isUsado;

	//Getters and Setters
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public boolean isUsado() {
		return isUsado;
	}

	public void setUsado(boolean isUsado) {
		this.isUsado = isUsado;
	}

	//Construtores
	public VideoGame() {
		super();
	}

	public VideoGame(String nome, double preco, int qtde, String marca, String modelo, boolean isUsado) {
		super(nome, preco, qtde);
		this.marca = marca;
		this.modelo = modelo;
		this.isUsado = isUsado;
	}		
	
	//Métodos
	@Override
	public double calculaImposto() {
		double imposto = 0;
		if(isUsado) {
			imposto = getPreco() * 0.25;
			System.out.println("Imposto " + getNome() + " " + getModelo() + " " + "usado" + " R$ " + imposto);
		}
		else {
			imposto = getPreco() * 0.45;
			System.out.println("Imposto " + getNome() + " " + getModelo() + " " + " R$ " + imposto);
		}
		return 0;
	}
	
	
}
