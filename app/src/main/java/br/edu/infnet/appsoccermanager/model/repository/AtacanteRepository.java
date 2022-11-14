package br.edu.infnet.appsoccermanager.model.repository;

import br.edu.infnet.appsoccermanager.model.domain.Atacante;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AtacanteRepository extends CrudRepository<Atacante, Integer> {

    @Query("from Atacante atacante where atacante.usuario.id = :userid")
    List<Atacante> listarPor(Integer userid);

}
