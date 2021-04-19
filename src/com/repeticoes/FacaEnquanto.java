package com.repeticoes;

import java.util.Scanner;

public class FacaEnquanto {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// F = (9c / 5) + 32;
		double c, f;
		char op = 's';
		
		while (op != 'n') {
			//System.out.println("Digite a temperatura em Celsius:");
			c = sc.nextDouble();
			f = ((9.0 * c)/5) + 32;
			System.out.printf("Equivalente em Fahrenheit: %.2f%n",f);
			
			System.out.print("deseja repetir (s / n)? ");
			op = sc.next().charAt(0);
		}
		System.out.println("terminou o while");
		do {
			System.out.print("Digite a temperatura em Celsius:");
			c = sc.nextDouble();
			f = ((9.0 * c)/5) + 32;
			System.out.printf("Equivalente em Fahrenheit: %.2f%n",f);
			
			System.out.print("deseja repetir (s / n)? ");
			op = sc.next().charAt(0);
		} while (op != 'n');
		System.out.println("Terminou o programa!!");
		
		sc.close();

	}

}
