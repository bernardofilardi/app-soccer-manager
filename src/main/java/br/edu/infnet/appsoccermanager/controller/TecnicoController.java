package br.edu.infnet.appsoccermanager.controller;

import br.edu.infnet.appsoccermanager.model.domain.Tecnico;
import br.edu.infnet.appsoccermanager.model.service.TecnicoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("user")
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

    @GetMapping(value = "/tecnico")
    public String novo() {
        return "tecnico/cadastro";
    }

    @PostMapping(value = "/tecnico/incluir")
    public String incluir(Tecnico tecnico) {

        tecnicoService.incluir(tecnico);

        return "redirect:/tecnico/lista";
    }

}
