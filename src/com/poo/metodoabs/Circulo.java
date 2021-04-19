package com.poo.metodoabs;

public class Circulo extends Figura {
	private Double raio;
	
	public Circulo() {
	}

	public Circulo(Double raio, String nome) {
		super.setNome(nome);
		this.raio = raio;
	}

	@Override
	public double area() {
		return Math.PI * this.raio * this.raio;
	}

	@Override
	public String toString() {
		return this.getNome()+
				"\nArea: "+String.format("%.2f", area());
	}
	
	
}
