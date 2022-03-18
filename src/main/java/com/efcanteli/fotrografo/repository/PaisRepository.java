package com.efcanteli.fotrografo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.efcanteli.fotrografo.model.Pais;


public interface PaisRepository extends CrudRepository<Pais, Long>{

	@Query("from Pais")
	public List<Pais> getAll();
}
