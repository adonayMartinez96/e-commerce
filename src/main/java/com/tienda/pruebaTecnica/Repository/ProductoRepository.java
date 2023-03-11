package com.tienda.pruebaTecnica.Repository;

import com.tienda.pruebaTecnica.Models.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductoRepository extends JpaRepository<Producto, Integer> {
    @Query(value = "SELECT * FROM producto WHERE cat_id = ?", nativeQuery = true)
    List<Producto> getProductoPorCategoria(int categoria);
}
