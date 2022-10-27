package br.edu.infnet.appsoccermanager;

import br.edu.infnet.appsoccermanager.model.domain.*;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Order(1)
@Component
public class EscalacaoTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("### Cadastro de Escalações ###");

        Atacante atacante = new Atacante();
        atacante.setNome("Gabriel Barbosa");
        atacante.setAltura(Float.parseFloat("1.78"));
        atacante.setPeso(Float.parseFloat("77"));
        atacante.setAnalise("Atacante com presença de área e finalização da entrada da mesma.");
        atacante.setAtua_meiocampo(false);
        atacante.setAcerto_finalizacao(Float.parseFloat("72"));

        Defesa defesa = new Defesa();
        defesa.setNome("David Luiz");
        defesa.setAltura(Float.parseFloat("1.88"));
        defesa.setPeso(Float.parseFloat("85"));
        defesa.setAnalise("Seguro na defesa. Liderança dentro de campo. Apoio emocional para jovens.");
        defesa.setAtua_volante(true);
        defesa.setAcerto_desarme(Float.parseFloat("92"));

        MeioCampo meioCampo = new MeioCampo();
        meioCampo.setNome("Giorgian De Arrascaeta");
        meioCampo.setAltura(Float.parseFloat("1.80"));
        meioCampo.setPeso(Float.parseFloat("77"));
        meioCampo.setAnalise("Visão de jogo e ótimo passe. Contribui muito nas infiltrações.");
        meioCampo.setAtua_ataque(false);
        meioCampo.setAcerto_passe(Float.parseFloat("85")) ;

        List<Jogador> jogadores = new ArrayList<>();
        jogadores.add(atacante);
        jogadores.add(defesa);
        jogadores.add(meioCampo);

        Tecnico tecnico = new Tecnico();
        tecnico.setNome("Dorival Jr.");
        tecnico.setIdade(64);
        tecnico.setTempo_carreira(32);
        System.out.println("> Técnico 1: " + tecnico);

        Escalacao escalacao1 = new Escalacao(tecnico);
        escalacao1.setDescricao("4-3-3 Ofensivo");
        escalacao1.setOrganizacao("4-3-3");
        escalacao1.setUtilizada_anteriormente(false);
        escalacao1.setDescricao("Para situações de pressão contra adversários. Necessita de jogadores rápidos e com resistência física apurada");
        escalacao1.setJogadores(jogadores);
        System.out.println("> Escalação 1: " + escalacao1);

        Escalacao escalacao2 = new Escalacao(tecnico);
        escalacao2.setDescricao("4-4-2 Conservador");
        escalacao2.setOrganizacao("4-4-2");
        escalacao2.setUtilizada_anteriormente(true);
        escalacao2.setDescricao("Favorece o toque de bola e o jogo mais compacto do time. Boa pedida para situações onde o objetivo é priorizar a posse de bola");
        escalacao2.setJogadores(jogadores);
        System.out.println("> Escalação 2: " + escalacao2);

        Escalacao escalacao3 = new Escalacao(tecnico);
        escalacao3.setDescricao("4-5-1 Árvore");
        escalacao3.setOrganizacao("4-2-3-1");
        escalacao3.setUtilizada_anteriormente(true);
        escalacao3.setDescricao("Modelo que popula o meio campo com muitos jogadores. Funciona bem defensivamente para prejudicar o toque de bola adversário");
        escalacao3.setJogadores(jogadores);
        System.out.println("> Escalação 3: " + escalacao3);
    }
}
