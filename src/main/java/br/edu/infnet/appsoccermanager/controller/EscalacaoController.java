package br.edu.infnet.appsoccermanager.controller;

import br.edu.infnet.appsoccermanager.model.domain.Escalacao;
import br.edu.infnet.appsoccermanager.model.service.EscalacaoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

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

    @GetMapping(value = "/escalacao")
    public String novo() {
        return "escalacao/cadastro";
    }

    @PostMapping(value = "/escalacao/incluir")
    public String incluir(Escalacao escalacao) {

        escalacaoService.incluir(escalacao);

        return "redirect:/escalacao/lista";
    }

}
