package com.condicionais;

import java.util.Scanner;

public class Exer06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com um numero de 0 a 100");
		double valor = sc.nextDouble();
		
		if (valor > 0 && valor <= 25) {
			System.out.println("intevalo [0 , 25]");
		}
		else if (valor > 25 && valor <= 50) {
			System.out.println("intervalo [25, 50]");
		}
		else if (valor > 50 && valor <= 100) {
			System.out.println("intervalo [50, 100]");
		}

	}

}
