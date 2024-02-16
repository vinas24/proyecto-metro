package com.example.demo.modelo.data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table (name = "Linea")
public class Linea {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column (name = "id")
	private long id;
	@Column (name = "color")
	private String color;
	@Column (name = "longitud")
	private double longitud;
	@Column (name = "numero_paradas")
	private int numParadas;
	@ManyToOne
	@JoinColumn(name = "tipo_linea")
	private TipoLinea tipo;
	
	public Linea() {
		super();
	}

	public Linea(long id, String color, double longitud, int numParadas, TipoLinea tipo) {
		super();
		this.id = id;
		this.color = color;
		this.longitud = longitud;
		this.numParadas = numParadas;
		this.tipo = tipo;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getLongitud() {
		return longitud;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

	public int getNumParadas() {
		return numParadas;
	}

	public void setNumParadas(int numParadas) {
		this.numParadas = numParadas;
	}

	public TipoLinea getTipo() {
		return tipo;
	}

	public void setTipo(TipoLinea tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Linea [id=" + id + ", color=" + color + ", longitud=" + longitud + ", numParadas=" + numParadas
				+ ", tipo=" + tipo + "]";
	}
	
	
}
