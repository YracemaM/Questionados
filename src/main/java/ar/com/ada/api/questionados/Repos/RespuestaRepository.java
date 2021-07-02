package ar.com.ada.api.questionados.Repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.com.ada.api.questionados.Entities.Respuesta;

@Repository

public interface RespuestaRepository extends JpaRepository<Respuesta, Integer> {
    
}
