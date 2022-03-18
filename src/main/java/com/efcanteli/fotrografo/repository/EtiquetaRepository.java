package com.efcanteli.fotrografo.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.efcanteli.fotrografo.model.Etiqueta;

@Repository
public interface EtiquetaRepository extends CrudRepository<Etiqueta, Integer> {

	@Query("from Etiqueta where activo = 1")
	public List<Etiqueta> getAllActive();

	@Query("from Etiqueta where upper(nombre) like %:#{#etiqueta.nombre}% and activo = 1")
	public List<Etiqueta> getEtiquetasByNombre(Etiqueta etiqueta);

	@Query("from Etiqueta where upper(nombre) = :#{#etiqueta.nombre} and activo = 1")
	public Etiqueta getEtiquetaByNombre(Etiqueta etiqueta);

	@SuppressWarnings("unchecked")
	public Etiqueta save(Etiqueta etiqueta);

	@Transactional
	@Modifying
	@Query("UPDATE Etiqueta set activo = 0 where idEtiqueta = :#{#etiqueta.idEtiqueta}")
	public int desactivar(Etiqueta etiqueta);
	
	@Query("from Etiqueta where idEtiqueta = :#{#etiqueta.idEtiqueta} and activo = 1")
	public Etiqueta getEtiquetaById(Etiqueta etiqueta);
	
	@Query("Select DISTINCT(fe.etiqueta) from FotografiaEtiqueta fe where fe.activo = 1 order by fe.etiqueta.nombre")
	public List<Etiqueta> getAllUsed();
	
	@Transactional
	@Modifying
	@Query("UPDATE Etiqueta set nombre = :#{#etiqueta.nombre} where idEtiqueta = :#{#etiqueta.idEtiqueta}")
	public int actualizar(Etiqueta etiqueta);
}

