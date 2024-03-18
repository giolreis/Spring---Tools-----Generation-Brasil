package com.helloWorld.Objetivo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

public class ObjetivoController {

	    @GetMapping("/objectives")
	    public List<String> getObjectives() {
	        return Arrays.asList("Aprender Spring Boot", "Implementar endpoints REST", "Entender conceitos de controle de versão com Git");
	    }
}
