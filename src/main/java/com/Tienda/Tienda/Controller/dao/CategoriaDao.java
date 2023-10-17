/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Tienda.Tienda.Controller.dao;

import com.Tienda.Tienda.Controller.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Seur
 */
public interface CategoriaDao extends JpaRepository<Categoria, Long>{
    
    
}
