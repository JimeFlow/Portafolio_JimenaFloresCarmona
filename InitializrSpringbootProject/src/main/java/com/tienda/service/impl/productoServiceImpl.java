package com.tienda.service.impl;

import com.tienda.dao.productoDao;
import com.tienda.domain.producto;
import com.tienda.service.productoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class productoServiceImpl implements productoService {

     @Autowired
    private productoDao productoDao;

    @Override
    @Transactional(readOnly = true)
    public List<producto> getProductos(boolean activos) {
        var lista = productoDao.findAll();
        if (activos) {
            lista.removeIf(e -> !e.isActivo());
        }
        return lista;
    }

    @Override
    @Transactional(readOnly = true)
    public producto getProducto(producto producto) {
        return productoDao.findById(producto.getIdProducto()).orElse(null);
    }

    @Override
    @Transactional
    public void save(producto producto) {
        productoDao.save(producto);
    }

    @Override
    @Transactional
    public void delete(producto producto) {
        productoDao.delete(producto);
    }
    
}
