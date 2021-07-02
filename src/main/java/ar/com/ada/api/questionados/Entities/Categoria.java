package ar.com.ada.api.questionados.Entities;

import javax.persistence.*;

@Entity
@Table(name = "categoria")
public class Categoria {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "categoria_id")
    private Integer categoriaId;

    public Integer getCategoriaId() {
        return categoriaId;
    }

    public void setCategoriaId(Integer categoriaId) {
        this.categoriaId = categoriaId;
    }

    

}
