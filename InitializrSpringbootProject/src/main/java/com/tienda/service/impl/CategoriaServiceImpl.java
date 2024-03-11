package com.tienda.service.impl;

import com.tienda.domain.categoria;
import com.tienda.service.categoriaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.tienda.dao.categoriaDao;
@Service
public class categoriaServiceImpl implements categoriaService {
    @Autowired
    private categoriaDao categoriaDao;
    
    
    @Transactional(readOnly = true)
    @Override
    public List<categoria> getCategorias(boolean activos) {
        var lista=categoriaDao.findAll();
        if (activos) {
           lista.removeIf(e -> !e.isActivo());
        }
        return lista;
    }
    
    @Override
    @Transactional (readOnly = true)
    public categoria getCategoria(categoria categoria) {
        return categoriaDao.findById(categoria.getIdCategoria()).orElse(null);
    }
    
    @Override
    @Transactional
    public void save(categoria categoria){
        categoriaDao.save(categoria);
    }
    
    @Override
    @Transactional
    public void delete(categoria categoria){
        categoriaDao.save(categoria);
    }
}
