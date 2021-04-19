package com.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.entidades.Cliente;
import com.entidades.Order;
import com.entidades.Pedido;
import com.entidades.Product;
import com.entidades.enums.OrderStatus;

public class TesteComposicao3 {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Entre com os dados do Cliente:");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Data de Nascimento (Dia/mes/Ano): ");
		Date nascimento = sdf.parse(sc.next());
		
		Cliente cliente = new Cliente(nome, email, nascimento);
		
		System.out.println("Entre com os dados do Pedido:");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());
		
		Order order = new Order(new Date(), status, cliente);
		
		System.out.println("Quantos itens para este pedido");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("Entre com os dados do "+i+"º");
			System.out.print("Nomde do Produto: ");
			sc.nextLine();
			String nomeProd = sc.nextLine();
			System.out.print("Preço do Produto: ");
			double preco = sc.nextDouble();
			
			Product product = new Product(nomeProd, preco);
			
			System.out.print("Quatidade: ");
			int qtd = sc.nextInt();
			
			Pedido pedido = new Pedido(qtd, preco, product);
			
			order.addPedido(pedido);
		}
		System.out.println();
		System.out.println("Sumario do Pedido: ");
		System.out.println(order);
	}

}
