package com.efcanteli.fotrografo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.efcanteli.fotrografo.model.Objetivo;
import com.efcanteli.fotrografo.service.ObjetivoService;

@RestController
@RequestMapping("/objetivo")
public class ObjetivoController {

	@Autowired
	private ObjetivoService objetivoService;
	
	@GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Objetivo> getAll(){
		return objetivoService.getAll();
	}
	
}
