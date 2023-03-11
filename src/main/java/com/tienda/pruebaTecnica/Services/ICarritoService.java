package com.tienda.pruebaTecnica.Services;

import com.tienda.pruebaTecnica.Models.Producto;

import java.util.List;

public interface ICarritoService {
    List<Producto> agregarIdLista (int id);
    List<Producto> eliminarProductoDeCarrito(int id);
    List<Producto> obtenerLista();
    List<Producto> limpiarLista();
    float restarTotal(int id);
    float obtenerSumaTotal();
}
