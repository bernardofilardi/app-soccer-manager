package br.edu.infnet.appsoccermanager.clients;

import br.edu.infnet.appsoccermanager.model.domain.Endereco;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(url = "https://viacep.com.br/ws", name = "enderecoClient")
public interface IEnderecoClient {

    @GetMapping(value = "/{cep}/json")
    public Endereco buscarCep(String cep);
}
