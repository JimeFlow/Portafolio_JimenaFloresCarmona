package com.tienda.dao;

import com.tienda.domain.producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface productoDao extends JpaRepository <producto, Long> {
    
}
