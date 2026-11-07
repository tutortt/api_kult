/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kult.ecommerce.controller;

import com.kult.ecommerce.model.Categoria;
import com.kult.ecommerce.service.CategoriaService;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author FabianCol
 */
@RestController
@RequestMapping("/api/categorias")
public class CategoriaController {

    private final CategoriaService categoriaService;

    public CategoriaController(CategoriaService cs) {
        this.categoriaService = cs;
    }

    @GetMapping
    public List<Categoria> listar() {
        return categoriaService.listarCategorias();
    }

    @GetMapping("/{id}")
    public Categoria obtener(@PathVariable Integer id) {
        return categoriaService.obtenerCategoria(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Categoria registrar(@RequestBody Categoria c) {
        return categoriaService.crearCategoria(c);
    }

    @PutMapping("/{id}")
    public Categoria actualizar(@PathVariable Integer id,
            @RequestBody Categoria c) {
        return categoriaService.actualizarCategoria(id, c);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void borrar(@PathVariable Integer id) {
        categoriaService.eliminarCategoria(id);
    }
}


