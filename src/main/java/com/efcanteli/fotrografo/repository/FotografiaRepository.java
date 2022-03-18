package com.efcanteli.fotrografo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.efcanteli.fotrografo.model.Camara;
import com.efcanteli.fotrografo.model.Fotografia;
import com.efcanteli.fotrografo.model.Objetivo;
import com.efcanteli.fotrografo.model.Pais;

public interface FotografiaRepository extends CrudRepository<Fotografia, Integer> {

	@Query("from Fotografia where idPais = :#{#pais.idPais} and activo = 1 ")
	public List<Fotografia> getFotografiasByPais(Pais pais);

	@Query("from Fotografia where idCamara = :#{#camara.idCamara} and activo = 1")
	public List<Fotografia> getFotografiasByCamara(Camara camara);

	@Query("from Fotografia where idCamara = :#{#objetivo.idObjetivo} and activo = 1")
	public List<Fotografia> getFotografiasByObjetivo(Objetivo objetivo);

	@Query("from Fotografia where activo = 1")
	public List<Fotografia> getAll();

	@SuppressWarnings("unchecked")
	public Fotografia save(Fotografia fotografia);

	@Query("from Fotografia f where f.idFotografia = :#{#fotografia.idFotografia} and f.activo = 1 ")
	public Fotografia getFotografiaById(Fotografia fotografia);
}
