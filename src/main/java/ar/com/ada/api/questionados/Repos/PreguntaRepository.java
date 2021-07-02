package ar.com.ada.api.questionados.Repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.com.ada.api.questionados.Entities.Pregunta;

@Repository

public interface PreguntaRepository extends JpaRepository<Pregunta, Integer>{
    
}
