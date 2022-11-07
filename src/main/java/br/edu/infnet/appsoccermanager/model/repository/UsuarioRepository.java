package br.edu.infnet.appsoccermanager.model.repository;


import br.edu.infnet.appsoccermanager.model.domain.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {

    Usuario findByEmail(String email);
}
