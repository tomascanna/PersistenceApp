package entidades;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity @Table(name = "categoria")
public class Categoria implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "denominacion")
    private String denominacion;
    @ManyToMany(mappedBy = "categorias")
    private List<Articulo> articulos = new ArrayList<Articulo>();

    public Categoria() {
    }

    public Categoria(String denominacion) {
        this.denominacion = denominacion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }
}
