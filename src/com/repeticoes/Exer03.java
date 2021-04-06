package com.repeticoes;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int op;
		int qtdA = 0;
		int qtdG = 0;
		int qtdD = 0;
		System.out.println("Dentre a opções de combustivel"
				+ " Escolha:\n"
				+ "1 - Alcool\n"
				+ "2 - Gasolina\n"
				+ "3 - Diesel:\n"
				+ "4 - Sair");
		op = sc.nextInt();
		while ((op >= 1 && op < 4) && op != 4 ) {
			if (op == 1) {
				qtdA += 1;
				System.out.println("escolha novamente");
				op = sc.nextInt();
			}
			else if (op == 2) {
				qtdG += 1;
				System.out.println("escolha novamente");
				op = sc.nextInt();
			}
			else if (op == 3) {
				qtdD += 1;
				System.out.println("escolha novamente");
				op = sc.nextInt();
			}
		}
		System.out.println("Muito Obrigado\n"
				+ "Alcool: "+qtdA+"\n"
				+ "Gasolina: "+qtdG+"\n"
				+ "Diesel: "+qtdD);
	}

}
