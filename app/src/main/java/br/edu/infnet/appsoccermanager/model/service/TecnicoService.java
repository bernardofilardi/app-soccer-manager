package br.edu.infnet.appsoccermanager.model.service;

import br.edu.infnet.appsoccermanager.model.domain.Tecnico;
import br.edu.infnet.appsoccermanager.model.repository.TecnicoRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class TecnicoService {

    public TecnicoService(TecnicoRepository repository) {
        this.repository = repository;
    }

    private final TecnicoRepository repository;

    public void incluir(Tecnico Tecnico) {
        repository.save(Tecnico);
    }

    public Collection<Tecnico> obterLista() {
        return (Collection<Tecnico>) repository.findAll();
    }

    public Collection<Tecnico> obterLista(Integer userId) {
        return repository.obterLista(userId);
    }

    public void excluir(Integer id) {
        repository.deleteById(id);
    }

    public Tecnico busca(String name) {
        return repository.findByNome(name);
    }

}
