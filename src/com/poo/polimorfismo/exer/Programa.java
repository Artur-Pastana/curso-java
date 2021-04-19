package com.poo.polimorfismo.exer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		List<Produto> lista = new ArrayList<Produto>();
		
		System.out.print("Entre com o numero de produtos: ");
		int n = sc.nextInt();
		for (int i = 1; i <=n; i++) {
			System.out.println("Dados dos Produto #"+i+":");
			System.out.print("Produto: Comum, Usado ou Importado (c, u , i)? ");
			char op = sc.next().charAt(0);
			if (op == 'c') {
				System.out.println("N�o posso instanciar um produto comum");
				/*sc.nextLine();
				System.out.print("Nome: ");
				String nome = sc.nextLine();
				System.out.print("Pre�o: ");
				double preco = sc.nextDouble();
				//Produto produto = new Produto(nome, preco);
				//n�o instanciar um produto pois ele � uma classe 
				//abstrata mas, posso instaciar uma subclasse
				
				//lista.add(produto);*/
			}
			else if (op == 'u') {
				sc.nextLine();
				System.out.print("Nome: ");
				String nome = sc.nextLine();
				System.out.print("Pre�o: ");
				double preco = sc.nextDouble();
				System.out.print("Data de fabrica��o (DD/MM/YYYY): ");
				Date dataFab = sdf.parse(sc.next());
				ProdutoUsado produtoUsado = new ProdutoUsado(nome, preco, dataFab);
				lista.add(produtoUsado);
			}
			else if (op == 'i') {
				sc.nextLine();
				System.out.print("Nome: ");
				String nome = sc.nextLine();
				System.out.print("Pre�o: ");
				double preco = sc.nextDouble();
				System.out.print("Taxa Alfandeg�ria: ");
				double taxaAlfan = sc.nextDouble();
				ProdutoImportado importado = new ProdutoImportado(nome, preco, taxaAlfan);
				lista.add(importado);
			}
		}
		
		System.out.println("TAGS de PRE�O:");
		for (Produto p : lista) {
			System.out.print(p.imprimirTag()+"\n");
		}
	}

}
