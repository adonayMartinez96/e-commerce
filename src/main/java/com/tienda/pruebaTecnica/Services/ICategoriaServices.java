package com.tienda.pruebaTecnica.Services;

import com.tienda.pruebaTecnica.Models.Categoria;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ICategoriaServices {
    List<Categoria> getAll();
    ResponseEntity<Categoria> findId(int id);
}
