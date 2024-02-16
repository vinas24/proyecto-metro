package com.example.demo.modelo.data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "tipolinea")
public class TipoLinea {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	@Column (name = "tipo_linea")
	private String tipo;
	
	public TipoLinea() {
		super();
	}
	
	public TipoLinea(long id, String tipo) {
		super();
		this.id = id;
		this.tipo = tipo;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "TipoLinea [id=" + id + ", tipo=" + tipo + "]";
	}
}
