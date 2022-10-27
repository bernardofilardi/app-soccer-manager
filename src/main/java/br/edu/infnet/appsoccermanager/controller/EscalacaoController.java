package br.edu.infnet.appsoccermanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EscalacaoController {

    @GetMapping("/escalacao/lista")
    public String lista() {
        return "escalacao/lista";
    }

}
