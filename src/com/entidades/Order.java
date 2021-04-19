package com.entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.entidades.enums.OrderStatus;

public class Order {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
	
	private Integer id;
	private Date moment;
	private OrderStatus status;
	
	private Cliente cliente;
	private List<Pedido> pedidos = new ArrayList<>();
	
	public Order() {
	}

	public Order(Date moment, OrderStatus status, Cliente cliente) {
		this.moment = moment;
		this.status = status;
		this.cliente = cliente;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}
	public void addPedido(Pedido pedido) {
		pedidos.add(pedido);
	}
	
	public void removerPedido(Pedido pedido) {
		pedidos.remove(pedido);
	}
	
	public double total() {
		double soma = 0;
		for (Pedido p : pedidos) {
			soma += p.subTotal();
		}
		return soma;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Momento do Pedido: ");
		sb.append(sdf.format(moment) + "\n");
		sb.append("Status do Peido: ");
		sb.append(this.status + "\n");
		sb.append("Cliente: ");
		sb.append(this.cliente + "\n");
		sb.append("Pedidos: \n");
		for (Pedido pedido : pedidos) {
			sb.append(pedido + "\n");
		}
		sb.append("Preço Total: R$ ");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	}
	
	
	
	
	
}
