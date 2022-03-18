package com.efcanteli.fotrografo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.efcanteli.fotrografo.model.Camara;
import com.efcanteli.fotrografo.model.Fotografia;
import com.efcanteli.fotrografo.model.Objetivo;
import com.efcanteli.fotrografo.model.Pais;
import com.efcanteli.fotrografo.service.FotografiaService;

@RestController
@RequestMapping("/fotografia")
public class FotografiaController {

	@Autowired
	private FotografiaService fotografiaService;
	
	@GetMapping(value = "/all")
	public List<Fotografia> getAllActives() {
		return fotografiaService.getAll();
	}
	
	@GetMapping(value = "/pais",  consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<Fotografia> getFotografiasByNombre(@RequestBody Pais pais) {
		return fotografiaService.getFotografiasByPais(pais);
	}
	
	@GetMapping(value = "/id",  consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Fotografia getFotografiasById(@RequestBody Fotografia fotografia) {
		return fotografiaService.getFotografiaById(fotografia);
	}
	
	@GetMapping(value = "/camara",  consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<Fotografia> getFotografiasByCamara(@RequestBody Camara camara) {
		return fotografiaService.getFotografiasByCamara(camara);
	}
	
	@GetMapping(value = "/objetivo",  consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<Fotografia> getFotografiasByObjetivo(@RequestBody Objetivo objetivo) {
		return fotografiaService.getFotografiasByObjetivo(objetivo);
	}
	
	@PostMapping(value = "/insert", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Fotografia insertEtiqueta(@RequestBody Fotografia fotografia) {
		return fotografiaService.insert(fotografia);

	}
}

