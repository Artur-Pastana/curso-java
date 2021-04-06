package com.poo;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Triangulo x, y;
		
		x = new Triangulo();
		y = new Triangulo(); 
		
		System.out.println("Entrar com os valores de X");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Entrar com os valores de Y");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		/*double p = (x.a + x.b + x.c) / 2.0;
		double areaX = Math.sqrt(p *(p - x.a) * (p - x.b) * (p - x.c));
		
		p = (y.a + y.b + y.c) / 2.0;
		double areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));
		
		System.out.printf("Triangulo X area: %.4f%n", areaX);
		System.out.printf("Triangulo Y area: %.4f%n", areaY);
		*/
		double areaX = x.area();
		double areaY = y.area();
		
		x.imprimir();
		y.imprimir();
		
		
		if (areaX > areaY) {
			System.out.println("Maior Area de X");
		}
		else {
			System.out.println("Mairo area de Y");
		}
		
		sc.close();
	}

}
