package ar.com.ada.api.empleadas.services;

import java.util.List;
import java.util.Optional;

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

    public Categoria buscarCategoria(Integer categoriaId){

        Optional<Categoria> resultado =  repository.findById(categoriaId);
        Categoria categoria = null;

        if (resultado.isPresent())
            categoria = resultado.get();

        return categoria;
    }
}
