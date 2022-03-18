package com.efcanteli.fotrografo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.efcanteli.fotrografo.model.Objetivo;

public interface ObjetivoRepository extends CrudRepository<Objetivo, Long>{

	@Query("from Objetivo where activo = 1")
	public List<Objetivo> getAllActive();
}
