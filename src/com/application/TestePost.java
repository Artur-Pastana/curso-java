package com.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.entidades.Comentario;
import com.entidades.Post;

public class TestePost {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		
		//System.out.println("entre com um comentário:");
		//String cm = sc.nextLine();
		Comentario c1 = new Comentario("Estudando java");
		//System.out.println("entre com outro comentario");
		//cm = sc.nextLine();
		Comentario c2 = new Comentario("aprofundar a linguagem");
		
		Post p1 = new Post(sdf.parse("28/11/1992 20:08"),
				"Traveling to new Zeeland", "I'm going to visit this wonderful country"
				, 12);
		p1.addComentario(c1);
		p1.addComentario(c2);
		
		//add outro comentario
		Comentario c3 = new Comentario("Estudando na udemy");
		Comentario c4 = new Comentario("Com o professor Nelio");
		
		Post p2 = new Post(sdf.parse("07/04/2021 20:44"), "Matapi estudos", "Usando wifi", 27);
		p2.addComentario(c3);
		p2.addComentario(c4);
		
		//add outro comentario
		Comentario c5 = new Comentario("Usar o instagran para vender");
		
		System.out.println(p1);
		System.out.println(p2);
		
	}

}
