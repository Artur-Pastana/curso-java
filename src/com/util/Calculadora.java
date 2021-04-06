package com.util;

public class Calculadora {
	
	public static final double PI = 3.14159;
	
	public static double circun(double raio) {
		return 2 * Math.PI * raio;
	}
	
	public static double volume(double raio) {
		return (Math.pow(raio, 3) * 4 * Math.PI) / 3;
	}
}
