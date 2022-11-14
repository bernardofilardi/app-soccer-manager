package br.edu.infnet.appsoccermanager.model.service;

import br.edu.infnet.appsoccermanager.model.domain.Atacante;
import br.edu.infnet.appsoccermanager.model.domain.Jogador;
import br.edu.infnet.appsoccermanager.model.domain.Tecnico;
import br.edu.infnet.appsoccermanager.model.domain.Usuario;
import br.edu.infnet.appsoccermanager.model.repository.AtacanteRepository;
import br.edu.infnet.appsoccermanager.model.repository.DefesaRepository;
import br.edu.infnet.appsoccermanager.model.repository.JogadorRepository;
import br.edu.infnet.appsoccermanager.model.repository.MeioCampoRepository;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Service
public class JogadorService {

    private final JogadorRepository jogadorRepository;

    public JogadorService(JogadorRepository jogadorRepository) {
        this.jogadorRepository = jogadorRepository;
    }

    public void incluir(Jogador jogador) {
        jogadorRepository.save(jogador);
    }

    public Collection<Jogador> obterLista(Integer userId) {
        return jogadorRepository.listarPor(userId);
    }

    public void excluir(Integer id) {
        jogadorRepository.deleteById(id);
    }
}
