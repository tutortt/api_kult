/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kult.ecommerce.model;

import jakarta.persistence.*;
import lombok.Data;

/**
 *
 * @author FabianCol
 */
@Data
@Entity
@Table (name = "categorias")
public class Categoria {
    
    @Id
    @GeneratedValue( strategy =  GenerationType.IDENTITY)
    private Integer idCategoria;
    private String nombre;
    private String descripcion;

  
    
}
