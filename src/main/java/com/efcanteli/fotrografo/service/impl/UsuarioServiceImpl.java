package com.efcanteli.fotrografo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.efcanteli.fotrografo.model.Usuario;
import com.efcanteli.fotrografo.repository.UsuarioRepository;
import com.efcanteli.fotrografo.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;

	@SuppressWarnings("deprecation")
	@Override
	public Usuario getUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		return usuarioRepository.getUsuario(
				(StringUtils.isEmpty(usuario.getEmail()) ? usuario.getNickname() : usuario.getEmail()),
				usuario.getPassword());
	}

}
