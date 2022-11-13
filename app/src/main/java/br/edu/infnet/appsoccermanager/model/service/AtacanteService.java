package br.edu.infnet.appsoccermanager.model.service;

import br.edu.infnet.appsoccermanager.model.domain.Atacante;
import br.edu.infnet.appsoccermanager.model.repository.AtacanteRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class AtacanteService {

    public AtacanteService(AtacanteRepository repository) {
        this.repository = repository;
    }

    private final AtacanteRepository repository;

    public void incluir(Atacante atacante) {
        repository.save(atacante);
    }

    public Collection<Atacante> obterLista() {
        return (Collection<Atacante>) repository.findAll();
    }

    public void excluir(Integer id) {
        repository.deleteById(id);
    }
}
