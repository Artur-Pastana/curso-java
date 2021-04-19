package com.poo.polimorfismo.exer;

public class ProdutoImportado extends Produto {
	
	private Double taxaAlfan;
	
	public ProdutoImportado() {
	}

	public ProdutoImportado(String nome, Double preco, Double taxaAlfan) {
		super(nome, preco);
		this.taxaAlfan = taxaAlfan;
	}


	public Double getTaxaAlfan() {
		return taxaAlfan;
	}

	public void setTaxaAlfan(Double taxaAlfan) {
		this.taxaAlfan = taxaAlfan;
	}
	
	@Override
	public String imprimirTag() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.getNome() + " R$");
		sb.append(this.getPreco() + this.taxaAlfan);
		sb.append(" (Taxa da alfandega: R$)"+String.format("%.2f", this.taxaAlfan));
		return sb.toString();
	}
}
