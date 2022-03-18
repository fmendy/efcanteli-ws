package com.efcanteli.fotrografo.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "fotografia")
public class Fotografia implements Serializable {

	private static final long serialVersionUID = 82338787529830147L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idFotografia", insertable = false)
	private int idFotografia;
	
	
	//@JsonBackReference(value="fotografia-camara")
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idCamara")
	private Camara camara;
	
	
	//@JsonBackReference(value="fotografia-objetivo")
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idObjetivo")
	private Objetivo objetivo;
	
	//@JsonBackReference(value="fotografia-pais")
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idPais")
	private Pais pais;
	
	@Enumerated(EnumType.ORDINAL)
	@Column(name = "idVisibilidad", nullable = false, insertable = false)
	private Visibilidad visibilidad;
	
	@Column(name = "titulo")
	private String titulo;
	
	@Column(name = "descripcion")
	private String descripcion;
	
	@Column(name = "fechaRealizacion")
	private Date fechaRealizacion;
	
	private String localizacionArchivo;
	
	@OneToMany(mappedBy = "fotografia")
    private List<FotografiaEtiqueta> fotografiaEtiquetas;
	
	@JsonIgnore
	@Column(name = "activo", nullable = false, insertable = false)
	private boolean activo;

	public int getIdFotografia() {
		return idFotografia;
	}

	public void setIdFotografia(int idFotografia) {
		this.idFotografia = idFotografia;
	}

	public Camara getCamara() {
		return camara;
	}

	public void setCamara(Camara camara) {
		this.camara = camara;
	}

	public Objetivo getObjetivo() {
		return objetivo;
	}

	public void setObjetivo(Objetivo objetivo) {
		this.objetivo = objetivo;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public Visibilidad getVisibilidad() {
		return visibilidad;
	}

	public void setVisibilidad(Visibilidad visibilidad) {
		this.visibilidad = visibilidad;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getFechaRealizacion() {
		return fechaRealizacion;
	}

	public void setFechaRealizacion(Date fechaRealizacion) {
		this.fechaRealizacion = fechaRealizacion;
	}

	public String getLocalizacionArchivo() {
		return localizacionArchivo;
	}

	public void setLocalizacionArchivo(String localizacionArchivo) {
		this.localizacionArchivo = localizacionArchivo;
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

