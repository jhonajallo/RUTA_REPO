package com.cibertec.cibertec.service;

import java.util.List;
import java.util.Optional;

import com.cibertec.cibertec.entity.Cliente;
import com.cibertec.cibertec.entity.Producto;

public interface ProductoService {

public abstract List<Producto> listaProductos();

public abstract Producto insertaActualizaProducto (Producto obj);

public abstract void eliminaProducto(int id);

public abstract Optional<Producto> obtienePorId(int id);

//Para Consultas

public abstract List<Producto> listaProductoPorNombre(String nombre);

public abstract List<Producto> listaProductoPorStock(int stock);

public abstract List<Producto> listaProductoPorStockNombre(int stock,String nombre);

    
}
