package com.application;

import java.util.Scanner;

import com.entidades.Quarto;

public class Exer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Quarto[] vet = new Quarto[10];
		
		System.out.println("Quantos quartos desejar alugar?");
		int n = sc.nextInt();
		
		for (int i = 1 ; i <= n; i++) {
			System.out.println();
			System.out.println("Quarto #"+(i+1)+":");
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Quarto: ");
			int quarto = sc.nextInt();
			vet[quarto] = new Quarto(nome, email);
		}
		
		System.out.println();
		System.out.println("Quartos alugados");
		for (int i = 0; i < vet.length; i++) {
			if (vet[i] != null) {
				System.out.println(i+"; "+ vet[i]);
			}
		}
		
		sc.close();
	}
}
