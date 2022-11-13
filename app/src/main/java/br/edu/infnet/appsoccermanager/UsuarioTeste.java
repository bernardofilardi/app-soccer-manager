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

@Order(1)
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

        Usuario usuario1 = new Usuario();
        usuario1.setNome("Dorival Jr.");
        usuario1.setEmail("dorivaljr@mail.com");
        usuario1.setSenha("123456");
        System.out.println("> Usuario: " + usuario1.toString());

        Usuario usuario2 = new Usuario();
        usuario2.setNome("Felipão");
        usuario2.setEmail("felipao@mail.com");
        usuario2.setSenha("123456");
        System.out.println("> Usuario: " + usuario2.toString());

        Usuario usuario3 = new Usuario();
        usuario3.setNome("Abel Ferreira");
        usuario3.setEmail("abel@mail.com");
        usuario3.setSenha("123456");
        System.out.println("> Usuario: " + usuario3.toString());

        usuarioService.incluir(usuario1);
        usuarioService.incluir(usuario2);
        usuarioService.incluir(usuario3);
    }
}
