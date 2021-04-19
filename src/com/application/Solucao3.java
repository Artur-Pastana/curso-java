package com.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reserva;
import model.exception.DomainException;

public class Solucao3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			System.out.print("numero do quarto: ");
			int numero = sc.nextInt();
			System.out.print("Data de entrada (dd/MM/yyyy): ");
			Date entrada = sdf.parse(sc.next());
			System.out.print("Data de saida (dd/MM/yyyy): ");
			Date saida = sdf.parse(sc.next());
			
			Reserva reserva = new Reserva(numero, entrada, saida);
			System.out.println(reserva);
			
			System.out.println();
			System.out.println("Entre com os dados de atualizacão da reserva");
			
			System.out.print("Data de entrada (dd/MM/yyyy): ");
			entrada = sdf.parse(sc.next());
			System.out.print("Data de saida (dd/MM/yyyy): ");
			saida = sdf.parse(sc.next());
			
			
			reserva.atualizarDatas(entrada, saida);
			System.out.println(reserva);
		} 
		catch (ParseException e) {
			System.out.println("Data inválida digitada!");
		}
		catch (DomainException e) {
			System.out.println("Erro na reserva: " + e.getMessage());
		}
		catch (RuntimeException e) {
			System.out.println("Erro inesperado");
		}
		
		sc.close();
		
		}
	}

