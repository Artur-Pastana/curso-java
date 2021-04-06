package com.entidades;

import java.util.Scanner;

public class Retangulo {
	Scanner sc = new Scanner(System.in);
	public double alt;
	public double larg;
	
	public double area() {
		return this.alt * this.larg;
	}
	
	public double perimetro() {
		double p = 2 * (this.alt + this.larg);
		return p;
	}
	
	public double diagonal() {
		double d = Math.pow(alt, 2.0) + Math.pow(larg, 2.0);
		return Math.sqrt(d);
	}
	
	public void entrar(double alt, double lar) {
		this.alt = alt;
		this.larg = lar;
	}
	
	@Override
	public String toString() {
		return "Dados do Triangulo\n"
				+ "Area: "
				+ String.format("%.2f\n",area())
				+ "Perimetro: "
				+ String.format("%.2f\n", perimetro())
				+ "Diagonal: "
				+ String.format("%.2f\n", diagonal());
				
	}
}
