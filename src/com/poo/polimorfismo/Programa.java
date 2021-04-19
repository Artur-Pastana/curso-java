package com.poo.polimorfismo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Funcionario> funcionarios = new ArrayList<Funcionario>();
		System.out.print("Entre com o numero de Funcionarios: ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("Dados do Funcionarios #"+i);
			System.out.print("Tercerizado (s / n) ?: ");
			char op = sc.next().charAt(0);
			if (op == 'n') {
				sc.nextLine();
				System.out.print("nome: ");
				String nome = sc.nextLine();
				System.out.print("Horas: ");
				int horas = sc.nextInt();
				System.out.print("Valor por Hora: ");
				double valoHora = sc.nextDouble();
				Funcionario funcionario = new Funcionario(nome, horas, valoHora);
				funcionarios.add(funcionario);
			}
			else if (op == 's') {
				sc.nextLine();
				System.out.print("nome: ");
				String nome = sc.nextLine();
				System.out.print("Horas: ");
				int horas = sc.nextInt();
				System.out.print("Valor por Hora: ");
				double valoHora = sc.nextDouble();
				System.out.print("Despeza Adicional: ");
				double dispeza = sc.nextDouble();
				FuncionarioTercerizado funcionarioTercerizado = new FuncionarioTercerizado(nome, horas, valoHora, dispeza);
				funcionarios.add(funcionarioTercerizado);
			}
		}
		
		for (Funcionario f : funcionarios) {
			System.out.print(f.getNome()+ " - R$: "+String.format("%.2f", f.pagamento())+ "\n");
		}
		sc.close();
	}

}
