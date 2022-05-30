package com.example.demo.models;

import java.time.LocalDate;

public class FilterTicket {
	
	private int numero;
	private LocalDate fecha;
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

}
