package com.helloWorld.BSM.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;

@RestController
public class BSMController {

    @GetMapping("/bsms")
    public List<String> getBSMs() {
return Arrays.asList("Oriantacao ao Futuro","Orientacao ao Detalhe","Comunicacao","Responsabilidade Pessoal","Trabalho em Equipe",
		"Mentalidade de Crescimento","Persistencia","Proatividade");
    }
}
