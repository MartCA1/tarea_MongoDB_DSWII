package com.example.examen.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.examen.entity.Libro;
import com.example.examen.service.LibroServicio;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping("/rest/libro")
public class LibroControlador {

    @Autowired
    private LibroServicio Lsevice;

    @GetMapping("/listarLibroPorCategoria/{var}")
    @ResponseBody
    public List<Libro> listadeLibros(@PathVariable("var") String categoria ) {
        return Lsevice.LibrosPorCategoria(categoria);
    }
    

    
}
