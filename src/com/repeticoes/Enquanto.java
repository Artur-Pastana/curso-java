package com.repeticoes;

import java.util.Scanner;

public class Enquanto {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		int soma = 0;
		
		System.out.println("digite um valor");
		num  = sc.nextInt();
		while (num != 0) {
			soma += num;
			System.out.println("digite outro valor:");
			num = sc.nextInt();
			
			
		}
		System.out.println(soma);
		sc.close();
	}

}
