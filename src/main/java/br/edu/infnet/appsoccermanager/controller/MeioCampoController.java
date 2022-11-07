package br.edu.infnet.appsoccermanager.controller;

import br.edu.infnet.appsoccermanager.model.domain.MeioCampo;
import br.edu.infnet.appsoccermanager.model.service.MeioCampoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MeioCampoController {

    MeioCampoService meioCampoService;
    public MeioCampoController(MeioCampoService meioCampoService) {
        this.meioCampoService = meioCampoService;
    }

    @GetMapping("/meiocampo/lista")
    public String lista(Model model) {
        model.addAttribute("listagem", meioCampoService.obterLista());
        return "meiocampo/lista";
    }

    @GetMapping("/meiocampo/{id}/excluir")
    public String remove(@PathVariable String id) {
        meioCampoService.excluir(Integer.parseInt(id));
        return "redirect:/meiocampo/lista";
    }

    @GetMapping("/meiocampo")
    public String novo() {
        return "meiocampo/cadastro";
    }

    @PostMapping("/meiocampo/incluir")
    public String cadastrar(MeioCampo meiocampo) {
        meioCampoService.incluir(meiocampo);
        return "redirect:/meiocampo/lista";
    }

}
