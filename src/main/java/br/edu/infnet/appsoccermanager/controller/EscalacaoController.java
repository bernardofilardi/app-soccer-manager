package br.edu.infnet.appsoccermanager.controller;

import br.edu.infnet.appsoccermanager.model.service.EscalacaoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class EscalacaoController {
    EscalacaoService escalacaoService;
    public EscalacaoController(EscalacaoService escalacaoService) {
        this.escalacaoService = escalacaoService;
    }

    @GetMapping("/escalacao/lista")
    public String lista(Model model) {
        model.addAttribute("listagem", escalacaoService.obterLista());
        return "escalacao/lista";
    }

    @GetMapping("/escalacao/{id}/excluir")
    public String remove(@PathVariable String id) {
        escalacaoService.excluir(Integer.parseInt(id));
        return "redirect:/escalacao/lista";
    }

}
