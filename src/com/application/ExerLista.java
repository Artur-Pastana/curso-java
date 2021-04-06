package com.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.entidades.Empregado;

public class ExerLista {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com o numero de Registros: ");
		int n = sc.nextInt();
		
		List<Empregado> lista = new ArrayList<>();
		
		//Lendo dados
		
		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.println("Empregado #"+(i+1)+":");
			
			System.out.print("Id: ");
			int id = sc.nextInt();
			while (hasId(lista, id)) {
				System.out.print("Id ja existente. Tente de novo: ");
				id = sc.nextInt();
			}
			
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Salario: ");
			double salario = sc.nextDouble();
			lista.add(new Empregado(id, nome, salario));
		}
		
		for (Empregado empregado : lista) {
			System.out.println(empregado);
		}
		
		//Parte 2 Atualizando o salario
		System.out.println();
		System.out.println("Entre com o id de um empregado:");
		int id = sc.nextInt();
		Empregado emp = lista.stream().filter(x -> x.getId() == id)
				.findFirst().orElse(null);
		if (emp == null) {
			System.out.println("Esse Id não existe!");
		}
		else {
			System.out.print("Entre com a porcentagem: ");
			double porc = sc.nextDouble();
			emp.aumentarSalario(porc);
		}
		
		System.out.println("Lista de Empregados:");
		for (Empregado empregado : lista) {
			System.out.println(empregado);
		}
		
		sc.close();
	}
	public static boolean hasId(List<Empregado> list, int id) {
		Empregado emp = list.stream().filter(x -> x.getId() == id)
				.findFirst().orElse(null);
		return emp != null;
	}
}
