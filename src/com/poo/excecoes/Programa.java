package com.poo.excecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		metodo1();
		System.out.println("o programa parou?");
		sc.close();
	}
	public static void metodo1() {
		System.out.println("***Metodo 1 start***");
		metodo2();
		System.out.println("***Metodo 1 end");
	}
	public static void metodo2() {
		System.out.println("***METODO2 INICIOU***");
		Scanner sc = new Scanner(System.in);
		try {
			String[] vet = sc.nextLine().split(" ");
			int pos = sc.nextInt();
			System.out.println(vet[pos]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("erro: posicão inválida");
			e.printStackTrace();
			sc.next();
		}
		catch (InputMismatchException e) {
			System.out.println("erro de entrada");
		}
		System.out.println("***Metodo2 End***");
	}

}
