package br.edu.infnet.appsoccermanager.controller;

import br.edu.infnet.appsoccermanager.model.domain.Tecnico;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Controller
public class TecnicoController {

    private static Map<Integer, Tecnico> mapa = new HashMap<>();

    private static Integer id = 1;

    public static void incluir(Tecnico tecnico) {
        tecnico.setId(id);
        mapa.put(id, tecnico);
        id++;
    }

    public static void excluir(Integer id) {
        mapa.remove(id);
    }


    public static Collection<Tecnico> obterLista() {
        return mapa.values();
    }

    @GetMapping("/tecnico/lista")
    public String lista(Model model) {
        model.addAttribute("listagem", obterLista());

        return "tecnico/lista";
    }
    @GetMapping("/tecnico/{id}/excluir")
    public String remove(@PathVariable String id) {
        excluir(Integer.parseInt(id));
        return "redirect:/tecnico/lista";
    }
}
