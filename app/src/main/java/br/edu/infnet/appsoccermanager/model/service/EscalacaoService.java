package br.edu.infnet.appsoccermanager.model.service;

import br.edu.infnet.appsoccermanager.model.domain.Defesa;
import br.edu.infnet.appsoccermanager.model.domain.Escalacao;
import br.edu.infnet.appsoccermanager.model.domain.Usuario;
import br.edu.infnet.appsoccermanager.model.repository.EscalacaoRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class EscalacaoService {

    public EscalacaoService(EscalacaoRepository repository) {
        this.repository = repository;
    }

    private final EscalacaoRepository repository;

    public void incluir(Escalacao Escalacao) {
        repository.save(Escalacao);
    }

    public Collection<Escalacao> obterLista(Usuario usuario) {
        return repository.listarPor(usuario.getId());
    }

    public void excluir(Integer id) {
        repository.deleteById(id);
    }
}
