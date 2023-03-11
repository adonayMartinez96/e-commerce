package com.tienda.pruebaTecnica.Controllers;

import com.tienda.pruebaTecnica.Models.Categoria;
import com.tienda.pruebaTecnica.Services.Implementaciones.ImpCategoriaServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoriaController {

    @Autowired
    private ImpCategoriaServices categoriaServices;

    @RequestMapping(value = "api/getAllCategorias",method = RequestMethod.GET)
    public List<Categoria> getAllCategorias(){
        return categoriaServices.getAll();
    }

    @RequestMapping(value = "api/findCategoria/{id}",method = RequestMethod.GET)
    public ResponseEntity<Categoria> findCategoria(@PathVariable int id){
        return categoriaServices.findId(id);
    }


}
