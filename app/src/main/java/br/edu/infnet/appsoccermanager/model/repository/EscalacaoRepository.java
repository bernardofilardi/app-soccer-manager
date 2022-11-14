package br.edu.infnet.appsoccermanager.model.repository;

import br.edu.infnet.appsoccermanager.model.domain.Escalacao;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EscalacaoRepository extends CrudRepository<Escalacao, Integer> {

    @Query("from Escalacao e where e.usuario.id = :userid")
    List<Escalacao> listarPor(Integer userid);

}
