package com.application;

import java.util.Scanner;

import com.entidades.Product;

public class Vetor02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		Product[] vet = new Product[n];
		
		for (int i = 0; i < vet.length; i++) {
			sc.nextLine();
			String nome = sc.nextLine();
			double preco = sc.nextDouble();
			vet[i]  = new Product(nome, preco);
		}
		double soma = 0;
		
		for (int i = 0; i < vet.length; i++) {
			soma += vet[i].getPreco();
		}
		double med = soma / n;
		
		System.out.printf("Media de preços: %.2f%n",med);
		
		sc.close();

	}

}
