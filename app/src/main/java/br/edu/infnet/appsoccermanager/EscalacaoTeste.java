package br.edu.infnet.appsoccermanager;

import br.edu.infnet.appsoccermanager.model.domain.Escalacao;
import br.edu.infnet.appsoccermanager.model.domain.Jogador;
import br.edu.infnet.appsoccermanager.model.domain.Tecnico;
import br.edu.infnet.appsoccermanager.model.service.*;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Order(6)
@Component
public class EscalacaoTeste implements ApplicationRunner {

    private final EscalacaoService escalacaoService;
    private final JogadorService jogadorService;
    private final TecnicoService tecnicoService;
    private final UsuarioService usuarioService;

    EscalacaoTeste(EscalacaoService escalacaoService,
                   JogadorService jogadorService,
                   TecnicoService tecnicoService,
                   UsuarioService usuarioService)
    {
        this.escalacaoService = escalacaoService;
        this.jogadorService = jogadorService;
        this.tecnicoService = tecnicoService;
        this.usuarioService = usuarioService;
    }

    @Override
    public void run(ApplicationArguments args) {
        System.out.println("### Cadastro de Escalações ###");

        List<Jogador> jogadores = jogadorService.obterLista(usuarioService.busca("dorivaljr@mail.com").getId()).stream().toList();

        Tecnico tecnico = tecnicoService.obterLista().stream().filter(tec -> "Dorival Jr.".equals(tec.getNome())).findAny().orElseThrow();

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

        escalacaoService.incluir(escalacao1);
        escalacaoService.incluir(escalacao2);
        escalacaoService.incluir(escalacao3);
    }
}
