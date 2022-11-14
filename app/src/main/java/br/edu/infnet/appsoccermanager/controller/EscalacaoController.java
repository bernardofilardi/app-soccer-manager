package br.edu.infnet.appsoccermanager.controller;

import br.edu.infnet.appsoccermanager.model.domain.Escalacao;
import br.edu.infnet.appsoccermanager.model.domain.Usuario;
import br.edu.infnet.appsoccermanager.model.service.EscalacaoService;
import br.edu.infnet.appsoccermanager.model.service.JogadorService;
import br.edu.infnet.appsoccermanager.model.service.TecnicoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@SessionAttributes("user")
public class EscalacaoController {
    EscalacaoService escalacaoService;

    TecnicoService tecnicoService;

    JogadorService jogadorService;

    public EscalacaoController(EscalacaoService escalacaoService, TecnicoService tecnicoService, JogadorService jogadorService) {
        this.escalacaoService = escalacaoService;
        this.tecnicoService = tecnicoService;
        this.jogadorService = jogadorService;
    }

    @GetMapping("/escalacao/lista")
    public String lista(Model model, @SessionAttribute("user") Usuario usuario) {
        model.addAttribute("listagem", escalacaoService.obterLista(usuario));
        return "escalacao/lista";
    }

    @GetMapping("/escalacao/{id}/excluir")
    public String remove(@PathVariable String id) {
        escalacaoService.excluir(Integer.parseInt(id));
        return "redirect:/escalacao/lista";
    }

    @GetMapping(value = "/escalacao")
    public String novo(Model model, @SessionAttribute("user") Usuario usuario) {

        model.addAttribute("tecnicos", tecnicoService.obterLista(usuario.getId()));

        model.addAttribute("jogadores", jogadorService.obterLista(usuario.getId()));

        return "escalacao/cadastro";
    }

    @PostMapping(value = "/escalacao/incluir")
    public String incluir(Escalacao escalacao, @SessionAttribute("user") Usuario usuario) {

        escalacao.setUsuario(usuario);
        escalacaoService.incluir(escalacao);

        return "redirect:/escalacao/lista";
    }

}
