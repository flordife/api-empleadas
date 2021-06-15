package ar.com.ada.api.empleadas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.ada.api.empleadas.entities.Categoria;
import ar.com.ada.api.empleadas.repos.CategoriaRepository;

@Service
public class CategoriaService {
    
    @Autowired
    CategoriaRepository repository;

    public List<Categoria> traerCategorias(){
        return repository.findAll();
    }

    public void crearCategoria(Categoria categoria){
        repository.save(categoria);
    }


}
