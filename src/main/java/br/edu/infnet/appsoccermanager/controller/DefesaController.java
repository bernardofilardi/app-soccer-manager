package br.edu.infnet.appsoccermanager.controller;

import br.edu.infnet.appsoccermanager.model.domain.Defesa;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Controller
public class DefesaController {

    private static Map<Integer, Defesa> mapa = new HashMap<>();

    private static Integer id = 1;

    public static void incluir(Defesa defesa) {
        defesa.setId(id);
        mapa.put(id, defesa);
        id++;
    }

    public static void excluir(Integer id) {
        mapa.remove(id);
    }

    public static Collection<Defesa> obterLista() {
        return mapa.values();
    }

    @GetMapping("/defesa/lista")
    public String lista(Model model) {
        model.addAttribute("listagem", obterLista());
        return "defesa/lista";
    }

    @GetMapping("/defesa/{id}/excluir")
    public String remove(@PathVariable String id) {
        excluir(Integer.parseInt(id));
        return "redirect:/defesa/lista";
    }
}
