package ar.com.ada.api.questionados.Repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.com.ada.api.questionados.Entities.Categoria;

@Repository

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
   
    


}
