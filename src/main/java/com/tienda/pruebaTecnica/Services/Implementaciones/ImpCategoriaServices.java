package com.tienda.pruebaTecnica.Services.Implementaciones;

import com.tienda.pruebaTecnica.Models.Categoria;
import com.tienda.pruebaTecnica.Repository.CategoriaRepository;
import com.tienda.pruebaTecnica.Repository.ProductoRepository;
import com.tienda.pruebaTecnica.Services.ICategoriaServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ImpCategoriaServices implements ICategoriaServices {
    @Autowired
    private CategoriaRepository categoriaRepository;

    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public List<Categoria> getAll() {
        return categoriaRepository.findAll();
    }

    @Override
    public ResponseEntity<Categoria> findId(int id) {
        Optional<Categoria> CrudData = categoriaRepository.findById(id);
        if(CrudData.isPresent()){
            Categoria categoria = CrudData.get();
            return new ResponseEntity<>(categoria, HttpStatus.OK);
        }else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }



}
