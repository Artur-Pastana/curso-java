package com.condicionais;

import java.util.Scanner;

public class Condicionais {

	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("digite um numero inteiro:");
		int num = sc.nextInt();
		
		if (num % 2 == 0) {
			System.out.println(num+" é Par");
		}
		else{
			System.out.println(num+" é Impar");
		}
		
		System.out.println("entre com dois valores:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if ((a % b == 0 ) || (b % a == 0)) {
			System.out.println("São Multiplos");
		}
		else {
			System.out.println("não são multiplos");
		}
	}

}
