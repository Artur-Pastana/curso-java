package com.entidades;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import com.entidades.enums.NivelTrabalho;

public class Trabalhador {
	private String nome;
	private NivelTrabalho nivel;
	private Double baseSalarial;
	
	//assiações tem um Departamento
	private Departamento departamento;
	
	//associação tem vários contratos
	private List<ContratoHora> contratos = new ArrayList<>();
	//compoição de objetos
	
	public Trabalhador() {
	}
	public Trabalhador(String nome, NivelTrabalho nivel, Double baseSalarial, Departamento departamento) {
		this.nome = nome;
		this.nivel = nivel;
		this.baseSalarial = baseSalarial;
		this.departamento = departamento;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public NivelTrabalho getNivel() {
		return nivel;
	}
	public void setNivel(NivelTrabalho nivel) {
		this.nivel = nivel;
	}
	public Double getBaseSalarial() {
		return baseSalarial;
	}
	public void setBaseSalarial(Double baseSalarial) {
		this.baseSalarial = baseSalarial;
	}
	public Departamento getDepartamento() {
		return departamento;
	}
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	public List<ContratoHora> getContratos() {
		return contratos;
	}
	
	public void addContratos(ContratoHora contrato) {
		contratos.add(contrato);
	}
	
	public void removerContrato(ContratoHora contrato) {
		contratos.remove(contrato);
	}
	
	public double renda (int ano, int mes) {
		double soma = this.baseSalarial;
		Calendar cal = Calendar.getInstance();
		for (ContratoHora c : contratos) {
			cal.setTime(c.getData());
			int c_ano = cal.get(Calendar.YEAR);
			int c_mes = 1 + cal.get(Calendar.MONTH);
			if (ano == c_ano && mes == c_mes) {
				soma += c.totalValor();
			}
		}
		return soma;
	}
	
}
