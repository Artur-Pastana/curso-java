package com.entidades;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Produto p1 = new Produto();
		System.out.println("digite o nome do produto:");
		p1.nome = sc.nextLine();
		System.out.println("digite o preço do produto:");
		p1.preco = sc.nextDouble();
		System.out.println("digite a qtd");
		p1.qtd = sc.nextInt();
		
		System.out.println();
		System.out.println("Dados do Produto: "+p1);
		
		System.out.println("Entre com a qtd que quer add em estoque:");
		int qtd = sc.nextInt();
		p1.addProd(qtd);
		System.out.println(p1);
		
		System.out.println("digite a qtd a remover do estoque:");
		qtd = sc.nextInt();
		p1.removerProd(qtd);
		System.out.println(p1);
		
		Produto p2 = new Produto(p1.nome, p1.preco, p1.qtd);
		System.out.println(p2);
		System.out.println("fim");
		

	}

}
