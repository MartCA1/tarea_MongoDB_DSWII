package com.example.examen.service;

import java.util.List;

import com.example.examen.entity.Libro;

public interface LibroServicio {
    public abstract List<Libro> listadolibros();
    public abstract List<Libro> LibrosPorCategoria(String categoria);
}
