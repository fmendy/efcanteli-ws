package com.efcanteli.fotrografo.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.efcanteli.fotrografo.model.Marca;
import com.efcanteli.fotrografo.repository.MarcaRepository;
import com.efcanteli.fotrografo.service.MarcaService;


@Service
public class MarcaServiceImpl implements MarcaService{

	@Autowired
	private MarcaRepository marcaRepository;
	
	@Override
	public List<Marca> getAllActive() {
		// TODO Auto-generated method stub
		
		return marcaRepository.getAllActive();
	}

	@Override
	public Marca getMarcaById(Marca marca) {
		// TODO Auto-generated method stub
		return marcaRepository.getMarcaById(marca);
	}

	@Override
	public List<Marca> getMarcaByNombre(Marca marca) {
		// TODO Auto-generated method stub
		return marcaRepository.getMarcaByNombre(marca);
	}


}
