package br.edu.infnet.appsoccermanager.model.service;

import br.edu.infnet.appsoccermanager.model.domain.Atacante;
import br.edu.infnet.appsoccermanager.model.domain.Defesa;
import br.edu.infnet.appsoccermanager.model.domain.MeioCampo;
import br.edu.infnet.appsoccermanager.model.repository.MeioCampoRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class MeioCampoService {

    public MeioCampoService(MeioCampoRepository repository) {
        this.repository = repository;
    }

    private final MeioCampoRepository repository;

    public void incluir(MeioCampo MeioCampo) {
        repository.save(MeioCampo);
    }

    public Collection<MeioCampo> obterLista() {
        return (Collection<MeioCampo>) repository.findAll();
    }

    public void excluir(Integer id) {
        repository.deleteById(id);
    }


}
