package com.condicionais;

import java.util.Scanner;

public class OperCumulativo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("entre com os minutos usados");
		double min = sc.nextDouble();
		double valorUnt = 50.00;
		
		if (min <= 100) {
			System.out.printf("Total a pagar: R$ %.2f", valorUnt);
		}
		else if (min > 100) {
			double vExtra = (min - 100) * 2;
			valorUnt += vExtra;
			System.out.printf("Total a pagar: R$: %.2f",valorUnt);
		}
	}

}
