package br.edu.infnet.appsoccermanager;

import br.edu.infnet.appsoccermanager.model.domain.Tecnico;
import br.edu.infnet.appsoccermanager.model.service.TecnicoService;
import br.edu.infnet.appsoccermanager.model.service.UsuarioService;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(2)
@Component
public class TecnicoTeste implements ApplicationRunner {

    private final TecnicoService tecnicoService;

    private final UsuarioService usuarioService;

    TecnicoTeste(TecnicoService tecnicoService, UsuarioService usuarioService) {
        this.tecnicoService = tecnicoService;
        this.usuarioService = usuarioService;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("### Cadastro de Técnicos ###");

        Tecnico tecnico1 = new Tecnico();
        tecnico1.setNome("Dorival Jr.");
        tecnico1.setIdade(64);
        tecnico1.setTempo_carreira(32);
        tecnico1.setUsuario(usuarioService.busca("dorivaljr@mail.com"));
        System.out.println("> Técnico 1: " + tecnico1);

        Tecnico tecnico2 = new Tecnico();
        tecnico2.setNome("Felipão");
        tecnico2.setIdade(70);
        tecnico2.setTempo_carreira(35);
        tecnico2.setUsuario(usuarioService.busca("felipao@mail.com"));
        System.out.println("> Técnico 2: " + tecnico2);

        Tecnico tecnico3 = new Tecnico();
        tecnico3.setNome("Abel Ferreira");
        tecnico3.setIdade(46);
        tecnico3.setTempo_carreira(12);
        tecnico3.setUsuario(usuarioService.busca("abel@mail.com"));
        System.out.println("> Técnico 3: " + tecnico3);

        tecnicoService.incluir(tecnico1);
        tecnicoService.incluir(tecnico2);
        tecnicoService.incluir(tecnico3);
    }
}
