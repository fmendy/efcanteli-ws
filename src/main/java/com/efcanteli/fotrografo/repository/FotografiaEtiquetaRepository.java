package com.efcanteli.fotrografo.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.efcanteli.fotrografo.model.Etiqueta;
import com.efcanteli.fotrografo.model.FotografiaEtiqueta;

@Repository
public interface FotografiaEtiquetaRepository extends CrudRepository<FotografiaEtiqueta, Integer>{

	@Transactional
	@Modifying
	@Query("UPDATE FotografiaEtiqueta set activo = 0 where idEtiqueta = :#{#etiqueta.idEtiqueta}")
	public int desactivarEtiqueta(Etiqueta etiqueta);
}
