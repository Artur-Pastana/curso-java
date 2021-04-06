package com.funcoes;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a,b,c;
		System.out.println("Digite 3 valores:");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		int max = maior(a, b, c);
		
		imprimir(max);
		
	}
	
	public static int maior(int x, int y, int z) {
		int maior = 0;
		if ((x > y) && (x > z)) {
			maior = x;
		}
		else if ((y > x) && (y > z)) {
			maior = y;
		}
		else if ((z > x) && (z > y)) {
			maior = z;
		}
		return maior;
	}
	
	public static void imprimir(int valor) {
		System.out.println(valor);
	}

}
