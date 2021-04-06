package com.repeticoes;

import java.util.Iterator;
import java.util.Scanner;

public class Para {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("digite o delimitador:");
		int n = sc.nextInt();
		int soma = 0;
		
		
		for(int i = 0; i < n; i++) {
			System.out.println("Entre com um valor");
			int temp = sc.nextInt();
			soma += temp;
		}
		System.out.println(soma);
	}

}
