package com.entidades;

public class Produto {
	
	public String nome;
	public double preco;
	public int qtd;
	
	public Produto() {
	}
	public Produto(String nome, double preco, int qtd) {
		this.nome = nome;
		this.preco = preco;
		this.qtd = qtd;
	}

	public double TotValorEstq() {
		return this.preco * this.qtd;
	}
	
	public void addProd(int qtd) {
		this.qtd += qtd;
	}
	
	public void removerProd(int qtd) {
		this.qtd -= qtd;
	}
	
	public String imprimir() {
		return this.nome
				+", $"
				+ String.format("%.2f", this.preco)
				+ ", "
				+ this.qtd
				+ " unidades, Total : $ "
				+ String.format("%.2f", TotValorEstq());
	}
	@Override
	public String toString() {
		return this.nome
				+"; $"
				+ String.format("%.2f", this.preco)
				+ "; "
				+ this.qtd
				+ " unidades; Total : $ "
				+ String.format("%.2f", TotValorEstq());
	}
}
