package br.edu.infnet.appsoccermanager;

import br.edu.infnet.appsoccermanager.model.domain.Atacante;
import br.edu.infnet.appsoccermanager.model.domain.Usuario;
import br.edu.infnet.appsoccermanager.model.service.JogadorService;
import br.edu.infnet.appsoccermanager.model.service.UsuarioService;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(3)
@Component
public class AtacanteTeste implements ApplicationRunner {

    private final JogadorService jogadorService;

    private final UsuarioService usuarioService;

    public AtacanteTeste(JogadorService jogadorService, UsuarioService usuarioService) {
        this.jogadorService = jogadorService;
        this.usuarioService = usuarioService;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("### Cadastro de Atacantes ###");

        Usuario usuario = usuarioService.busca("dorivaljr@mail.com");

        Atacante atacante1 = new Atacante();
        atacante1.setNome("Gabriel Barbosa");
        atacante1.setAltura(Float.parseFloat("1.78"));
        atacante1.setPeso(Float.parseFloat("77"));
        atacante1.setAnalise("Atacante com presença de área e finalização da entrada da mesma.");
        atacante1.setAtua_meiocampo(false);
        atacante1.setAcerto_finalizacao(Float.parseFloat("72"));
        atacante1.setUsuario(usuario);
        System.out.println("> Atacante 1: " + atacante1);

        Atacante atacante2 = new Atacante();
        atacante2.setNome("Bruno Henrique");
        atacante2.setAltura(Float.parseFloat("1.80"));
        atacante2.setPeso(Float.parseFloat("75"));
        atacante2.setAnalise("Atacante que joga pelo lado do campo.");
        atacante2.setAtua_meiocampo(false);
        atacante2.setAcerto_finalizacao(Float.parseFloat("70"));
        atacante2.setUsuario(usuario);
        System.out.println("> Atacante 2: " + atacante2);

        Atacante atacante3 = new Atacante();
        atacante3.setNome("Pedro Guilherme");
        atacante3.setAltura(Float.parseFloat("1.82"));
        atacante3.setPeso(Float.parseFloat("82"));
        atacante3.setAnalise("Atacante com grande porte físico, presença de área, mas sem muita velocidade. Ótimo posicionamento dentro de campo.");
        atacante3.setAtua_meiocampo(false);
        atacante3.setAcerto_finalizacao(Float.parseFloat("78"));
        atacante3.setUsuario(usuario);
        System.out.println("> Atacante 3: " + atacante3);

        jogadorService.incluir(atacante1);
        jogadorService.incluir(atacante2);
        jogadorService.incluir(atacante3);

    }
}
