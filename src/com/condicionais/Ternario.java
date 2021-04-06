package com.condicionais;

public class Ternario {

	public static void main(String[] args) {

		System.out.println((2 > 4) ? "sim" : "não");

		System.out.println(("Artur" == "Artur") ? true : false);
		
		double preco = 34.5;
		
		System.out.println(preco);
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.5;
		
		/*if (preco < 20.0) {
			desconto = preco * 0.1;
		}
		else {
			desconto = preco * 0.5;
		}*/
		
		System.out.println(desconto+" R$ de desconto");

	}

}
