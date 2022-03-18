package com.efcanteli.fotrografo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.efcanteli.fotrografo.model.Camara;
import com.efcanteli.fotrografo.repository.CamaraRepository;
import com.efcanteli.fotrografo.service.CamaraService;



@Service
public class CamaraServiceImpl implements CamaraService{

	@Autowired
	private CamaraRepository camaraRepository;
	
	@Override
	public List<Camara> getAll() {
		// TODO Auto-generated method stub

		return camaraRepository.getAllActive();
	}

}
