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
    CategoriaService service;

    @PostMapping ("/categorias") // Ningún web method devuelve void
    public ResponseEntity<?> crearCategoria(@RequestBody Categoria categoria){

        GenericResponse respuesta = new GenericResponse();
        service.crearCategoria(categoria);
        respuesta.isOk = true;
        respuesta.id = categoria.getCategoriaId();
        respuesta.message = "La categoria fue creada con exito";

        return ResponseEntity.ok(respuesta);
    }

    // GET /categorias
    @GetMapping("/categorias")
    public ResponseEntity<List<Categoria>> traerCategorias(){
        return ResponseEntity.ok(service.traerCategorias());
    }

    @GetMapping("/categorias/sueldos-nuevos")
    public ResponseEntity<List<Empleada>> calcularProximosSueldos() {
        return ResponseEntity.ok(service.calcularProximosSueldos());
    }

    @GetMapping("/categorias/sueldos-actuales")
    public ResponseEntity<List<Empleada>> obtenerSueldosActuales() {
        return ResponseEntity.ok(service.obtenerSueldosActuales());
    }

    @GetMapping("/categorias/sin-empleadas")
    public ResponseEntity<List<Categoria>> obtenerCategoriasSinEmpleadas() {
        return ResponseEntity.ok(service.obtenerCategoriasSinEmpleadas());
    }

    @GetMapping("/categorias/minimo-sueldo")
    public ResponseEntity<Categoria> obtenerCategoriaConMinimoSueldo() {
        return ResponseEntity.ok(service.obtenerCategoriaConMinimoSueldo());
    }

    @GetMapping("/categorias/nombres")
    public ResponseEntity<List<String>> obtenerNombresCategorias() {
        return ResponseEntity.ok(service.obtenerNombresCategorias());
    }

    
}
