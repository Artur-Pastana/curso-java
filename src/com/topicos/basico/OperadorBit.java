package com.topicos.basico;

import java.util.Scanner;

public class OperadorBit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*Operador		Significado
		 * &				opera��o "E" bit a bit
		 * |				opera��o "OU" bit a bit
		 * ^				opera��o "OU-Exclusivo / XOR" bit a bit
		 */
		boolean v = true;
		boolean f = false;
		
		System.out.printf("F & F: %b%n", f & f);
		System.out.printf("F & V: %b%n", f & v);
		System.out.printf("V & F: %b%n", v & f);
		System.out.printf("V & V: %b%n", v & v);
		System.out.println();
		System.out.printf("V | V: %b%n", v | v);
		System.out.printf("V | F: %b%n", v | f);
		System.out.printf("F | V: %b%n", f | v);
		System.out.printf("F | F: %b%n", f | f);
		System.out.println();
		System.out.printf("V ^ V: %b%n", v ^ v);
		System.out.printf("V ^ F: %b%n", v ^ f);
		System.out.printf("F ^ V: %b%n", f ^ v);
		System.out.printf("F ^ F: %b%n", f ^ f);
		
		System.out.println(89 ^ 60);
		
		int n = sc.nextInt();
		int masc = 32;
		
		if ((n & masc) != 0) {
			System.out.println("Sexto bit � verdadeiro");
		}
		else {
			System.out.println("Sexto bit � falso");
		}
		
		

	}

}
