package br.edu.infnet.appsoccermanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TecnicoController {

    @GetMapping("/tecnico/lista")
    public String lista() {
        return "tecnico/lista";
    }

}
