package br.edu.infnet.appsoccermanager.controller;

import br.edu.infnet.appsoccermanager.model.domain.Defesa;
import br.edu.infnet.appsoccermanager.model.domain.Usuario;
import br.edu.infnet.appsoccermanager.model.service.DefesaService;
import br.edu.infnet.appsoccermanager.model.service.JogadorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@SessionAttributes("user")
public class DefesaController {

    DefesaService defesaService;

    public DefesaController(DefesaService defesaService) {
        this.defesaService = defesaService;
    }

    @GetMapping("/defesa/lista")
    public String lista(Model model, @SessionAttribute("user") Usuario usuario) {
        model.addAttribute("listagem", defesaService.obterLista(usuario.getId()));
        return "defesa/lista";
    }

    @GetMapping("/defesa/{id}/excluir")
    public String remove(@PathVariable String id) {
        defesaService.excluir(Integer.parseInt(id));
        return "redirect:/defesa/lista";
    }

    @GetMapping("/defesa")
    public String novo() {
        return "defesa/cadastro";
    }

    @PostMapping("/defesa/incluir")
    public String cadastrar(Defesa defesa) {
        defesaService.incluir(defesa);
        return "redirect:/defesa/lista";
    }

}
