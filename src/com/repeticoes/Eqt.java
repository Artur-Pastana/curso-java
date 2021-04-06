package com.repeticoes;

import java.util.Scanner;

public class Eqt {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int senha = 2728;
		int valor;
		
		System.out.println("digite a senha por favor:");
		valor = sc.nextInt();
		
		while (valor != senha) {
			System.out.println("Acesso negado");
			System.out.println("tente novamente:");
			valor = sc.nextInt();
		}
		System.out.println("Acesso Permitido");

	}

}
