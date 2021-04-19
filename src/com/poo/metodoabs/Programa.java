package com.poo.metodoabs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Figura> lista = new ArrayList<Figura>();
		
		System.out.print("Entre com a qtd de figuras: ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("Figura #"+i+":");
			System.out.print("Circulo ou Retangulo ( c / r)?: ");
			char op = sc.next().charAt(0);
			if (op == 'c') {
				System.out.print("Entre com o raio: ");
				double raio = sc.nextDouble();
				Circulo c = new Circulo(raio, "Circulo");
				lista.add(c);
			}
			else if (op == 'r') {
				System.out.print("Altura: ");
				double alt = sc.nextDouble();
				System.out.print("largura: ");
				double larg = sc.nextDouble();
				Retangulo r = new Retangulo(alt, larg, "Retangulo");
				lista.add(r);
			}
		}
		System.out.println("Dados da Figuras:");
		for (Figura figura : lista) {
			System.out.print(figura +"\n\n");
		}
	}
}
