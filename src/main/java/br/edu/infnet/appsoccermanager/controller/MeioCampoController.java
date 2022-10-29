package br.edu.infnet.appsoccermanager.controller;

import br.edu.infnet.appsoccermanager.model.domain.MeioCampo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Controller
public class MeioCampoController {

    private static Map<Integer, MeioCampo> mapa = new HashMap<>();

    private static Integer id = 1;

    public static void incluir(MeioCampo meioCampo) {
        meioCampo.setId(id);
        mapa.put(id, meioCampo);
        id++;
    }

    public static void excluir(Integer id) {
        mapa.remove(id);
    }

    public static Collection<MeioCampo> obterLista() {
        return mapa.values();
    }

    @GetMapping("/meiocampo/lista")
    public String lista(Model model) {
        model.addAttribute("listagem", obterLista());
        return "meiocampo/lista";
    }

    @GetMapping("/meiocampo/{id}/excluir")
    public String remove(@PathVariable String id) {
        excluir(Integer.parseInt(id));
        return "redirect:/meiocampo/lista";
    }

}
