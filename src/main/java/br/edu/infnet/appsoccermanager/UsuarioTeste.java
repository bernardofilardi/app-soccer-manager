package br.edu.infnet.appsoccermanager;

import br.edu.infnet.appsoccermanager.model.domain.Escalacao;
import br.edu.infnet.appsoccermanager.model.domain.Jogador;
import br.edu.infnet.appsoccermanager.model.domain.Tecnico;
import br.edu.infnet.appsoccermanager.model.domain.Usuario;
import br.edu.infnet.appsoccermanager.model.service.*;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Order(8)
@Component
public class UsuarioTeste implements ApplicationRunner {

    private final UsuarioService usuarioService;

    private final TecnicoService tecnicoService;

    UsuarioTeste(UsuarioService usuarioService, TecnicoService tecnicoService) {
        this.usuarioService = usuarioService;
        this.tecnicoService = tecnicoService;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("### Cadastro de Usuário ###");

        Tecnico tecnico = tecnicoService.busca("Dorival Jr.");

        Usuario usuario = new Usuario();
        usuario.setNome("dorivaljr");
        usuario.setEmail("dorival.jr@mail.com");
        usuario.setSenha("123456");
        usuario.setTecnicos(Collections.singletonList(tecnico));
        System.out.println("> Usuario: " + usuario.toString());

        usuarioService.incluir(usuario);
    }
}
