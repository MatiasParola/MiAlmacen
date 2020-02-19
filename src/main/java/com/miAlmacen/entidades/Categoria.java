package com.miAlmacen.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Categoria {
	@Id
	@GeneratedValue(generator="uuid")
	@GenericGenerator(name="uuid", strategy = "uuid2")
	private String idCategoria;
	private String nombreCategoria;
	private boolean disponibilidadCategoria;
//helados, conservas, frutas y verduras, golosinas, comestible, perfumeria, bazar, panificadora, lacteos, bebidas, carnes, otros//
	public String getIdCategoria() {
		return idCategoria;
	}
	public void setIdCategoria(String idCategoria) {
		this.idCategoria = idCategoria;
	}
	public String getNombreCategoria() {
		return nombreCategoria;
	}
	public void setNombreCategoria(String nombreCategoria) {
		this.nombreCategoria = nombreCategoria;
	}
	public boolean isDisponibilidadCategoria() {
		return disponibilidadCategoria;
	}
	public void setDisponibilidadCategoria(boolean disponibilidadCategoria) {
		this.disponibilidadCategoria = disponibilidadCategoria;
	}
}