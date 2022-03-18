package com.efcanteli.fotrografo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.efcanteli.fotrografo.model.Camara;



public interface CamaraRepository extends CrudRepository<Camara, Integer>{

	@Query("from Camara where activo = 1")
	public List<Camara> getAllActive();

}
