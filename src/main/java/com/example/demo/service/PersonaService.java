package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.dto.PersonaDTO;

public class PersonaService {

	private List<PersonaDTO> personas = new ArrayList<>();

	public List<PersonaDTO> consultarPeronas() {
		return personas;
	}

	public PersonaDTO consultarPersonaPorId(String nie) {
		for (PersonaDTO personaDTO : personas) {
			if (personaDTO.getNie().equals(nie)) {
				return personaDTO;
			}

		}
		return null;
	}

	public String crearPersona(PersonaDTO personaDTO) {

		PersonaDTO personaexite = consultarPersonaPorId(personaDTO.getNie());

		if (personaexite == null) {
			this.personas.add(personaDTO);
			return "se ha creado la persona con el nie: " + personaDTO.getNie();

		}
		return "la persona ya existe con el nie: " + personaDTO.getNie();

	}
}
