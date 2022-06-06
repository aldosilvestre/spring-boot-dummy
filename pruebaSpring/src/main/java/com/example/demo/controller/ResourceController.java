package com.example.demo.controller;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;

import org.apache.catalina.connector.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Sala;

@RestController
public class ResourceController {
    

    @GetMapping("rooms/get")
    public List<Sala> getSalas(){

        var sala1 = new Sala(Long.valueOf(15), LocalDate.now(), "101 dalmatas", "18:30");
        var sala2 = new Sala(Long.valueOf(5), LocalDate.now(), "Thor", "22:00");
        

        return List.of(sala1, sala2);
    }

    @PostMapping("reserves/new")
    public ResponseEntity<String> generateReserve(@RequestBody HashMap<String,String> body){
        System.out.println(body);

        return new ResponseEntity<String>(HttpStatus.NO_CONTENT);

    }


}
