package br.edu.infnet.appsoccermanager.model.service;

import br.edu.infnet.appsoccermanager.model.domain.Atacante;
import br.edu.infnet.appsoccermanager.model.repository.AtacanteRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class AtacanteService {

    private final AtacanteRepository atacanteRepository;

    public AtacanteService(AtacanteRepository atacanteRepository) {
        this.atacanteRepository = atacanteRepository;
    }

    public void incluir(Atacante atacante) {
        atacanteRepository.save(atacante);
    }

    public Collection<Atacante> obterLista(Integer userId) {
        return atacanteRepository.listarPor(userId);
    }

    public void excluir(Integer id) {
        atacanteRepository.deleteById(id);
    }

}
