package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.PersonaDTO;
import com.example.demo.service.PersonaService;

@RestController
public class PersonaController {

	private PersonaService personaService = new PersonaService();

	@PostMapping
	public String agregarPersona(@RequestBody PersonaDTO personadto) {
		String mensaje = personaService.crearPersona(personadto);
		return mensaje;

	}
	
	@GetMapping
	public List<PersonaDTO> consultarPersonas() {
		List<PersonaDTO> listaPersonas = personaService.consultarPeronas();
		return listaPersonas;
	}

}
