package com.tienda.pruebaTecnica.Controllers;

import com.tienda.pruebaTecnica.Models.Producto;
import com.tienda.pruebaTecnica.Services.Implementaciones.ImpProductoService;
import lombok.experimental.PackagePrivate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductoController {

    @Autowired
    private ImpProductoService productoService;

    @RequestMapping(value = "api/getAllProduct", method = RequestMethod.GET)
    public List<Producto> getAllProduct(){
        return productoService.obtenerProductos();
    }

    @RequestMapping(value = "api/getProduct/{id}", method = RequestMethod.GET)
    public ResponseEntity<Producto> getAllProduct(@PathVariable int id){
        return productoService.traerUnProducto(id);
    }

    @RequestMapping(value = "api/getProductCategory/{id}", method = RequestMethod.GET)
    public List<Producto> getProductCategory(@PathVariable int id){
        return productoService.obtenerProductosUnaCategoria(id);
    }
}
