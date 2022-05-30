package com.example.demo.models;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Ticket {
	
	@JsonProperty("nro")
	private Long numero;
	private String descripcion;
	private LocalDate fecha;

	public Long getNumero() {
		return numero;
	}
	public void setNumero(Long numero) {
		this.numero = numero;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	
}
