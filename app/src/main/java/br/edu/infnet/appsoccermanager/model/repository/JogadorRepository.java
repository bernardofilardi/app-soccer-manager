package br.edu.infnet.appsoccermanager.model.repository;

import br.edu.infnet.appsoccermanager.model.domain.Jogador;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JogadorRepository extends CrudRepository<Jogador, Integer> {

    @Query("from Jogador jogador where jogador.usuario.id = :userid")
    List<Jogador> listarPor(Integer userid);
}
