package com.condicionais;

public class Teste {

	public static void main(String[] args) {
		boolean v, f;
		v = true;
		f = false;
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		System.out.println();
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		System.out.println();
		System.out.println(!true);
		System.out.println();
		int x = 28;
		System.out.println(x >= 20 && x != 10);
		System.out.println();
		System.out.println(v && f);

	}

}
