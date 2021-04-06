package com.entidades;

import java.util.Scanner;

import com.util.Calculadora;

public class Exer01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Retangulo ret = new Retangulo();
		
		ret.entrar(3, 4);
		ret.area();
		ret.perimetro();
		ret.diagonal();
		System.out.println(ret);
		
		Funcionario f1 = new Funcionario();
		f1.entradaDeDados("artur", 6000, 1000);
		System.out.println(f1);
		//System.out.println("Entre com porcentagem: ");
		//double taxa = sc.nextDouble();
		f1.setNome("Aslan");
		f1.calculo(10);
		System.out.println(f1);
		
		System.out.println("Entre com o raio:");
		double raio = sc.nextDouble();
		
		double circunf = Calculadora.circun(raio);
		System.out.printf("circunferencia: %.2f%n",circunf);
		
		double vol = Calculadora.volume(raio);
		System.out.printf("Volume: %.2f%n",vol);
		
		System.out.printf("PI: %.2f",Calculadora.PI);
		
	}
	
	public static double circun(double raio) {
		return 2 * Math.PI * raio;
	}
	
	public static double volume(double raio) {
		return (Math.pow(raio, 3) * 4 * Math.PI) / 3;
	}

}
