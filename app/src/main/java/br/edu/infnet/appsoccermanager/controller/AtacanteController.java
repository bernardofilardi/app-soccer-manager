package br.edu.infnet.appsoccermanager.controller;

import br.edu.infnet.appsoccermanager.model.domain.Atacante;
import br.edu.infnet.appsoccermanager.model.domain.Usuario;
import br.edu.infnet.appsoccermanager.model.service.AtacanteService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@SessionAttributes("user")
public class AtacanteController {

    AtacanteService atacanteService;

    public AtacanteController(AtacanteService atacanteService) {
        this.atacanteService = atacanteService;
    }

    @GetMapping("/atacante/lista")
    public String lista(Model model, @SessionAttribute("user") Usuario usuario) {
        model.addAttribute("listagem", atacanteService.obterLista(usuario.getId()));
        return "atacante/lista";
    }

    @GetMapping("/atacante/{id}/excluir")
    public String remove(@PathVariable String id) {
        atacanteService.excluir(Integer.parseInt(id));
        return "redirect:/atacante/lista";
    }

    @GetMapping("/atacante")
    public String novo() {
        return "atacante/cadastro";
    }

    @PostMapping("/atacante/incluir")
    public String cadastrar(Atacante atacante) {
        atacanteService.incluir(atacante);
        return "redirect:/atacante/lista";
    }

}
