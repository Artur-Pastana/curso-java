package com.application;

public class Program {

	public static void main(String[] args) {
		
		int x = 28;
		Object obj = x;
		System.out.println(obj);
		int y = (int) obj;
		System.out.println(y);
		
		String[] vet = new String[] {"Artur","Iris","Aslan"};
		for (int i = 0; i < vet.length; i++) {
			System.out.println(vet[i]);
		}
		System.out.println();
		for (String string : vet) {
			System.out.println(string);
		}
		
		
	}

}
