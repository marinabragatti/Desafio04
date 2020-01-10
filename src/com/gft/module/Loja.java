package com.gft.module;

import java.util.List;

public class Loja {
	
	private String nome;
	
	private String cnpj;
	
	List <Livro> livros;
	
	List <VideoGame> videoGames;

	//Getters and Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public List<Livro> getLivros() {
		return livros;
	}

	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}

	public List<VideoGame> getVideoGames() {
		return videoGames;
	}

	public void setVideoGames(List<VideoGame> videoGames) {
		this.videoGames = videoGames;
	}
	
	//Construtores
	public Loja() {
		super();
	}

	public Loja(String nome, String cnpj, List<Livro> livros, List<VideoGame> videoGames) {
		super();
		this.nome = nome;
		this.cnpj = cnpj;
		this.livros = livros;
		this.videoGames = videoGames;
	}
	
	//Métodos
	public void listaLivros() {
		System.out.println("\n----------------------------------------------------------");
		System.out.println("A loja " + getNome() + " possui estes livros para venda:");
		for(Livro index : livros) {
			if(index.getQtde() != 0)
				System.out.println("Titulo: " + index.getNome() + ", preço: " + index.getPreco() + ", quantidade: " + index.getQtde() + " em estoque");
			else
				System.out.println("A loja não tem livros no seu estoque.");
		}
	}
	
	public void listaVideoGames() {
		System.out.println("\n----------------------------------------------------------");
		System.out.println("A loja " + getNome() + " possui estes video-games para venda:");
		for(VideoGame index : videoGames) {
			if(index.getQtde() != 0)
				System.out.println("Video-game: " + index.getNome() + ", preço: " + index.getPreco() + ", quantidade: " + index.getQtde() + " em estoque");
			else
				System.out.println("A loja não tem video-games no seu estoque.");
		}
	}
	
	public double calculaPatrimonio() {
		double patrimonio = 0;
		
		if(livros.size() == 0)
			patrimonio = 0;
		else
			for(Livro index : livros) {
				patrimonio = patrimonio + (index.getQtde() * index.getPreco());
			}
		if(videoGames.size() == 0)
			patrimonio += 0;
		else
			for(VideoGame index : videoGames) {
				patrimonio = patrimonio + (index.getQtde() * index.getPreco());
			}
		System.out.println("----------------------------------------------------------------");
		System.out.println("O patrimonio da loja: " + getNome() + " é de R$ " + patrimonio);
		return patrimonio;
	}

}
