package br.edu.infnet.appsoccermanager;

import br.edu.infnet.appsoccermanager.model.domain.Atacante;
import br.edu.infnet.appsoccermanager.model.domain.Goleiro;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(4)
@Component
public class GoleiroTeste implements ApplicationRunner {


    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("### Cadastro de Goleiros ###");

        Goleiro goleiro1 = new Goleiro();
        goleiro1.setNome("Chuck Smegman");
        goleiro1.setAltura(Float.parseFloat("1.85"));
        goleiro1.setPeso(Float.parseFloat("80"));
        goleiro1.setAnalise("Goleiro com posicionamento simples. Não arrisca saídas do gol desnecessárias. Seguro em chutes de longe.");
        goleiro1.setAtua_libero(false);
        goleiro1.setAcerto_defesa_penalti(Float.parseFloat("45"));
        System.out.println("> Goleiro 1: " + goleiro1);

        Goleiro goleiro2 = new Goleiro();
        goleiro2.setNome("Cleston Ferreira");
        goleiro2.setAltura(Float.parseFloat("1.81"));
        goleiro2.setPeso(Float.parseFloat("78"));
        goleiro2.setAnalise("Goleiro agressivo. Saída de gol constante. Boa liderança dentro de campo");
        goleiro2.setAtua_libero(true);
        goleiro2.setAcerto_defesa_penalti(Float.parseFloat("32"));
        System.out.println("> Goleiro 2: " + goleiro2);

        Goleiro goleiro3 = new Goleiro();
        goleiro3.setNome("Julio Cesar");
        goleiro3.setAltura(Float.parseFloat("1.82"));
        goleiro3.setPeso(Float.parseFloat("83"));
        goleiro3.setAnalise("Líder dentro de campo. Ótimo posicionamento. ");
        goleiro3.setAtua_libero(false);
        goleiro3.setAcerto_defesa_penalti(Float.parseFloat("58"));
        System.out.println("> Goleiro 3: " + goleiro3);
    }
}
