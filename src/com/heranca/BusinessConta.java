package com.heranca;

public class BusinessConta extends Conta {
	
	private Double limite;
	
	public BusinessConta() {
		super();
	}

	public BusinessConta(Integer numero, String titular, Double saldo, Double limite) {
		super(numero, titular, saldo);
		this.limite = limite;
	}

	public Double getLimite() {
		return limite;
	}

	public void setLimite(Double limite) {
		this.limite = limite;
	}
	
	public void emprestar(double valor) {
		if (valor <= this.limite) {
			//depositar(valor);
			this.saldo += valor;
		}
		else {
			System.out.println("valor maior que o limite");
		}
	}
	
	@Override
	public void sacar(double valor) {
		super.sacar(valor);
		this.saldo -= 2.0;
	}
	
}
