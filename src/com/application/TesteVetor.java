package com.application;

import java.util.Scanner;

public class TesteVetor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double[] vet = new double[n];
		
		for (int i = 0; i < vet.length; i++) {
			System.out.println("entre com a "+(i+1)+"º altura:");
			vet[i] = sc.nextDouble();
		}
		
		double soma = 0.0;
		
		for (int i = 0; i < vet.length; i++) {
			soma += vet[i];
		}
		
		double med = soma / 3;
		
		System.out.println("Media de altura: "+med);
		
		
		sc.close();
		
		

	}

}
