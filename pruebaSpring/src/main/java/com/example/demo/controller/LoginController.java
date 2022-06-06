package com.example.demo.controller;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.FilterTicket;
import com.example.demo.models.Login;
import com.example.demo.models.Register;
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
		access.setIsAdmin(true);
		access.setUsername(login.getUsername());
		return access;
	}
	
	@GetMapping("tickets")
	public List<Ticket> getTicketByFilter(@RequestParam HashMap<String,String> filter ){
	
		System.out.println(filter);

		var ticket1 = new Ticket();
		var ticket2 = new Ticket();
		
		ticket1.setNumero(Long.valueOf(5465));
		ticket2.setNumero(Long.valueOf(16546));
		
		ticket1.setMovie("thor");
		ticket2.setMovie("thor 2");
		
		ticket1.setFecha(LocalDate.now());
		ticket2.setFecha(LocalDate.of(2022, 05, 28));
		return List.of(ticket1, ticket2);
	}
	
	@GetMapping("tickets/get/{nro}")
	public Ticket getTicketByNro(@PathParam("nro") Long nro) {
		var ticket = new Ticket();
		ticket.setNumero(nro);
		ticket.setMovie("Pelicula");
		ticket.setFecha(LocalDate.now());
	
		return ticket;
	}
	
	@PostMapping("register")
	public ResponseEntity registerNewUser(@RequestBody Register register){

		System.out.println(register.toString());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	}

}
