package br.edu.infnet.appsoccermanager.controller;

import br.edu.infnet.appsoccermanager.model.domain.Atacante;
import br.edu.infnet.appsoccermanager.model.domain.Jogador;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AtacanteController {

    @GetMapping("/atacante/lista")
    public String lista(Model model) {
        Atacante atacante1 = new Atacante();
        atacante1.setNome("Gabriel Barbosa");
        atacante1.setAltura(Float.parseFloat("1.78"));
        atacante1.setPeso(Float.parseFloat("77"));
        atacante1.setAnalise("Atacante com presença de área e finalização da entrada da mesma.");
        atacante1.setAtua_meiocampo(false);
        atacante1.setAcerto_finalizacao(Float.parseFloat("72"));

        Atacante atacante2 = new Atacante();
        atacante2.setNome("Bruno Henrique");
        atacante2.setAltura(Float.parseFloat("1.80"));
        atacante2.setPeso(Float.parseFloat("75"));
        atacante2.setAnalise("Atacante que joga pelo lado do campo.");
        atacante2.setAtua_meiocampo(false);
        atacante2.setAcerto_finalizacao(Float.parseFloat("70"));

        Atacante atacante3 = new Atacante();
        atacante3.setNome("Pedro Guilherme");
        atacante3.setAltura(Float.parseFloat("1.82"));
        atacante3.setPeso(Float.parseFloat("82"));
        atacante3.setAnalise("Atacante com grande porte físico, presença de área, mas sem muita velocidade. Ótimo posicionamento dentro de campo.");
        atacante3.setAtua_meiocampo(false);
        atacante3.setAcerto_finalizacao(Float.parseFloat("78"));

        List<Jogador> atacantes = new ArrayList<>();
        atacantes.add(atacante1);
        atacantes.add(atacante2);
        atacantes.add(atacante3);

        model.addAttribute("listagem", atacantes);

        return "atacante/lista";
    }

}
