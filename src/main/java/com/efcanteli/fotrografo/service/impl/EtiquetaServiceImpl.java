package com.efcanteli.fotrografo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.efcanteli.fotrografo.model.Etiqueta;
import com.efcanteli.fotrografo.model.FotografiaEtiqueta;
import com.efcanteli.fotrografo.repository.EtiquetaRepository;
import com.efcanteli.fotrografo.repository.FotografiaEtiquetaRepository;
import com.efcanteli.fotrografo.service.EtiquetaService;

@Service
public class EtiquetaServiceImpl implements EtiquetaService {

	@Autowired
	private EtiquetaRepository etiquetaRepository;

	@Autowired
	private FotografiaEtiquetaRepository fotografiaEtiquetaRepository;

	@Override
	public List<Etiqueta> getAll() {
		// TODO Auto-generated method stub
		return etiquetaRepository.getAllActive();
	}

	@Override
	public List<Etiqueta> getEtiquetasByNombre(Etiqueta etiqueta) {
		// TODO Auto-generated method stub
		return etiquetaRepository.getEtiquetasByNombre(etiqueta);
	}

	@Override
	public Etiqueta getEtiquetaByNombre(Etiqueta etiqueta) {
		// TODO Auto-generated method stub
		return etiquetaRepository.getEtiquetaByNombre(etiqueta);
	}

	@Override
	public Etiqueta getEtiquetaById(Etiqueta etiqueta) {
		// TODO Auto-generated method stub
		return etiquetaRepository.getEtiquetaById(etiqueta);
	}

	@Override
	public Etiqueta insertEtiqueta(Etiqueta etiqueta) {
		// TODO Auto-generated method stub
		return etiquetaRepository.save(etiqueta);
	}

	@Override
	public int desactivar(Etiqueta etiqueta) {
		// TODO Auto-generated method stub
		fotografiaEtiquetaRepository.desactivarEtiqueta(etiqueta);
		return etiquetaRepository.desactivar(etiqueta);

	}

	@Override
	public List<Etiqueta> getAllUsed() {
		// TODO Auto-generated method stub
		return etiquetaRepository.getAllUsed();
	}

	@Override
	public int actualizar(Etiqueta etiqueta) {
		// TODO Auto-generated method stub
		return etiquetaRepository.actualizar(etiqueta);
	}

}
