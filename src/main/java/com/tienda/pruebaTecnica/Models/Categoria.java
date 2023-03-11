package com.tienda.pruebaTecnica.Models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_categoria")
    @Getter @Setter
    private int idCategoria;

    @Getter @Setter
    @Column(name="cat_nombre",length = 50)
    private String catNombre;

    @Getter @Setter
    @Column(name="cat_orden")
    private String catOrden;

    @Getter @Setter
    @Column(name="cat_imagen",length = 200)
    private String catImagen;

    @OneToMany(fetch = FetchType.LAZY ,cascade = CascadeType.ALL)
    @JoinColumn(name = "cat_id")
    private List<Producto> productos;

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public Categoria(int idCategoria, String catNombre, String catOrden, String catImagen) {
        this.idCategoria = idCategoria;
        this.catNombre = catNombre;
        this.catOrden = catOrden;
        this.catImagen = catImagen;
    }

    public Categoria() {
        super();
        productos = new ArrayList<Producto>();
    }
}
