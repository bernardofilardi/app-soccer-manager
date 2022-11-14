package br.edu.infnet.appsoccermanager.model.service;

import br.edu.infnet.appsoccermanager.model.domain.MeioCampo;
import br.edu.infnet.appsoccermanager.model.repository.MeioCampoRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class MeioCampoService {

    private final MeioCampoRepository meioCampoRepository;

    public MeioCampoService(MeioCampoRepository meioCampoRepository) {
        this.meioCampoRepository = meioCampoRepository;
    }

    public void incluir(MeioCampo atacante) {
        meioCampoRepository.save(atacante);
    }

    public Collection<MeioCampo> obterLista(Integer userId) {
        return meioCampoRepository.listarPor(userId);
    }

    public void excluir(Integer id) {
        meioCampoRepository.deleteById(id);
    }

}
