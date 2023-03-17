package entidades;

import javax.persistence.*;
import java.util.ArrayList;

@Entity @Table(name = "Articulo")
public class Articulo {
    private static final long serialVersionUID = 1L;
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "cantidad")
    private int cantidad;
    @Column(name = "precio")
    private int precio;
    @OneToMany(mappedBy = "factura")
    private ArrayList<DetalleFactura> detalleFactura = new ArrayList<DetalleFactura>();
    public Articulo() {
    }

    public Articulo(Long id, int cantidad, int precio) {
        this.id = id;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public Articulo(int cantidad, int precio, ArrayList<DetalleFactura> detalleFactura) {
        this.cantidad = cantidad;
        this.precio = precio;
        this.detalleFactura = detalleFactura;
    }

    public ArrayList<DetalleFactura> getDetalleFactura() {
        return detalleFactura;
    }

    public void setDetalleFactura(ArrayList<DetalleFactura> detalleFactura) {
        this.detalleFactura = detalleFactura;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
