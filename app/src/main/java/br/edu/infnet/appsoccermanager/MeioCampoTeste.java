package br.edu.infnet.appsoccermanager;

import br.edu.infnet.appsoccermanager.model.domain.MeioCampo;
import br.edu.infnet.appsoccermanager.model.domain.Usuario;
import br.edu.infnet.appsoccermanager.model.service.JogadorService;
import br.edu.infnet.appsoccermanager.model.service.UsuarioService;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(5)
@Component
public class MeioCampoTeste implements ApplicationRunner {

    private final JogadorService jogadorService;

    private final UsuarioService usuarioService;

    MeioCampoTeste(JogadorService jogadorService, UsuarioService usuarioService) {
        this.jogadorService = jogadorService;
        this.usuarioService = usuarioService;
    }

    @Override
    public void run(ApplicationArguments args) {
        System.out.println("### Cadastro de Meio Campo ###");

        Usuario usuario = usuarioService.busca("dorivaljr@mail.com");

        MeioCampo meioCampo1 = new MeioCampo();
        meioCampo1.setNome("Giorgian De Arrascaeta");
        meioCampo1.setAltura(Float.parseFloat("1.80"));
        meioCampo1.setPeso(Float.parseFloat("77"));
        meioCampo1.setAnalise("Visão de jogo e ótimo passe. Contribui muito nas infiltrações.");
        meioCampo1.setAtua_ataque(false);
        meioCampo1.setAcerto_passe(Float.parseFloat("85"));
        meioCampo1.setUsuario(usuario);
        System.out.println("> Meio Campo 1: " + meioCampo1);

        MeioCampo meioCampo2 = new MeioCampo();
        meioCampo2.setNome("João Gomes");
        meioCampo2.setAltura(Float.parseFloat("1.78"));
        meioCampo2.setPeso(Float.parseFloat("78"));
        meioCampo2.setAnalise("Ótimo no desarme");
        meioCampo2.setAtua_ataque(false);
        meioCampo2.setAcerto_passe(Float.parseFloat("88"));
        meioCampo2.setUsuario(usuario);
        System.out.println("> Meio Campo 2: " + meioCampo2);

        MeioCampo meioCampo3 = new MeioCampo();
        meioCampo3.setNome("Luca Modric");
        meioCampo3.setAltura(Float.parseFloat("1.74"));
        meioCampo3.setPeso(Float.parseFloat("76"));
        meioCampo3.setAnalise("Visão de jogo e ótimo passe. Finaliza bem de longa distância.");
        meioCampo3.setAtua_ataque(false);
        meioCampo3.setAcerto_passe(Float.parseFloat("90"));
        meioCampo3.setUsuario(usuario);
        System.out.println("> Meio Campo 3: " + meioCampo3);

        jogadorService.incluir(meioCampo1);
        jogadorService.incluir(meioCampo2);
        jogadorService.incluir(meioCampo3);
    }
}
