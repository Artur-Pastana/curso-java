package com.poo.excecoes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Teste1 {

	public static void main(String[] args) {
		File file = new File("E:\\temp\\in.txt");
		Scanner sc = null;
		
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (FileNotFoundException e) {
			System.out.println("Erro ao abrir arquivo " + e.getMessage());
		}
		finally {
			if (sc != null) {
				sc.close();
			}
			System.out.println("bloco finally executado!");
		}
	}
}
