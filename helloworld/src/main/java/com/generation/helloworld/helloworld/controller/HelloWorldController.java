package com.generation.helloworld.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")

public class HelloWorldController {
	@GetMapping
	public String helloWorld() {
		return "Hello World!!!";
	}
	@GetMapping("BMS")
	public String bms() {
		return "COMUNICAÇÃO\r\n"
				+ "PROATVIDADE\r\n"
				+ "ORIENTAÇÃO AO DETALHE\r\n"
				+ "TRABALHO EM EQUIPE";
	}
	@GetMapping("objetivos")
	public String objetivos() {
		return "APRENDER INGLÊS\r\n"
				+ "-Continuar o curso\r\n"
				+ "-Melhorar meu speaking com o chat-gpt\r\n"
				+ "-Melhorar o Listen jogando Skyrim em inglês\r\n";
	}
	
	
	
}
