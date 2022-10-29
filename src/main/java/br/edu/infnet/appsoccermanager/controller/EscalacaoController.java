package br.edu.infnet.appsoccermanager.controller;

import br.edu.infnet.appsoccermanager.model.domain.Escalacao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Controller
public class EscalacaoController {
    private static Map<Integer, Escalacao> mapa = new HashMap<>();
    private static Integer id = 1;
    public static void incluir(Escalacao escalacao) {
        escalacao.setId(id);
        mapa.put(id, escalacao);
        id++;
    }

    public static void excluir(Integer id) {
        mapa.remove(id);
    }

    public static Collection<Escalacao> obterLista() {
        return mapa.values();
    }

    @GetMapping("/escalacao/lista")
    public String lista(Model model) {
        model.addAttribute("listagem", obterLista());
        return "escalacao/lista";
    }

    @GetMapping("/escalacao/{id}/excluir")
    public String remove(@PathVariable String id) {
        excluir(Integer.parseInt(id));
        return "redirect:/escalacao/lista";
    }

}
