package br.edu.infnet.appsoccermanager.model.repository;

import br.edu.infnet.appsoccermanager.model.domain.Defesa;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DefesaRepository extends CrudRepository<Defesa, Integer> {

    @Query("from Defesa defesa where defesa.usuario.id = :userid")
    List<Defesa> listarPor(Integer userid);

}
