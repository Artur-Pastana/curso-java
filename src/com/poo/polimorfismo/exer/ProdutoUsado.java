package com.poo.polimorfismo.exer;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoUsado extends Produto {
	
	private Date dataFab;
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
	
	public ProdutoUsado() {
	}

	public ProdutoUsado(String nome, Double preco, Date dataFab) {
		super(nome, preco);
		this.dataFab = dataFab;
	}

	public Date getDataFab() {
		return dataFab;
	}

	public void setDataFab(Date dataFab) {
		this.dataFab = dataFab;
	}
	
	@Override
	public String imprimirTag() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.getNome()+ "(usado) ");
		sb.append("R$: "+this.getPreco());
		sb.append("(Data de fabricação: ");
		sb.append(this.dataFab+"");
		sb.append(" )");
		return sb.toString();
	}
	
}
