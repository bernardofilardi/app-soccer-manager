package br.edu.infnet.appsoccermanager;

import br.edu.infnet.appsoccermanager.controller.*;
import br.edu.infnet.appsoccermanager.model.domain.*;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Order(8)
@Component
public class EscalacaoTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("### Cadastro de Escalações ###");

        List<Jogador> jogadores = new ArrayList<>();
        jogadores.add(AtacanteController.obterLista().stream().filter(ata -> "Gabriel Barbosa".equals(ata.getNome())).findAny().orElseThrow());
        jogadores.add(DefesaController.obterLista().stream().filter(ata -> "David Luiz".equals(ata.getNome())).findAny().orElseThrow());
        jogadores.add(MeioCampoController.obterLista().stream().filter(ata -> "João Gomes".equals(ata.getNome())).findAny().orElseThrow());

        Tecnico tecnico = TecnicoController.obterLista().stream().filter(tec -> "Dorival Jr.".equals(tec.getNome())).findAny().orElseThrow();

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

        EscalacaoController.incluir(escalacao1);
        EscalacaoController.incluir(escalacao2);
        EscalacaoController.incluir(escalacao3);
    }
}
