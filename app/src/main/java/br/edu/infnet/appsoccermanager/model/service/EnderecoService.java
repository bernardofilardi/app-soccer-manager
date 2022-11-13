package br.edu.infnet.appsoccermanager.model.service;

import br.edu.infnet.appsoccermanager.model.domain.Endereco;
import org.springframework.stereotype.Service;

@Service
public class EnderecoService {

    public Endereco buscarCep(String cep) {
        return new Endereco();
    }
}
