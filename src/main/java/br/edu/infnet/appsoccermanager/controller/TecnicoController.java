package br.edu.infnet.appsoccermanager.controller;

import br.edu.infnet.appsoccermanager.model.service.TecnicoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class TecnicoController {

    TecnicoService tecnicoService;
    public TecnicoController(TecnicoService tecnicoService) {
        this.tecnicoService = tecnicoService;
    }

    @GetMapping("/tecnico/lista")
    public String lista(Model model) {
        model.addAttribute("listagem", tecnicoService.obterLista());

        return "tecnico/lista";
    }
    @GetMapping("/tecnico/{id}/excluir")
    public String remove(@PathVariable String id) {
        tecnicoService.excluir(Integer.parseInt(id));
        return "redirect:/tecnico/lista";
    }
}