package com.efcanteli.fotrografo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.efcanteli.fotrografo.model.Camara;
import com.efcanteli.fotrografo.service.CamaraService;



@RestController
@RequestMapping("/camara")
public class CamaraController {

	@Autowired
	private CamaraService camaraService;
	
	@GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<Camara> getAll(){
		return camaraService.getAll();
	}
}
