package com.efcanteli.fotrografo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.efcanteli.fotrografo.model.Pais;
import com.efcanteli.fotrografo.service.PaisService;


@RestController
@RequestMapping("/pais")
public class PaisController {

	@Autowired
	private PaisService paisService;
	
	@GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Pais> getAllActives(){
		return paisService.getAll();
	}
}
