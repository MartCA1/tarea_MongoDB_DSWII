package com.example.examen.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.examen.entity.Libro;
import com.example.examen.repository.LibroRepositorio;

@Service
public class LibroServicioImpl implements LibroServicio{

@Autowired

private LibroRepositorio lRepositorio;
    @Override
    public List<Libro> listadolibros() {
        
        return lRepositorio.findAll();
    }

    @Override
    public List<Libro> LibrosPorCategoria(String categoria) {
        return lRepositorio.buscarCategoria(categoria);
    }
    
}
