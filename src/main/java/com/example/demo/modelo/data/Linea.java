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
	
}
