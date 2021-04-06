package com.entidades;

public class Funcionario {
	
	private String nome;
	private double salarioBruto;
	private double salarioLiquido;
	private double desc;
	
	public void entradaDeDados(String nome, double salario, double taxa) {
		this.nome = nome;
		this.salarioBruto = salario;
		this.desc = taxa; 
		this.salarioLiquido  = salario - taxa;
	}
	
	public void calculo(double taxa) {
		double res = ((taxa) / 100) * this.salarioBruto;
		this.salarioLiquido += res;
	}
	
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalarioBruto() {
		return salarioBruto;
	}

	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}

	public double getSalarioLiquido() {
		return salarioLiquido;
	}

	public void setSalarioLiquido(double salarioLiquido) {
		this.salarioLiquido = salarioLiquido;
	}

	public double getDesc() {
		return desc;
	}

	public void setDesc(double desc) {
		this.desc = desc;
	}

	@Override
	public String toString() {
		return "Funcionario: "
				+ this.nome
				+ ", $ "
				+ String.format("%.2f ", salarioLiquido);
	}
	
	
}
