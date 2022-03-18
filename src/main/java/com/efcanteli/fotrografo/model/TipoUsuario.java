package com.efcanteli.fotrografo.model;

public enum TipoUsuario {

	ADMINISTRADOR(1,"administrador"),CLIENTE(2,"cliente");
	
	private final int idTipoUsuario;
	private final String nombre;
	
	private TipoUsuario(int idTipoUsuario, String nombre) {
		this.idTipoUsuario = idTipoUsuario;
		this.nombre = nombre;
	}

	public int getIdTipoUsuario() {
		return idTipoUsuario;
	}

	public String getNombre() {
		return nombre;
	}
	
	public static TipoUsuario from(int idTipoUsuario) {
		for (TipoUsuario tipoUsuario : values()) {
			if (tipoUsuario.getIdTipoUsuario() == idTipoUsuario) {
				return tipoUsuario;
			}
		}
		return null;
	}

	public static TipoUsuario from(String nombre) {
		for (TipoUsuario tipoUsuario : values()) {
			if (tipoUsuario.getNombre().equalsIgnoreCase(nombre)) {
				return tipoUsuario;
			}
		}
		return null;
	}
	
}
