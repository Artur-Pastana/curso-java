package com.condicionais;

import java.util.Scanner;

public class Condicionais {

	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("digite um numero inteiro:");
		int num = sc.nextInt();
		
		if (num % 2 == 0) {
			System.out.println(num+" � Par");
		}
		else{
			System.out.println(num+" � Impar");
		}
		
		System.out.println("entre com dois valores:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if ((a % b == 0 ) || (b % a == 0)) {
			System.out.println("S�o Multiplos");
		}
		else {
			System.out.println("n�o s�o multiplos");
		}
	}

}
