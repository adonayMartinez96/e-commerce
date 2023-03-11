package com.tienda.pruebaTecnica.Services.Implementaciones;

import com.tienda.pruebaTecnica.Models.Producto;
import com.tienda.pruebaTecnica.Repository.ProductoRepository;
import com.tienda.pruebaTecnica.Services.ICarritoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ImpCarritoService implements ICarritoService {

    @Autowired
    private ProductoRepository productoRepository;

    List<Producto> listaDevolver = new ArrayList<>();

    float totalDevolver = 0;

    @Override
    public List<Producto> agregarIdLista(int id) {
        if(ExisteCliente(id)) {
            return listaDevolver;
        }
        else {
            Optional<Producto> CrudData = productoRepository.findById(id);
            Producto producto = CrudData.get();
            listaDevolver.add(producto);
            return listaDevolver;
        }
    }

    @Override
    public List<Producto> eliminarProductoDeCarrito(int id) {
        if(listaDevolver.isEmpty()) {
            return null;
        }else {
            for (int i = 0; i < listaDevolver.size(); i++) {
                if (listaDevolver.get(i).getPrdId() == id) {
                    Optional<Producto> CrudData = productoRepository.findById(id);
                    Producto producto = CrudData.get();
                    listaDevolver.remove(producto);
                    return listaDevolver;
                }
            }
        }
        return null;
    }

    @Override
    public List<Producto> obtenerLista() {
        if(listaDevolver.isEmpty()) {
            return null;
        }else {
            return listaDevolver;
        }
    }

    @Override
    public List<Producto> limpiarLista() {
        listaDevolver.clear();
        totalDevolver=0;
        return listaDevolver;
    }

    @Override
    public float restarTotal(int id) {
        if(totalDevolver>0) {
            Optional<Producto> CrudData = productoRepository.findById(id);
            Producto producto = CrudData.get();
            float valorRestar = producto.getPrdPrecio();
            totalDevolver = totalDevolver - valorRestar;
        }
        return totalDevolver;
    }

    @Override
    public float obtenerSumaTotal() {
       return obtenerPrecioTotal();
    }


    public float obtenerPrecioTotal() {
        totalDevolver=0;
        for (Producto producto: listaDevolver) {
                totalDevolver+=producto.getPrdPrecio();
        }
        return totalDevolver;
    }

    private boolean ExisteCliente(int id) {
        boolean existe = false;

        for(int i = 0; i < listaDevolver.size(); i++) {
            if(listaDevolver.get(i).getPrdId()== id) {
                existe = true;
                break;
            }
        }
        return existe;
    }

    private float test() {
        return 0;
    }
}
