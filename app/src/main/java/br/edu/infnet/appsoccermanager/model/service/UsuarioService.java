package br.edu.infnet.appsoccermanager.model.service;

import br.edu.infnet.appsoccermanager.clients.IEnderecoClient;
import br.edu.infnet.appsoccermanager.model.domain.Endereco;
import br.edu.infnet.appsoccermanager.model.domain.Usuario;
import br.edu.infnet.appsoccermanager.model.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class UsuarioService {

    private final IEnderecoClient enderecoClient;

    private final UsuarioRepository repository;

    public UsuarioService(IEnderecoClient enderecoClient, UsuarioRepository repository) {
        this.enderecoClient = enderecoClient;
        this.repository = repository;
    }

    public void incluir(Usuario usuario) {
        repository.save(usuario);
    }

    public void excluir(Integer id) {
        repository.deleteById(id);
    }

    public Collection<Usuario> obterLista(){
        return (Collection<Usuario>) repository.findAll();
    }

    public Usuario validar(String email, String senha) {

        Usuario usuario = repository.findByEmail(email);

        if(usuario != null && senha.equals(usuario.getSenha())) {
            return usuario;
        }

        return null;
    }

    public Usuario busca(String email) {
        return repository.findByEmail(email);
    }

    public Endereco buscarCep(String cep) {
        return enderecoClient.buscarCep(cep);
    }

}
