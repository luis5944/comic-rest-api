package com.luisfn.comic.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "colecciones")
public class Coleccion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idColeccion;
	@Column
	private String nombreColeccion;
	@Column(columnDefinition = "TEXT")
	private String sinopsisCol;
	@Column(name = "imagenCol")
	private String imagenCol;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "coleccion")
	// @JsonManagedReference
	@JsonBackReference
	private List<Numero> numeros;

	public Coleccion() {

	}

	public Coleccion(Long idColeccion, String nombreColeccion, String sinopsisCol, String imagenCol,
			List<Numero> numeros) {
		super();
		this.idColeccion = idColeccion;
		this.nombreColeccion = nombreColeccion;
		this.sinopsisCol = sinopsisCol;
		this.imagenCol = imagenCol;
		this.numeros = numeros;
	}

	public List<Numero> getNumeros() {
		return numeros;
	}

	public void setNumeros(List<Numero> numeros) {
		this.numeros = numeros;
	}

	public Long getIdColeccion() {
		return idColeccion;
	}

	public void setIdColeccion(Long idColeccion) {
		this.idColeccion = idColeccion;
	}

	public String getNombreColeccion() {
		return nombreColeccion;
	}

	public void setNombreColeccion(String nombreColeccion) {
		this.nombreColeccion = nombreColeccion;
	}

	public String getSinopsisCol() {
		return sinopsisCol;
	}

	public void setSinopsisCol(String sinopsisCol) {
		this.sinopsisCol = sinopsisCol;
	}

	public String getImagenCol() {
		return imagenCol;
	}

	public void setImagenCol(String imagenCol) {
		this.imagenCol = imagenCol;
	}

}
