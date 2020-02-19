package com.miAlmacen.web.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


import org.hibernate.annotations.GenericGenerator;

@Entity
public class Producto {
	@Id
	@GeneratedValue(generator="uuid")
	@GenericGenerator(name="uuid", strategy = "uuid2")
	private String idProducto;
	
	private String nombreProducto;
	private double precioProducto;
	private boolean disponibilidadProducto;

	@ManyToOne
	private Categoria categoria;

    public Producto() {
    }

    public Producto( String nombreProducto, double precioProducto, Categoria categoria) {

        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
        disponibilidadProducto = true;
        this.categoria = categoria;
    }
        
        
        


	public String getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(String idProducto) {
		this.idProducto = idProducto;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public double getPrecioProducto() {
		return precioProducto;
	}

	public void setPrecioProducto(double precioProducto) {
		this.precioProducto = precioProducto;
	}

	public boolean isDisponibilidadProducto() {
		return disponibilidadProducto;
	}

	public void setDisponibilidadProducto(boolean disponibilidadProducto) {
		this.disponibilidadProducto = disponibilidadProducto;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	
}
