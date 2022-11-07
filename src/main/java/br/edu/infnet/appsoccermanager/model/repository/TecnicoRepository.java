package br.edu.infnet.appsoccermanager.model.repository;

import br.edu.infnet.appsoccermanager.model.domain.Tecnico;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TecnicoRepository extends CrudRepository<Tecnico, Integer> {

    Tecnico findByName(String nome);

}
