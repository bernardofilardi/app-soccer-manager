package br.edu.infnet.apiusuario.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import br.edu.infnet.apiusuario.model.domain.Usuario;
import br.edu.infnet.apiusuario.model.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	private final UsuarioRepository usuarioRepository;

	public UsuarioService(UsuarioRepository usuarioRepository) {
		this.usuarioRepository = usuarioRepository;
	}

	public void incluir(Usuario usuario) throws Exception {
		Usuario exists = usuarioRepository.findByEmail(usuario.getEmail());

		if(exists == null) {
			usuarioRepository.save(usuario);
		} else {
			throw new Exception("E-mail já cadastrado");
		}
	}

	public void excluir(Integer id) throws Exception {
		try {
			usuarioRepository.deleteById(id);
		} catch (EmptyResultDataAccessException exception) {
			throw new Exception("Id não encontrado para ser removido");
		}
	}

	public List<Usuario> listar(){

		return (List<Usuario>) usuarioRepository.findAll();
	}

	public Usuario validar(String email, String senha) throws Exception {
		
		Usuario usuario = usuarioRepository.findByEmail(email);
		
		if(usuario != null && senha.equals(usuario.getSenha())) {
			return usuario;
		} else {
			throw new Exception("E-mail não encontrado");
		}
	}
}