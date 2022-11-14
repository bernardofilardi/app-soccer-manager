package br.edu.infnet.appsoccermanager.model.service;

import br.edu.infnet.appsoccermanager.model.domain.Defesa;
import br.edu.infnet.appsoccermanager.model.repository.DefesaRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class DefesaService {

    private final DefesaRepository defesaRepository;

    public DefesaService(DefesaRepository defesaRepository) {
        this.defesaRepository = defesaRepository;
    }

    public void incluir(Defesa atacante) {
        defesaRepository.save(atacante);
    }

    public Collection<Defesa> obterLista(Integer userId) {
        return defesaRepository.listarPor(userId);
    }

    public void excluir(Integer id) {
        defesaRepository.deleteById(id);
    }

}
