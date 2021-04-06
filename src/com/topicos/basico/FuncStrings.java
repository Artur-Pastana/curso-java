package com.topicos.basico;

public class FuncStrings {

	public static void main(String[] args) {
		
		String orig = "abcde FGHIJ ABC abc DEFG   ";
		
		String s1 = orig.toLowerCase();
		String s2 = orig.toUpperCase();
		String s3 = orig.trim();//elimina os espaços
		String s4 = orig.substring(2);
		String s5 = orig.substring(2, 9);
		String s6 = orig.replace('a', 'x');
		String s7 = orig.replace("abc", "Artur");//muda ocorrencias
		int i = orig.indexOf("bc");
		int j = orig.lastIndexOf("bc");
		
		System.out.println("original: -"+orig+"-");
		System.out.println("toLowerCase: -"+s1+"-");
		System.out.println("toUpperCase: -"+s2+"-");
		System.out.println("trim: -"+s3+"-");
		System.out.println("subString(2): -"+s4+"-");
		System.out.println("subString(2, 9): -"+s5+"-");
		System.out.println("replace('a', 'x'): -"+s6+"-");
		System.out.println("replace('abc, 'Artur'): -"+s7+"-");
		System.out.println("indexOf 'bc': "+i);
		System.out.println("indexOf 'bc': "+j);
		
		String s = "Artur Iris Aslan";
		String[] vet = s.split(" ");
		String w1 = vet[0];
		String w2 = vet[1];
		String w3 = vet[2];
		
		System.out.println(vet[0]);
		System.out.println(w1);
		
		
		
		
		
	}

}
