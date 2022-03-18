package com.efcanteli.fotrografo.repository;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.efcanteli.fotrografo.model.Marca;


@Repository
public interface MarcaRepository  extends CrudRepository<Marca, Long>{

	@Query("from Marca where activo = 1")
	public List<Marca> getAllActive();
	
	@Query("from Marca m where m.idMarca = :#{#marca.idMarca} and m.activo = 1")
	public Marca getMarcaById(Marca marca);
	
	@Query("from Marca m where m.nombre like %:#{#marca.nombre}% and m.activo = 1")
	public List<Marca> getMarcaByNombre(Marca marca);
}
