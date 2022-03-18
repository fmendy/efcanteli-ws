package com.efcanteli.fotrografo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "fotografiaEtiqueta")
public class FotografiaEtiqueta implements Serializable{

	private static final long serialVersionUID = 985853822743763436L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idFotografiaEtiqueta", insertable = false)
	private int idFotografiaEtiqueta;
	
	@JsonIgnore
	@ManyToOne
    @JoinColumn(name = "idFotografia")
	private Fotografia fotografia;
	
	
	@ManyToOne
	@JoinColumn(name = "idEtiqueta")
	private Etiqueta etiqueta;
	
	
	@Column(name = "activo", nullable = false, insertable = false)
	private boolean activo;

	public int getIdFotografiaEtiqueta() {
		return idFotografiaEtiqueta;
	}

	public void setIdFotografiaEtiqueta(int idFotografiaEtiqueta) {
		this.idFotografiaEtiqueta = idFotografiaEtiqueta;
	}

	public Fotografia getFotografia() {
		return fotografia;
	}

	public void setFotografia(Fotografia fotografia) {
		this.fotografia = fotografia;
	}

	public Etiqueta getEtiqueta() {
		return etiqueta;
	}

	public void setEtiqueta(Etiqueta etiqueta) {
		this.etiqueta = etiqueta;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}	
}
