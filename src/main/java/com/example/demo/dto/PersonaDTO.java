package com.example.demo.dto;

public class PersonaDTO {

	private String nie;
	private String nombre;
	private String linares;

	public PersonaDTO() {
		super();
	}

	public PersonaDTO(String nie, String nombre, String linares) {
		super();
		this.nie = nie;
		this.nombre = nombre;
		this.linares = linares;
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

	public String getLinares() {
		return linares;
	}

	public void setLinares(String linares) {
		this.linares = linares;
	}

}
