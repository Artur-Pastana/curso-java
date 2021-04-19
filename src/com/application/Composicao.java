package com.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.entidades.ContratoHora;
import com.entidades.Departamento;
import com.entidades.Trabalhador;
import com.entidades.enums.NivelTrabalho;

public class Composicao {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Entre com o nome do departamento: ");
		String nomeDep = sc.nextLine();
		System.out.println("Entre com os dados do trabalhador:");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Nível: ");
		String nivel = sc.nextLine();
		System.out.print("Base Salarial: ");
		double salario = sc.nextDouble();
		Trabalhador trabalhador = new Trabalhador(nome, NivelTrabalho.valueOf(nivel), salario, new Departamento(nomeDep));
		
		System.out.print("Quantos contratos "+trabalhador.getNome()+" vai ter: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Entre com os dados do #"+i+"º Contrato");
			System.out.print("Data (DD/MM/YYYY): ");
			Date conDate = sdf.parse(sc.next());
			System.out.print("Valor por hora: ");
			double valorHora = sc.nextDouble();
			System.out.print("Duração (horas): ");
			int horas = sc.nextInt();
			ContratoHora contratoHora = new ContratoHora(conDate, valorHora, horas);
			trabalhador.addContratos(contratoHora);
		}
		System.out.println();
		System.out.print("Entre com mes e ano para calcular a renda (MM/YYYY): ");
		String mesEano = sc.next();
		int mes = Integer.parseInt(mesEano.substring(0, 2));
		int ano = Integer.parseInt(mesEano.substring(3));
		System.out.println("Nome: "+trabalhador.getNome());
		System.out.println("Departamento: "+trabalhador.getDepartamento().getNome());
		System.out.println("Renda de "+ mes +": "+ String.format("%.2f ", trabalhador.renda(ano, mes)));
		
		sc.close();
	}

}
