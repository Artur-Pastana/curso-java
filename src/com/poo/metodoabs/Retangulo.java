package com.poo.metodoabs;

public class Retangulo extends Figura {
	private Double alt;
	private Double larg;
	
	public Retangulo() {
	}
	
	

	public Retangulo(Double alt, Double larg, String nome) {
		super.setNome(nome);
		this.alt = alt;
		this.larg = larg;
	}
	
	@Override
	public double area() {
		return this.alt * this.larg;
	}



	@Override
	public String toString() {
		return this.getNome() +"\n"+
				"Area: "+String.format("%.2f", area());
	}
	
	
	

	
	
}
