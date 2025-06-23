package com.example.demo.controller;

import com.example.demo.dto.PersonaDTO;
import com.example.demo.service.PersonaService;

public class PersonaController {

	private PersonaService personaService = new PersonaService();

	public String agregarPersona(PersonaDTO personadto) {
		String mensaje = personaService.crearPersona(personadto);
		return mensaje;

	}
	
}
