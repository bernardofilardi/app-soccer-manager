package br.edu.infnet.appsoccermanager;

import br.edu.infnet.appsoccermanager.model.domain.MeioCampo;
import br.edu.infnet.appsoccermanager.model.domain.Zagueiro;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(7)
@Component
public class ZagueiroTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("### Cadastro de Zagueiro ###");

        Zagueiro zagueiro1 = new Zagueiro();
        zagueiro1.setNome("David Luiz");
        zagueiro1.setAltura(Float.parseFloat("1.88"));
        zagueiro1.setPeso(Float.parseFloat("85"));
        zagueiro1.setAnalise("Seguro na defesa. Liderança dentro de campo. Apoio emocional para jovens.");
        zagueiro1.setAtua_volante(true);
        zagueiro1.setAcerto_desarme(Float.parseFloat("92")); ;
        System.out.println("> Zagueiro 1: " + zagueiro1);

        Zagueiro zagueiro2 = new Zagueiro();
        zagueiro2.setNome("Thiago Silva");
        zagueiro2.setAltura(Float.parseFloat("1.89"));
        zagueiro2.setPeso(Float.parseFloat("83"));
        zagueiro2.setAnalise("Posicionamento perfeito. Opção para bola área no ataque.");
        zagueiro2.setAtua_volante(false);
        zagueiro2.setAcerto_desarme(Float.parseFloat("90")); ;
        System.out.println("> Zagueiro 2: " + zagueiro2);

        Zagueiro zagueiro3 = new Zagueiro();
        zagueiro3.setNome("Ronald De Boer");
        zagueiro3.setAltura(Float.parseFloat("1.88"));
        zagueiro3.setPeso(Float.parseFloat("85"));
        zagueiro3.setAnalise("Desarmes perfeitos. Não leva cartão. Joga limpo");
        zagueiro3.setAtua_volante(false);
        zagueiro3.setAcerto_desarme(Float.parseFloat("93")); ;
        System.out.println("> Zagueiro 3: " + zagueiro3);
    }
}
