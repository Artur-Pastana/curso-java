package com.repeticoes;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double larg = sc.nextDouble();
		double comp = sc.nextDouble();
		double mtQd = sc.nextDouble();
		
		double area  = larg * comp;
		double preco = area * mtQd;
		
		System.out.printf("Area = %.2f%n",area);
		System.out.printf("Preço = %.2f%n",preco);
		
		sc.close();

	}

}
