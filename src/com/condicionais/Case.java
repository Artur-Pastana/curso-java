package com.condicionais;

import java.util.Scanner;

public class Case {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("entre com do dia da semana:");
		int x = sc.nextInt();
		String dia = "";
		
		switch (x) {
		case 1:
			dia = "domingo";
			break;
		case 2:
			dia = "segunda";
			break;
		case 3:
			dia = "terça";
			break;
		case 4:
			dia = "quarta";
			break;
		case 5:
			dia = "quinta";
			break;
		case 6:
			dia = "sexta";
			break;
		case 7:
			dia = "sabado";
			break;
		default:
			dia = "dia invalido";
			break;
		}
		System.out.println("dia da semana: "+dia);
		
		
		
	}

}
