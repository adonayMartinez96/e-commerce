package com.tienda.pruebaTecnica.Repository;

import com.tienda.pruebaTecnica.Models.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
}
