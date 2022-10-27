package br.edu.infnet.appsoccermanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DefesaController {

    @GetMapping("/defesa/lista")
    public String lista() {
        return "defesa/lista";
    }

}
