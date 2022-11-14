package br.edu.infnet.appsoccermanager.model.repository;

import br.edu.infnet.appsoccermanager.model.domain.MeioCampo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MeioCampoRepository extends CrudRepository<MeioCampo, Integer> {

    @Query("from MeioCampo meioCampo where meioCampo.usuario.id = :userid")
    List<MeioCampo> listarPor(Integer userid);

}
