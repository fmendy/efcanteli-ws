package com.efcanteli.fotrografo.service;

import java.util.List;

import com.efcanteli.fotrografo.model.Camara;
import com.efcanteli.fotrografo.model.Fotografia;
import com.efcanteli.fotrografo.model.Objetivo;
import com.efcanteli.fotrografo.model.Pais;

public interface FotografiaService {

	public List<Fotografia> getFotografiasByPais(Pais pais);
	
	public List<Fotografia> getFotografiasByCamara(Camara camara);
	
	public List<Fotografia> getFotografiasByObjetivo(Objetivo objetivo);
	
	public List<Fotografia> getAll();
	
	public Fotografia insert(Fotografia fotografia);
	
	public Fotografia getFotografiaById(Fotografia fotografia);
}
