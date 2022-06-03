package com.example.demo.models;

import java.time.LocalDate;

public class Sala {
    
    private Long nro;
    private LocalDate date;
    private String movie;
    private String time;

    public Sala(Long nro, LocalDate date, String movie, String time) {
        this.nro = nro;
        this.date = date;
        this.movie = movie;
        this.time = time;
    }

    public Long getNro() {
        return this.nro;
    }

    public void setNro(Long nro) {
        this.nro = nro;
    }

    public LocalDate getDate() {
        return this.date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getMovie() {
        return this.movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public String getTime() {
        return this.time;
    }

    public void setTime(String time) {
        this.time = time;
    }

}
