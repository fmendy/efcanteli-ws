package com.efcanteli.fotrografo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.efcanteli.fotrografo.model.Etiqueta;
import com.efcanteli.fotrografo.service.EtiquetaService;

@RestController
@RequestMapping("/etiqueta")
public class EtiquetaController {

	@Autowired
	private EtiquetaService etiquetaService;

	@GetMapping(value = "/all")
	public List<Etiqueta> getAllActives() {
		return etiquetaService.getAll();
	}
	
	@GetMapping(value = "/all/used")
	public List<Etiqueta> getAllUsed() {
		return etiquetaService.getAllUsed();
	}

	@GetMapping(value = "/all/nombre",  consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<Etiqueta> getEtiquetasByNombre(@RequestBody Etiqueta etiqueta) {
		return etiquetaService.getEtiquetasByNombre(etiqueta);
	}

	@GetMapping(value = "/nombre", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Etiqueta getEtiquetaByNombre(@RequestBody Etiqueta etiqueta) {
		return etiquetaService.getEtiquetaByNombre(etiqueta);
	}

	@PostMapping(value = "/insert", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Etiqueta insertEtiqueta(@RequestBody Etiqueta etiqueta) {
		
		if (etiqueta == null || etiqueta.getNombre() == null
				|| etiquetaService.getEtiquetaByNombre(etiqueta) != null) {
			return null;
		}
		return etiquetaService.insertEtiqueta(etiqueta);

	}
	
	@PutMapping(value = "/desactivar", consumes = MediaType.APPLICATION_JSON_VALUE)
	public int desactivar(@RequestBody Etiqueta etiqueta) {
		return etiquetaService.desactivar(etiqueta);

	}
	
	@PutMapping(value = "/actualizar", consumes = MediaType.APPLICATION_JSON_VALUE)
	public int actualizar(@RequestBody Etiqueta etiqueta) {
		return etiquetaService.actualizar(etiqueta);

	}
	
	@GetMapping(value = "/id/{idEtiqueta}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Etiqueta getEtiquetaById(@PathVariable(name = "idEtiqueta",required = true) int idEtiqueta) {
		Etiqueta etiqueta = new Etiqueta(idEtiqueta);
		return etiquetaService.getEtiquetaById(etiqueta);
	}
}
