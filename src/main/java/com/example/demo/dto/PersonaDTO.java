package com.example.demo.dto;

public class PersonaDTO {

	private String nie;
	private String nombre;
	private String apellidos;

	public PersonaDTO() {
		super();
	}

	public PersonaDTO(String nie, String nombre, String apellidos) {
		super();
		this.nie = nie;
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

	public String getNie() {
		return nie;
	}

	public void setNie(String nie) {
		this.nie = nie;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}



}
