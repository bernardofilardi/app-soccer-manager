package br.edu.infnet.appsoccermanager.controller;

import br.edu.infnet.appsoccermanager.model.domain.Atacante;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Controller
public class AtacanteController {

    private static Map<Integer, Atacante> mapa = new HashMap<>();

    private static Integer id = 1;

    public static void incluir(Atacante atacante) {
        atacante.setId(id);
        mapa.put(id, atacante);
        id++;
    }

    public static void excluir(Integer id) {
        mapa.remove(id);
    }

    public static Collection<Atacante> obterLista() {
        return mapa.values();
    }

    @GetMapping("/atacante/lista")
    public String lista(Model model) {
        model.addAttribute("listagem", obterLista());
        return "atacante/lista";
    }

    @GetMapping("/atacante/{id}/excluir")
    public String remove(@PathVariable String id) {
        excluir(Integer.parseInt(id));
        return "redirect:/atacante/lista";
    }

}
