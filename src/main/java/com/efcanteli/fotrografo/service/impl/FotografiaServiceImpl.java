package com.efcanteli.fotrografo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.efcanteli.fotrografo.model.Camara;
import com.efcanteli.fotrografo.model.Fotografia;
import com.efcanteli.fotrografo.model.Objetivo;
import com.efcanteli.fotrografo.model.Pais;
import com.efcanteli.fotrografo.repository.FotografiaRepository;
import com.efcanteli.fotrografo.service.FotografiaService;

@Service
public class FotografiaServiceImpl implements FotografiaService{

	@Autowired
	private FotografiaRepository fotografiaRepository;

	@Override
	public List<Fotografia> getFotografiasByPais(Pais pais) {
		// TODO Auto-generated method stub
		return fotografiaRepository.getFotografiasByPais(pais);
	}

	@Override
	public List<Fotografia> getFotografiasByCamara(Camara camara) {
		// TODO Auto-generated method stub
		return fotografiaRepository.getFotografiasByCamara(camara);
	}

	@Override
	public List<Fotografia> getFotografiasByObjetivo(Objetivo objetivo) {
		// TODO Auto-generated method stub
		return fotografiaRepository.getFotografiasByObjetivo(objetivo);
	}

	@Override
	public List<Fotografia> getAll() {
		// TODO Auto-generated method stub
		return fotografiaRepository.getAll();
	}

	@Override
	public Fotografia insert(Fotografia fotografia) {
		// TODO Auto-generated method stub
		return fotografiaRepository.save(fotografia);
	}

	@Override
	public Fotografia getFotografiaById(Fotografia fotografia) {
		// TODO Auto-generated method stub
		return fotografiaRepository.getFotografiaById(fotografia);
	}
}
