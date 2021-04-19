package com.poo.metodoabs.exer;

public class Empresa extends Contribuinte{
	
	private Integer numDeFunc;
	
	public Empresa() {
		super();
	}
	
	public Empresa(String nome, Double rendaAnual, Integer numDeFunc) {
		super(nome, rendaAnual);
		this.numDeFunc = numDeFunc;
	}
	
	public Integer getNumDeFunc() {
		return numDeFunc;
	}

	public void setNumDeFunc(Integer numDeFunc) {
		this.numDeFunc = numDeFunc;
	}

	@Override
	public double imposto() {
		double res = 0;
		if (this.numDeFunc > 10) {
			res = (this.getRendaAnual() * 0.14);
		}else {
			res = (this.getRendaAnual() * 0.16);
		}
		
		return res;
	}
}
