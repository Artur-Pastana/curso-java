package com.poo.metodoabs.exer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Contribuinte> lista = new ArrayList<Contribuinte>();
		
		System.out.print("entre com a qtd de Contribuintes:");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Dados do Contribuinte #"+i);
			System.out.print("Individual ou Empresa (i / e)? ");
			char op = sc.next().charAt(0);
			if (op == 'i') {
				sc.nextLine();
				System.out.print("Nome: ");
				String nome = sc.nextLine();
				System.out.print("Renda Anual: ");
				double rendaAnual = sc.nextDouble();
				System.out.print("Gastos com Saude: ");
				double gastos = sc.nextDouble();
				Contribuinte ind = new Individual(nome, rendaAnual, gastos);
				lista.add(ind);
			}
			else if (op == 'e') {
				sc.nextLine();
				System.out.print("Nome: ");
				String nome = sc.nextLine();
				System.out.print("Renda Anual: ");
				double rendaAnual = sc.nextDouble();
				System.out.print("Numeros de Funcionarios: ");
				int numFun = sc.nextInt();
				Contribuinte emp = new Empresa(nome, rendaAnual, numFun);
				lista.add(emp);
			}
		}
		
		for (Contribuinte c : lista) {
			System.out.println(c.getNome()+"\n"
					+String.format("%.2f", c.getRendaAnual())+"\n"+
					String.format("%.2f", c.imposto()));
		}
		
		double totalCont = 0;
		for (Contribuinte c : lista) {
			totalCont += c.imposto();
		}
		
		System.out.println("Total Contribuintes: "+String.format("%.2f", totalCont));
	}

}
