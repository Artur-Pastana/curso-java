package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reserva {
	private Integer numeroQuarto;
	private Date checkiIn;
	private Date checkOut;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Reserva() {
	}

	public Reserva(Integer numeroQuarto, Date checkiIn, Date checkOut) {
		this.numeroQuarto = numeroQuarto;
		this.checkiIn = checkiIn;
		this.checkOut = checkOut;
	}

	public Integer getNumeroQuarto() {
		return numeroQuarto;
	}

	public void setNumeroQuarto(Integer numeroQuarto) {
		this.numeroQuarto = numeroQuarto;
	}

	public Date getCheckiIn() {
		return checkiIn;
	}

	public Date getCheckOut() {
		return checkOut;
	}
	
	public long duracao() {
		long dif = this.checkOut.getTime() - this.checkiIn.getTime();
		return TimeUnit.DAYS.convert(dif, TimeUnit.MILLISECONDS);
	}
	
	public String atualizarDatas(Date entrada, Date saida) {
		
		Date agora = new Date();
		if (entrada.before(agora) || saida.before(agora)) {
			return "Erro: as datas devem ser datas futuras!";
		}
		if (!saida.after(entrada)) {
			return "data de saida deve ser posterior a de entrada";
		}
		this.checkiIn = entrada;
		this.checkOut = saida;
		return null;
	}
	
	@Override
	public String toString() {
		return "Quarto numero:"
				+ this.numeroQuarto
				+ ", entrada: "
				+ sdf.format(checkiIn)
				+ ", Saida: "
				+ sdf.format(checkOut)
				+ ", duracao: "
				+ duracao()
				+ " Noites";
	}
	
	
	
}
