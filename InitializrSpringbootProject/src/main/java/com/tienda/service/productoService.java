package com.tienda.service;

import com.tienda.domain.producto;
import java.util.List;

public interface productoService {

    public List<producto> getProductos(boolean activo);

    // Se obtiene un Producto, a partir del id de un producto
    public producto getProducto(producto producto);

    // Se inserta un nuevo producto si el id del producto esta vacío
    // Se actualiza un producto si el id del producto NO esta vacío
    public void save(producto producto);

    // Se elimina el producto que tiene el id pasado por parámetro
    public void delete(producto producto);

    // Lista de productos con precio entre ordendados por descripción ConsultaAmpliada
    public List<producto> findByPrecioBetweenOrderByDescripcion(double precioInf, double precioSup);

    //Lista de productos utilizando consultas con JPQL    
    public List<producto> metodoJPQL(double precioInf, double precioSup);

    //Lista de productos utilizando consultas con SQL Nativo
    public List<producto> metodoNativo(double precioInf, double precioSup);
}