package movieSort.model;

import java.util.Scanner;

public abstract class Midia {
	private String nome, sinopse, atores;
	int genero;
	private double imdb;
	private int ano, tipo;
	
	
	public Midia(String nome, String sinopse, String atores, double imdb, int ano,int genero, int tipo) {
		this.nome = nome;
		this.sinopse = sinopse;
		this.atores = atores;
		this.imdb = imdb;
		this.ano = ano;
		this.genero = genero;
		this.tipo = tipo;
	}

	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSinopse() {
		return sinopse;
	}

	
	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}

	public String getAtores() {
		return atores;
	}

	public void setAtores(String atores) {
		this.atores = atores;
	}

	public String getGenero() {
		
		switch(genero)
		{
		 case 1 -> {return "Romance";} 
		 case 2 -> {return "Terror";} 
		 case 3 -> {return "Comedia";} 
		 default ->{return null;}
		}
	}

	public double getImdb() {
		return imdb;
	}

	public void setImdb(double imdb) {
		this.imdb = imdb;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	
	public String getTipo() {
		switch(this.tipo) {
		case 1 -> {return "Serie";} 
		case 2 -> {return "Filme";} 
		default ->{return "teste";}
		}
		
		
	}
	
	
	public void visualizar() {

		System.out.println("Nome: " + this.nome);
		System.out.println("Sinopse: " + this.sinopse);
		System.out.println("Atores Principais: " + this.atores);
		System.out.println("Avaliação: " + this.imdb);
		System.out.println("Ano de Lançamento: " + this.ano);
		System.out.println("Genero: " + this.getGenero());
		System.out.println("Tipo de midia: " + this.getTipo());
		
	}
	
	
}
