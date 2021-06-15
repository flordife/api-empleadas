package ar.com.ada.api.empleadas.controllers;

import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import ar.com.ada.api.empleadas.entities.*;
import ar.com.ada.api.empleadas.models.response.GenericResponse;
import ar.com.ada.api.empleadas.services.*;

@RestController
public class CategoriaController {

    @Autowired
    private CategoriaService service;

    @PostMapping ("/categorias") // Ningún web method devuelve void
    public ResponseEntity<?> crearCategoria(@RequestBody Categoria categoria){

        GenericResponse respuesta = new GenericResponse();
        service.crearCategoria(categoria);
        respuesta.isOk = true;
        respuesta.id = categoria.getCategoriaId()
        respuesta.message = "La categoria fue creada con exito";

        return ResponseEntity.ok(respuesta);
    }

    // GET /categorias
    @GetMapping("/categorias")
    public ResponseEntity<List<Categoria>> traerCategorias(){
        return ResponseEntity.ok(service.traerCategorias());
    }
    
}
