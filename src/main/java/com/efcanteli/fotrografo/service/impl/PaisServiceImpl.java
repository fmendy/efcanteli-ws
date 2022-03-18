package com.efcanteli.fotrografo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.efcanteli.fotrografo.model.Pais;
import com.efcanteli.fotrografo.repository.PaisRepository;
import com.efcanteli.fotrografo.service.PaisService;


@Service
public class PaisServiceImpl implements PaisService {

	@Autowired
	private PaisRepository paisRepository;
	
	@Override
	public List<Pais> getAll() {
		// TODO Auto-generated method stub
		return paisRepository.getAll();
	}

}
