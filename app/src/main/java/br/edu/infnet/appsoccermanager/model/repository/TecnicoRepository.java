package br.edu.infnet.appsoccermanager.model.repository;

import br.edu.infnet.appsoccermanager.model.domain.Tecnico;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TecnicoRepository extends CrudRepository<Tecnico, Integer> {

    Tecnico findByNome(String nome);

    @Query("from Tecnico t where t.usuario.id = :userId")
    List<Tecnico> obterLista(Integer userId);

}
