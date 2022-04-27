package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@GetMapping
	public String hello() {
		return "Hello World!";
	}
	
	@GetMapping("/bsm")
	public String bsm() {
		return 
				"Behavioral Skills and Mindsets - Habilidades Comportamentais e Mentalidades: <br />"
				+ "<br />BSM-0 - Introdução às Habilidades Comportamentais e Mentalidades <br /> "
				+ "BSM-GM - Mentalidade de Crescimento <br />"
				+ "BSM-P - Persistência <br />"
				+ "BSM-PR - Responsabilidade Pessoal <br />"
				+ "BSM-FO - Orientação ao Futuro <br />"
				+ "BSM-C - Comunicação <br />"
				+ "BSM-OD - Orientação ao Detalhe <br />"
				+ "BSM-PA - Proatividade <br />"
				+ "BSM-T - Trabalho em Equipe <br />";
	}
	
	@GetMapping("/objetivos")
	public String objetivos() {
		return 
				"OBJETIVOS DE APRENDIZAGEM PESSOAL: <br />"
				+ "<br />1º Aprender as funcionalidades do Spring Boot <br />"
				+ "2º Dar início ao projeto do meu Blog Pessoal <br />"
				+ "3º Finalizar curso de Java Mobile que iniciei semana passada <br />"
				+ "4º Procurar novos cursos e/ou bootcamps para aperfeiçoar meus conhecimentos <br />"
				+ "5º Me divertir e aprender!";
	}
}
