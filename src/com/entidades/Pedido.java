package com.entidades;

public class Pedido {
	
	private Integer qtd;
	private Double preco;
	
	private Product product;
	
	public Pedido() {
	}
	public Pedido(Integer qtd, Double preco, Product product) {
		
		this.qtd = qtd;
		this.preco = preco;
		this.product = product;
	}

	public Integer getQtd() {
		return qtd;
	}

	public void setQtd(Integer qtd) {
		this.qtd = qtd;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	public double subTotal() {
		return this.preco * this.qtd;
	}
	
	@Override
	public String toString() {
		return this.product.getNome()
				+ ", R$"
				+ String.format("%.2f", this.preco)
				+ ", Qtd: "
				+ this.qtd
				+" Subtotal: R$"
				+ String.format("%.2f", subTotal());
	}
}
