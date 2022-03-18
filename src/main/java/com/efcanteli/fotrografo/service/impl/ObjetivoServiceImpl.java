package com.efcanteli.fotrografo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.efcanteli.fotrografo.model.Objetivo;
import com.efcanteli.fotrografo.repository.ObjetivoRepository;
import com.efcanteli.fotrografo.service.ObjetivoService;

@Service
public class ObjetivoServiceImpl implements ObjetivoService{

	@Autowired
	private ObjetivoRepository objetivoRepository;
	
	@Override
	public List<Objetivo> getAll() {
		// TODO Auto-generated method stub
		return objetivoRepository.getAllActive();
	}

}
