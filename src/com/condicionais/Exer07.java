package com.condicionais;

import java.util.Scanner;

public class Exer07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com coordenada x:");
		double x = sc.nextDouble();
		System.out.println("entre com a coordenada y:");
		double y = sc.nextDouble();
		
		if (x > 0 && y > 0) {
			System.out.println("Q1");
		}
		else if (x < 0 && y > 0) {
			System.out.println("Q2");
		}
		else if (x < 0 && y < 0) {
			System.out.println("Q3");
		}
		else if (x > 0 && y < 0) {
			System.out.println("Q4");
		}
		else if (x == 0 && y == 0) {
			System.out.println("Origem");
		}
	}

}
