package com.efcanteli.fotrografo.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "etiqueta")
public class Etiqueta implements Serializable {

	private static final long serialVersionUID = 6413274355782154285L;

	public Etiqueta() {
		super();
	}
	
	

	public Etiqueta(int idEtiqueta) {
		super();
		this.idEtiqueta = idEtiqueta;
	}



	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idEtiqueta", insertable = false)
	private int idEtiqueta;

	@Column(name = "nombre", nullable = false, length = 500, unique = true)
	private String nombre;

	@JsonIgnore
	@OneToMany(mappedBy = "etiqueta")
	private List<FotografiaEtiqueta> fotografiaEtiquetas;

	@JsonIgnore
	@Column(name = "activo", nullable = false, insertable = false)
	private boolean activo;

	public int getIdEtiqueta() {
		return idEtiqueta;
	}

	public void setIdEtiqueta(int idEtiqueta) {
		this.idEtiqueta = idEtiqueta;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	public List<FotografiaEtiqueta> getFotografiaEtiquetas() {
		return fotografiaEtiquetas;
	}

	public void setFotografiaEtiquetas(List<FotografiaEtiqueta> fotografiaEtiquetas) {
		this.fotografiaEtiquetas = fotografiaEtiquetas;
	}	
}
