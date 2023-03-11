package com.tienda.pruebaTecnica.Models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="prd_id")
    @Getter @Setter
    private int prdId;

    @Getter
    @Setter
    @Column(name="prd_nombre",length = 50)
    private String prdNombre;

    @Getter @Setter
    @Column(name="prd_descripcion",length = 200)
    private String prdDescripcion;

    @Getter @Setter
    @Column(name="prd_precio",nullable = false,scale = 2)
    private float prdPrecio;

    @Getter @Setter
    @Column(name="prd_imagen",length = 200)
    private String prdImagen;

    /*@Getter @Setter
    @Column(name="cat_id")
    private int catId;*/
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cat_id")
    private Categoria categorias;

    @Override
    public int hashCode() {
        return Objects.hash(prdId);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Producto other = (Producto) obj;
        return Objects.equals(prdId, other.prdId);
    }
}
