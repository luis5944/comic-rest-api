package com.luisfn.comic.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "numeros")
public class Numero {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idNumero;

	@Column(name = "titulo")
	private String titulo;

	@Column(name = "sinopsis_num", columnDefinition = "TEXT")
	private String sinopsisNum;

	@Column(name = "fecha_adquisicion")
	private Date fechaAdquisicion;

	@Column
	private double precio;

	@Column(columnDefinition = "TEXT")
	private String imagen;

	@Column
	private int numeroComic;

	@ManyToOne
	@JoinColumn(name = "id_estado")
	private Estado estado;

	@ManyToOne
	@JoinColumn(name = "id_coleccion", nullable = false, updatable = false)
	// @JsonBackReference
	@JsonManagedReference
	private Coleccion coleccion;

	public Numero() {

	}

	public Numero(Long idNumero, String titulo, String sinopsisNum, Date fechaAdquisicion, double precio, String imagen,
			int numeroComic, Estado estado, Coleccion coleccion) {
		super();
		this.idNumero = idNumero;
		this.titulo = titulo;
		this.sinopsisNum = sinopsisNum;
		this.fechaAdquisicion = fechaAdquisicion;
		this.precio = precio;
		this.imagen = imagen;
		this.numeroComic = numeroComic;
		this.estado = estado;
		this.coleccion = coleccion;
	}

	public Coleccion getColeccion() {
		return coleccion;
	}

	public void setColeccion(Coleccion coleccion) {
		this.coleccion = coleccion;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public Long getIdNumero() {
		return idNumero;
	}

	public void setIdNumero(Long idNumero) {
		this.idNumero = idNumero;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getSinopsisNum() {
		return sinopsisNum;
	}

	public void setSinopsisNum(String sinopsisNum) {
		this.sinopsisNum = sinopsisNum;
	}

	public Date getFechaAdquisicion() {
		return fechaAdquisicion;
	}

	public void setFechaAdquisicion(Date fechaAdquisicion) {
		this.fechaAdquisicion = fechaAdquisicion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public int getNumeroComic() {
		return numeroComic;
	}

	public void setNumeroComic(int numeroComic) {
		this.numeroComic = numeroComic;
	}

}
