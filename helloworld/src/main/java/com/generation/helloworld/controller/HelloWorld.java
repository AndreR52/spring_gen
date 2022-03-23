package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorld {
	
	@GetMapping
	public String helloworld () {
		return "Hello World!!!";
	}
	
	@GetMapping("bsm")
	public String bsm () {
		return "Lista BSM: "
				+ "\n\nMentalidades:"
				+ "\n	-Orientação ou futuro"
				+ "\n	-Responsabilidade pessoal"
				+ "\n	-Mentalidade de crescimento"
				+ "\n	-Persistência"
				+ "\n\nHabilidades:"
				+ "\n	-Trabalho em equipe"
				+ "\n	-Atenção aos detalhes"
				+ "\n	-Proatividade"
				+ "\n	-Comunicação";		
	}
	
	@GetMapping("objetivos")
	public String objetivos () {
		return "Lista de objetivos de aprendizagem:"
				+ "\n	-Melhorar orientação ao detalhe"
				+ "\n	-Aumentar o entendimento de banco de dados"
				+ "\n	-Aumentar o conhecimento de Spring";
	}

}
