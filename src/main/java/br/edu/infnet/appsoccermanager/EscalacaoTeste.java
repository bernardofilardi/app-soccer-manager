package br.edu.infnet.appsoccermanager;

import br.edu.infnet.appsoccermanager.model.domain.Escalacao;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(1)
@Component
public class EscalacaoTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("### Cadastro de Escalações ###");

        Escalacao escalacao1 = new Escalacao();
        escalacao1.setDescricao("4-3-3 Ofensivo");
        escalacao1.setOrganizacao("4-3-3");
        escalacao1.setUtilizada_anteriormente(false);
        escalacao1.setDescricao("Para situações de pressão contra adversários. Necessita de jogadores rápidos e com resistência física apurada");
        System.out.println("> Escalação 1: " + escalacao1);

        Escalacao escalacao2 = new Escalacao();
        escalacao2.setDescricao("4-4-2 Conservador");
        escalacao2.setOrganizacao("4-4-2");
        escalacao2.setUtilizada_anteriormente(true);
        escalacao2.setDescricao("Favorece o toque de bola e o jogo mais compacto do time. Boa pedida para situações onde o objetivo é priorizar a posse de bola");
        System.out.println("> Escalação 2: " + escalacao2);

        Escalacao escalacao3 = new Escalacao();
        escalacao3.setDescricao("4-5-1 Árvore");
        escalacao3.setOrganizacao("4-2-3-1");
        escalacao3.setUtilizada_anteriormente(true);
        escalacao3.setDescricao("Modelo que popula o meio campo com muitos jogadores. Funciona bem defensivamente para prejudicar o toque de bola adversário");
        System.out.println("> Escalação 3: " + escalacao3);
    }
}
