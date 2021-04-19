package com.poo.polimorfismo.exer;

public abstract class Produto {
	
	private String nome;
	private Double preco;
	
	public Produto() {
	}

	public Produto(String nome, Double preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	public String imprimirTag() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.nome+" R$: ");
		sb.append(this.preco+" ");
		return sb.toString();
	}
}
