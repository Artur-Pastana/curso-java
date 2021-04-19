package com.heranca;

public class Program {

	public static void main(String[] args) {
		
		Conta conta = new Conta(2728, "aslan",500.0);
		BusinessConta bc = new BusinessConta(2828, "Iris", 100.0, 250.0);
		ContaPoupanca cp = new ContaPoupanca(2727, "Artur", 150.0, .02);
		
		conta.sacar(200);
		System.out.println(conta.getSaldo());
		
		//upcasting
		Conta c2 = bc;
		Conta c3 = new BusinessConta(0001, "teste", 500.0, 700.0);
		c3.sacar(200.0);//polimorfismo
		System.out.println(c3.getSaldo());
		
		Conta c4 = new ContaPoupanca(0002, "Anna", 500.0, 0.2);
		c4.sacar(200.0);//polimorfismo
		System.out.println(c4.getSaldo());
		
		
		
		//DownCasting
		
		BusinessConta bc2 = (BusinessConta) c3;
		bc2.emprestar(40.0);
		
		//BusinessConta bc3 = (BusinessConta) c4;
		if (c4 instanceof BusinessConta) {
			BusinessConta bc3 = (BusinessConta) c4;
			bc3.emprestar(20.0);
			System.out.println("Emprestimo feito!");
		}
		else {
			System.out.println("Erro.."+c4.getClass()+" não é instancia de BusinnesConta");
		}
		
		if (c4 instanceof ContaPoupanca) {
			ContaPoupanca cp1 = (ContaPoupanca) c4;
			cp1.atualizarSaldo(0.25);
			System.out.println("Atualizado");
			System.out.println(c4+ " é instancia de contaPoupança");
		}
		else {
			System.out.println("Não é instacia de contaPoupança");
		}
	}

}
