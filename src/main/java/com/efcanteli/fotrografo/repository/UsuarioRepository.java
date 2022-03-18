package com.efcanteli.fotrografo.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.efcanteli.fotrografo.model.Camara;
import com.efcanteli.fotrografo.model.Usuario;

public interface UsuarioRepository extends CrudRepository<Camara, Integer> {

	@Query("from Usuario where (nickname = :userName or email = :userName) and password = :userPassword")
	public Usuario getUsuario(@Param("userName")String userName, @Param("userPassword")String userPassword);
}
