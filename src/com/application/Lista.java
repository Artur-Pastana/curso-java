package com.application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lista {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Artur da Gloria");
		list.add("Iris Juliany");
		list.add("Aslan Pietro");
		list.add("Ma vida");
		list.add(2, "Anne Caroline");
		
		System.out.println("tamanho da lista: "+list.size()+"\n");
		for (String elem : list) {
			System.out.println(elem);
		}
		System.out.println("---------------------");
		list.removeIf(p -> p.charAt(0) == 'M');
		for (String elem : list) {
			System.out.println(elem);
		}
		System.out.println("----------------------");
		System.out.println("indice da Iris: " + list.indexOf("Iris"));
		System.out.println("indice da Iris: " + list.indexOf("Aslan"));
		System.out.println("indice da Iris: " + list.indexOf("Anne"));
		System.out.println("----------------------");
		List<String> result = list.stream().filter(p -> p.charAt(0)
				== 'A').collect(Collectors.toList());
		for (String res : result) {
			System.out.println(res);
		}
		System.out.println("----------------------");
		String nome = list.stream().filter(p -> p.charAt(0)
				== 'I').findFirst().orElse(null);
		System.out.println(nome);
	}

}
