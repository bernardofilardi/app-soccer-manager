package br.edu.infnet.appsoccermanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MeioCampoController {

    @GetMapping("/meiocampo/lista")
    public String lista() {
        return "meiocampo/lista";
    }

}
