package com.efcanteli.fotrografo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.efcanteli.fotrografo.model.Etiqueta;
import com.efcanteli.fotrografo.model.Marca;
import com.efcanteli.fotrografo.service.MarcaService;



@RestController
@RequestMapping("/marca")
public class MarcaController {
	
	@Autowired
	private MarcaService marcaService;

		@GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
		public List<Marca> getAllActives(){
			return marcaService.getAllActive();
		}
		
		@GetMapping(value = "/id",  consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
		@ResponseBody
		public Marca getMarca(@RequestBody Marca marca) {
			return marcaService.getMarcaById(marca);
		}
		
		
}
