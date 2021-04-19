package com.poo.polimorfismo;

public class FuncionarioTercerizado extends Funcionario {
	private Double dispezaAdicional;
	
	public FuncionarioTercerizado() {
		super();
	}

	public FuncionarioTercerizado(String nome, Integer horas, Double valorPorHora, Double dispezaAdicional) {
		super(nome, horas, valorPorHora);
		this.dispezaAdicional = dispezaAdicional;
	}

	public Double getDispezaAdicional() {
		return dispezaAdicional;
	}

	public void setDispezaAdicional(Double dispezaAdicional) {
		this.dispezaAdicional = dispezaAdicional;
	}
	@Override
	public double pagamento() {
		return super.pagamento() + this.dispezaAdicional * 1.1;
	}
	
}
