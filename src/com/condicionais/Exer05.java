package com.condicionais;

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Cod -  Produto  -     Preço");
		System.out.println("1 - Cachorro Quente - R$: 4,00\n"
							+"2 - X-salada  -     R$: 4,50\n"
							+"3 - X-bacon  -      R$: 5,00\n"
							+"4 - Torrada simples - R$: 2,00\n"
							+"5 - Refrigerante  -  R$: 1,50");
		System.out.println("Escolha o Cod do produto:");
		int cod = sc.nextInt();
		System.out.println("Escolha a qtd:");
		double qtd = sc.nextInt();
		
		if (cod == 1) {
			System.out.println("Total: "+qtd*4);
		}
		else if (cod == 2) {
			System.out.println("Total: "+qtd*4.50);
		}
		else if (cod == 3) {
			System.out.println("Total: "+qtd*5);
		}
		else if (cod == 4) {
			System.out.println("Total: "+qtd*2);
		}
		else if (cod == 5) {
			System.out.println("Total: "+qtd*1.50);
		}
	}

}
