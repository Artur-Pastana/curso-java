package com.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reserva;

public class Solucao2 {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("numero do quarto: ");
		int numero = sc.nextInt();
		System.out.print("Data de entrada (dd/MM/yyyy): ");
		Date entrada = sdf.parse(sc.next());
		System.out.print("Data de saida (dd/MM/yyyy): ");
		Date saida = sdf.parse(sc.next());
		
		if (!saida.after(entrada)) {
			System.out.println("Erro na reserva: data de saida é anterior a entrada");	
		}
		else {
			Reserva reserva = new Reserva(numero, entrada, saida);
			System.out.println(reserva);
			
			System.out.println();
			System.out.println("Entre com os dados de atualizacão da reserva");
			
			System.out.print("Data de entrada (dd/MM/yyyy): ");
			entrada = sdf.parse(sc.next());
			System.out.print("Data de saida (dd/MM/yyyy): ");
			saida = sdf.parse(sc.next());
			
			
			/*String erro = reserva.atualizarDatas(entrada, saida);
			if (erro != null) {
				System.out.println("Erro na reserva; "+ erro);
			}
			else {
				System.out.println(reserva);

			}*/
		}	
	}

}
