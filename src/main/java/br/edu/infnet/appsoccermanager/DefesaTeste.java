package br.edu.infnet.appsoccermanager;

import br.edu.infnet.appsoccermanager.model.domain.Defesa;
import br.edu.infnet.appsoccermanager.model.service.DefesaService;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(4)
@Component
public class DefesaTeste implements ApplicationRunner {

    public DefesaTeste(DefesaService service) {
        this.service = service;
    }

    DefesaService service;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("### Cadastro de Zagueiro ###");

        Defesa defesa1 = new Defesa();
        defesa1.setNome("David Luiz");
        defesa1.setAltura(Float.parseFloat("1.88"));
        defesa1.setPeso(Float.parseFloat("85"));
        defesa1.setAnalise("Seguro na defesa. Liderança dentro de campo. Apoio emocional para jovens.");
        defesa1.setAtua_volante(true);
        defesa1.setAcerto_desarme(Float.parseFloat("92"));
        System.out.println("> Zagueiro 1: " + defesa1);

        Defesa defesa2 = new Defesa();
        defesa2.setNome("Thiago Silva");
        defesa2.setAltura(Float.parseFloat("1.89"));
        defesa2.setPeso(Float.parseFloat("83"));
        defesa2.setAnalise("Posicionamento perfeito. Opção para bola área no ataque.");
        defesa2.setAtua_volante(false);
        defesa2.setAcerto_desarme(Float.parseFloat("90"));
        System.out.println("> Zagueiro 2: " + defesa2);

        Defesa defesa3 = new Defesa();
        defesa3.setNome("Ronald De Boer");
        defesa3.setAltura(Float.parseFloat("1.88"));
        defesa3.setPeso(Float.parseFloat("85"));
        defesa3.setAnalise("Desarmes perfeitos. Não leva cartão. Joga limpo");
        defesa3.setAtua_volante(false);
        defesa3.setAcerto_desarme(Float.parseFloat("93"));
        System.out.println("> Zagueiro 3: " + defesa3);

        service.incluir(defesa1);
        service.incluir(defesa2);
        service.incluir(defesa3);

    }
}
