package com.efcanteli.fotrografo.service;

import java.util.List;

import com.efcanteli.fotrografo.model.Marca;

public interface MarcaService {

	
	public List<Marca> getAllActive();
	
	public Marca getMarcaById(Marca marca);
	
	public List<Marca> getMarcaByNombre(Marca marca);
}
