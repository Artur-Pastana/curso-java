package com.entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
	
	private Date momento;
	private String titulo;
	private String content;
	private Integer likes;
	
	//associação um para muitos
	private List<Comentario> comentarios = new ArrayList<>();
	
	public Post() {
	}

	public Post(Date momento, String titulo, String content, Integer likes) {
		this.momento = momento;
		this.titulo = titulo;
		this.content = content;
		this.likes = likes;
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public List<Comentario> getComentarios() {
		return comentarios;
	}
	
	public void addComentario(Comentario comentario) {
		comentarios.add(comentario);
	}
	
	public void removerComentario(Comentario comentario) {
		comentarios.remove(comentario);
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.titulo + "\n");
		sb.append(this.likes);
		sb.append(" Likes - ");
		sb.append(sdf.format(this.momento) + "\n");
		sb.append(this.content + "\n");
		sb.append("Comentarios: \n");
		for (Comentario c : comentarios) {
			sb.append(c.getTexto()+ "\n");
		}
		return sb.toString();
	}
}
