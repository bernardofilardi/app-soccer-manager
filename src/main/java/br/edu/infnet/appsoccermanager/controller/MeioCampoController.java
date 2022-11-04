package br.edu.infnet.appsoccermanager.controller;

import br.edu.infnet.appsoccermanager.model.domain.MeioCampo;
import br.edu.infnet.appsoccermanager.model.service.EscalacaoService;
import br.edu.infnet.appsoccermanager.model.service.MeioCampoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

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

}
