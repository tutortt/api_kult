/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kult.ecommerce.repository;

import com.kult.ecommerce.model.Categoria;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author FabianCol
 */
public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{
    List<Categoria> findByNombre(String texto);
}
