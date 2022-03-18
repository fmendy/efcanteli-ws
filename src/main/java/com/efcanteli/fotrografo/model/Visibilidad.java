package com.efcanteli.fotrografo.model;


public enum Visibilidad {

	PUBLICO(1, "publico"), PRIVADO(2, "privado");
	
	private final int idVisibilidad;
	private final String nombre;
	
	private Visibilidad(int idVisibilidad, String nombre) {
		this.idVisibilidad = idVisibilidad;
		this.nombre = nombre;
	}

	public int getIdVisibilidad() {
		return idVisibilidad;
	}

	public String getNombre() {
		return nombre;
	}
	
	public static Visibilidad from(int idVisibilidad) {
		for (Visibilidad visibilidad : values()) {
			if (visibilidad.getIdVisibilidad() == idVisibilidad) {
				return visibilidad;
			}
		}
		return null;
	}

	public static Visibilidad from(String nombre) {
		for (Visibilidad visibilidad : values()) {
			if (visibilidad.getNombre().equalsIgnoreCase(nombre)) {
				return visibilidad;
			}
		}
		return null;
	}
}
