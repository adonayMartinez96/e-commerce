package com.tienda.pruebaTecnica.Controllers;

import com.tienda.pruebaTecnica.Models.Producto;
import com.tienda.pruebaTecnica.Services.Implementaciones.ImpCarritoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CarritoController {

    @Autowired
    private ImpCarritoService carritoService;


    @RequestMapping(value = ("api/getId/{id}"), method = RequestMethod.GET)
    List<Producto> getId(@PathVariable int id) {
        return carritoService.agregarIdLista(id);
    }

    @RequestMapping(value = ("api/deleteProductList/{id}"), method = RequestMethod.DELETE)
    List<Producto> deleteProductList(@PathVariable int id) {
        return carritoService.eliminarProductoDeCarrito(id);
    }

    @RequestMapping(value = ("api/getList"), method = RequestMethod.GET)
    public List<Producto> getList() {
        return carritoService.obtenerLista();
    }

    @RequestMapping(value = ("api/total"), method = RequestMethod.GET)
    public float getTotal() {
        return carritoService.obtenerPrecioTotal();
    }

    @RequestMapping(value = ("api/clearList"), method = RequestMethod.GET)
    public List<Producto> clearList() {
        return carritoService.limpiarLista();
    }

    @RequestMapping(value = ("api/substrac/{id}"), method = RequestMethod.GET)
    public float clearList(@PathVariable int id) {
        return carritoService.restarTotal(id);
    }


}
