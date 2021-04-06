package com.poo;

public class Triangulo {
	
	public double a;
	public double b;
	public double c;
	
	public double area() {
		double p = (this.a + this.b + this.c) / 2.0;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}
	public void imprimir() {
		System.out.printf("Area Do Triangulo: %.4f%n", area());
	}

}
