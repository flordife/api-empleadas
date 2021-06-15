package ar.com.ada.api.empleadas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.com.ada.api.empleadas.entities.Empleada;
import ar.com.ada.api.empleadas.services.EmpleadaService;

@RestController
public class EmpleadaController {

    @Autowired
    EmpleadaService service;

    @GetMapping("/empleadas")
    public ResponseEntity<List<Empleada>> traerEmpleadas(){
        return ResponseEntity.ok(service.traerEmpleadas());
    }
    
}
