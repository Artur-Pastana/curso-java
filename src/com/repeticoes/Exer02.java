package com.repeticoes;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com as coordenadas:");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		while (x != 0 && y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("Primeiro");
			}
			else if (x < 0 && y > 0) {
				System.out.println("Segundo");
			}
			else if (x < 0 && y < 0) {
				System.out.println("Terceiro");
			}
			else if (x > 0 && y < 0) {
				System.out.println("Quarto");
			}
			System.out.println("Digite outras coordenadas");
			x = sc.nextInt();
			y = sc.nextInt();
		}

	}

}
