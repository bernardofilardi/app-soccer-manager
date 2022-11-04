package br.edu.infnet.appsoccermanager.controller;

import br.edu.infnet.appsoccermanager.model.service.DefesaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class DefesaController {

    DefesaService defesaService;
    public DefesaController(DefesaService DefesaService) {
        this.defesaService = DefesaService;
    }

    @GetMapping("/defesa/lista")
    public String lista(Model model) {
        model.addAttribute("listagem", defesaService.obterLista());
        return "defesa/lista";
    }

    @GetMapping("/defesa/{id}/excluir")
    public String remove(@PathVariable String id) {
        defesaService.excluir(Integer.parseInt(id));
        return "redirect:/defesa/lista";
    }
}
