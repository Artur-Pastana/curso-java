package com.poo.metodoabs.exer;

public class Individual extends Contribuinte {
	private Double gastoSaude;
	
	public Individual() {
	}
	

	public Individual(String nome, Double rendaAnual, Double gastoSaude) {
		super(nome, rendaAnual);
		this.gastoSaude = gastoSaude;
	}

	public Double getGastoSaude() {
		return gastoSaude;
	}


	public void setGastoSaude(Double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}


	@Override
	public double imposto() {
		double res = 0;
		if (this.getRendaAnual() <= 20000) {
			res = (this.getRendaAnual() * 0.15);
		}
		else if (this.getRendaAnual() > 20000) {
			res = (this.getRendaAnual() * 0.25);
		}
		if (this.gastoSaude > 0) {
			res -= (this.gastoSaude * 0.5);
		}
		return res;
	}
	
	
}
