package com.example.demo.repository.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;


@Entity
@Table(name = "horario")
public class Horario {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_hora")
	@SequenceGenerator(name = "seq_hora", sequenceName = "seq_hora", allocationSize = 1)
	@Column(name = "hora_id")
	private Integer id;

	@Column(name = "hora_nombre_profesor")
	private String nombreProfesor;
	
	@Column(name = "hora_codigo_clase")
	private String codigoClase;

	
	@Column(name = "hora_aula")
	private String aula;

	
	//SET y GET

	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNombreProfesor() {
		return nombreProfesor;
	}


	public void setNombreProfesor(String nombreProfesor) {
		this.nombreProfesor = nombreProfesor;
	}


	public String getCodigoClase() {
		return codigoClase;
	}


	public void setCodigoClase(String codigoClase) {
		this.codigoClase = codigoClase;
	}


	public String getAula() {
		return aula;
	}


	public void setAula(String aula) {
		this.aula = aula;
	}


	@Override
	public String toString() {
		return "Horario [id=" + id + ", nombreProfesor=" + nombreProfesor + ", codigoClase=" + codigoClase + ", aula="
				+ aula + "]";
	}


}
