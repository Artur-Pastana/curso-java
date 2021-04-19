package com.heranca;

public class ContaPoupanca extends Conta{
	
	private Double taxaDeJuro;
	
	public ContaPoupanca() {
		super();
	}

	public ContaPoupanca(Integer numero, String titular, Double saldo, Double taxaDeJuro) {
		super(numero, titular, saldo);
		this.taxaDeJuro = taxaDeJuro;
	}

	public Double getTaxaDeJuro() {
		return taxaDeJuro;
	}

	public void setTaxaDeJuro(Double taxaDeJuro) {
		this.taxaDeJuro = taxaDeJuro;
	}
	
	public void atualizarSaldo(double taxa) {
		this.saldo += this.saldo * taxa;
	}
	
	//sobescrita de métdodos
	@Override
	public void sacar(double valor) {
		this.saldo -= valor;
	}
	
}
