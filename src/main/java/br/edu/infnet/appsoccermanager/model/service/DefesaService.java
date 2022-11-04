package br.edu.infnet.appsoccermanager.model.service;

import br.edu.infnet.appsoccermanager.model.domain.Atacante;
import br.edu.infnet.appsoccermanager.model.domain.Defesa;
import br.edu.infnet.appsoccermanager.model.repository.DefesaRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class DefesaService {

    public DefesaService(DefesaRepository repository) {
        this.repository = repository;
    }

    private final DefesaRepository repository;

    public void incluir(Defesa Defesa) {
        repository.save(Defesa);
    }

    public Collection<Defesa> obterLista() {
        return (Collection<Defesa>) repository.findAll();
    }

    public void excluir(Integer id) {
        repository.deleteById(id);
    }

}
