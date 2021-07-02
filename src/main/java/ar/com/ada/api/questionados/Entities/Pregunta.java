package ar.com.ada.api.questionados.Entities;

import javax.persistence.*;


@Entity
@Table(name = "persona")
public class Pregunta {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "persona_id")
    private Integer personaId;

    public Integer getPersonaId() {
    return personaId;
}

    public void setPersonaId(Integer personaId) {
    this.personaId = personaId;
}


}
