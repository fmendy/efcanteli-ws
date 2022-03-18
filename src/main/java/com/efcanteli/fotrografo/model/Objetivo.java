package com.efcanteli.fotrografo.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "objetivo")
public class Objetivo implements Serializable {
	
	private static final long serialVersionUID = -6078061060117959732L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idObjetivo")
	private int idObjetivo;
	
	@JsonBackReference(value="objetivo-marca")
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idMarca")
	private Marca marca;
	
	@Column(name = "modelo", length = 500, nullable = false)
	private String modelo;
	
	@Column(name = "descripcion", length = 500 )
	private String descripcion;
	
	@Column(name = "fechaFabricacion")
	private Date fechaFabricacion;
	
	@Column(name = "fechaAdquisicion")
	private Date fechaAdquisicion;
	
	@JsonIgnore
	@Column(name = "activo", nullable = false, insertable = false)
	private boolean activo;
	
	//@JsonBackReference(value="fotografia-objetivo")
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "objetivo")
	private List<Fotografia> fotografias;

	public int getIdObjetivo() {
		return idObjetivo;
	}

	public void setIdObjetivo(int idObjetivo) {
		this.idObjetivo = idObjetivo;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getFechaFabricacion() {
		return fechaFabricacion;
	}

	public void setFechaFabricacion(Date fechaFabricacion) {
		this.fechaFabricacion = fechaFabricacion;
	}

	public Date getFechaAdquisicion() {
		return fechaAdquisicion;
	}

	public void setFechaAdquisicion(Date fechaAdquisicion) {
		this.fechaAdquisicion = fechaAdquisicion;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	public List<Fotografia> getFotografias() {
		return fotografias;
	}

	public void setFotografias(List<Fotografia> fotografias) {
		this.fotografias = fotografias;
	}
	
}
