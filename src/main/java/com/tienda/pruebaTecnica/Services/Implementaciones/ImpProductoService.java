package com.tienda.pruebaTecnica.Services.Implementaciones;

import com.tienda.pruebaTecnica.Models.Producto;
import com.tienda.pruebaTecnica.Repository.ProductoRepository;
import com.tienda.pruebaTecnica.Services.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ImpProductoService implements IProductoService {
    @Autowired
    private ProductoRepository productoRepository;


    @Override
    public List<Producto> obtenerProductos() {
        return productoRepository.findAll();
    }

    @Override
    public ResponseEntity<Producto> traerUnProducto(int id) {
        Optional<Producto> CrudData = productoRepository.findById(id);
        Producto producto = CrudData.get();

        return new ResponseEntity<>(producto, HttpStatus.OK);
    }

    @Override
    public List<Producto> obtenerProductosUnaCategoria(int id) {
        return productoRepository.getProductoPorCategoria(id);
    }
}
