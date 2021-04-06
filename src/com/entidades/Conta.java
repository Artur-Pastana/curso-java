package com.entidades;

public class Conta {
	
	private Integer numero;
	private String titular;
	private Double valor;
	
	public Conta() {
	}	

	public Conta(Integer numero, String titular) {
		super();
		this.numero = numero;
		this.titular = titular;
		this.valor = 0.0;
	}

	public Conta(Integer numero, String titular, Double valor) {
		super();
		this.numero = numero;
		this.titular = titular;
		this.valor = valor;
	}
	
	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public void depositar(double valor) {
		this.valor += valor;
	}
	
	public void sacar(double valor) {
		this.valor -= (valor + 5);
	}
	
	@Override
	public String toString() {
		return "Dados da Conta: "
				+ "Conta: "
				+ this.getNumero()
				+ "; Titular: "
				+ this.getTitular()
				+ "; Saldo: "
				+ this.getValor();
	}
	

}
