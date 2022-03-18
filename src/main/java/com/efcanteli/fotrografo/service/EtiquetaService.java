package com.efcanteli.fotrografo.service;

import java.util.List;

import com.efcanteli.fotrografo.model.Etiqueta;

public interface EtiquetaService {

	public List<Etiqueta> getAll();
	
	public List<Etiqueta> getAllUsed();
	
	public List<Etiqueta> getEtiquetasByNombre(Etiqueta etiqueta);
	
	public Etiqueta getEtiquetaByNombre(Etiqueta etiqueta);
	
	public Etiqueta insertEtiqueta(Etiqueta etiqueta);
	
	public int desactivar(Etiqueta etiqueta);
	
	public Etiqueta getEtiquetaById(Etiqueta etiqueta);
	
	public int actualizar(Etiqueta etiqueta);
}
