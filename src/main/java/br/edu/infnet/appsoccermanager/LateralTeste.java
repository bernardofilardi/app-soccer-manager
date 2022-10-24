package br.edu.infnet.appsoccermanager;

import br.edu.infnet.appsoccermanager.model.domain.Lateral;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(5)
@Component
public class LateralTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("### Cadastro de Lateral ###");

        Lateral lateral1 = new Lateral();
        lateral1.setNome("Rodinei");
        lateral1.setAltura(Float.parseFloat("1.74"));
        lateral1.setPeso(Float.parseFloat("73"));
        lateral1.setAnalise("Profunidade e toque de bola");
        lateral1.setAtua_ala(true);
        lateral1.setAcerto_cruzamento(Float.parseFloat("35"));
        System.out.println("> Lateral 1: " + lateral1);

        Lateral lateral2 = new Lateral();
        lateral2.setNome("Guilherme Arana");
        lateral2.setAltura(Float.parseFloat("1.77"));
        lateral2.setPeso(Float.parseFloat("78"));
        lateral2.setAnalise("Finalização de fora da área");
        lateral2.setAtua_ala(true);
        lateral2.setAcerto_cruzamento(Float.parseFloat("48"));
        System.out.println("> Lateral 2: " + lateral2);

        Lateral lateral3 = new Lateral();
        lateral3.setNome("Felipe Luis");
        lateral3.setAltura(Float.parseFloat("1.81"));
        lateral3.setPeso(Float.parseFloat("79"));
        lateral3.setAnalise("Segurança na saída de bola");
        lateral3.setAtua_ala(false);
        lateral3.setAcerto_cruzamento(Float.parseFloat("53"));
        System.out.println("> Lateral 3: " + lateral3);

    }
}
