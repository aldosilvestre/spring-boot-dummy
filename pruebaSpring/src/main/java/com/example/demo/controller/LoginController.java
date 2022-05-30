package com.example.demo.controller;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.FilterTicket;
import com.example.demo.models.Login;
import com.example.demo.models.Ticket;
import com.example.demo.models.UserAccess;

@RestController
public class LoginController {

	
	@PostMapping("login")
	public UserAccess login(@RequestBody Login login) {
		
		System.out.println(login.getUsername());
		System.out.println(login.getPassword());
		
		var access = new UserAccess();
		access.setAccessToken("asdfkjlasdjfskjdf");
		access.setIsAdmin(false);
		return access;
	}
	
	@GetMapping("tickets")
	public List<Ticket> getTicketByFilter(@RequestParam Optional<FilterTicket> filter){
		
		var ticket1 = new Ticket();
		var ticket2 = new Ticket();
		
		ticket1.setNumero(Long.valueOf(5465));
		ticket2.setNumero(Long.valueOf(16546));
		
		ticket1.setDescripcion("descripcion 1");
		ticket2.setDescripcion("descripcion 2");
		
		ticket1.setFecha(LocalDate.now());
		ticket2.setFecha(LocalDate.of(2022, 05, 28));
		return List.of(ticket1, ticket2);
	}
	
	@GetMapping("tickets/get/{nro}")
	public Ticket getTicketByNro(@PathParam("nro") Long nro) {
		var ticket = new Ticket();
		ticket.setNumero(nro);
		ticket.setDescripcion("descripcion obtenida");
		ticket.setFecha(LocalDate.now());
	
		return ticket;
	}
	
	
}
