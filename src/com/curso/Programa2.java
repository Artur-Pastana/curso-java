package com.curso;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Programa2 {

	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date d = Date.from(Instant.parse("2021-04-06T19:19:12Z"));
		Date d1 = new Date();
		
		System.out.println(sdf.format(d));
		System.out.println(sdf.format(d1));
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		cal.add(Calendar.HOUR_OF_DAY, 4);
		d = cal.getTime();
		System.err.println(sdf.format(d));
		
		cal.setTime(d1);
		cal.add(Calendar.HOUR_OF_DAY, 1);
		d1 = cal.getTime();
		System.out.println(sdf.format(d1));
		
		//obtendo uma unidade de tempo
		int sg = cal.get(Calendar.SECOND);
		int min = cal.get(Calendar.MINUTE);
		int horas = cal.get(Calendar.HOUR_OF_DAY);
		int mes = 1 + cal.get(Calendar.MONTH);
		int ano = cal.get(Calendar.YEAR);
		
		System.out.println("Segundos: "+ sg);
		System.out.println("minutos: " + min);
		System.out.println("Horas: "+ horas);
		System.out.println("Mês: " + mes);
		System.out.println("Ano: " + ano);
	}

}
