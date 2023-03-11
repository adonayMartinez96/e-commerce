package com.tienda.pruebaTecnica.Services;

import com.tienda.pruebaTecnica.Models.Producto;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IProductoService {
    List<Producto> obtenerProductos();
    ResponseEntity<Producto> traerUnProducto(int id);
    List<Producto> obtenerProductosUnaCategoria(int id);


}
