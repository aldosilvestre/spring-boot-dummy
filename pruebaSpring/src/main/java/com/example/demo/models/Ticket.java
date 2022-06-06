package com.example.demo.models;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Ticket {
	
	@JsonProperty("nro")
	private Long numero;
	@JsonProperty("movie")
	private String movie;
	@JsonProperty("date")
	private LocalDate fecha;


	public Long getNumero() {
		return this.numero;
	}

	public void setNumero(Long numero) {
		this.numero = numero;
	}

	public String getMovie() {
		return this.movie;
	}

	public void setMovie(String movie) {
		this.movie = movie;
	}

	public LocalDate getFecha() {
		return this.fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	

}
