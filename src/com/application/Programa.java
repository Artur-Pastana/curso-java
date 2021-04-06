package com.application;

import java.util.Scanner;

import com.entidades.Conta;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("numero da conta: ");
		Integer num = sc.nextInt();
		
		System.out.print("nome do titular: ");
		sc.nextLine();
		String nome = sc.nextLine();
		
		System.out.print("deseja fazer um depósito: ");
		char op = sc.next().charAt(0);
		
		System.out.println("certo");
		
		Double valor;
		
		Conta c1;
		
		if (op == 's') {
			System.out.print("entre com o valor do depósito: ");
			valor = sc.nextDouble();
			c1 = new Conta(num, nome, valor);
			System.out.println(c1);
		}
		else {
			c1 = new Conta(num, nome);
			System.out.println(c1);
		}
		
		System.out.print("entre com um deposito: ");
		valor = sc.nextDouble();
		c1.depositar(valor);
		System.out.println(c1);
		
		System.out.print("valor do saque: ");
		valor = sc.nextDouble();
		c1.sacar(valor);
		System.out.println(c1);
		
		
		
	}

}
