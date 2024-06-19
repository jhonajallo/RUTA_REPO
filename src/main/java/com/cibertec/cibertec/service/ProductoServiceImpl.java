package com.cibertec.cibertec.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.cibertec.entity.Producto;
import com.cibertec.cibertec.repository.ProductoRepository;

@Service
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    private ProductoRepository repository;
    @Override
    public List<Producto> listaProductos() {
    return repository.findAll();    
    }

    @Override
    public Producto insertaActualizaProducto(Producto obj) {
        return repository.save(obj);
    }

    @Override
    public void eliminaProducto(int id) {
        repository.deleteById(id);
    }   

    @Override
    public Optional<Producto> obtienePorId(int id) {
        return repository.findById(id);
    }
    @Override
    public List<Producto> listaProductoPorNombre(String nombre) {
        return repository.findByNombreLike(nombre);
    }

    @Override
    public List<Producto> listaProductoPorStock(int stock) {
        return repository.findByStock(stock);
    }

    @Override
    public List<Producto> listaProductoPorStockNombre(int stock, String nombre) {
       return repository.findByStockAndNombre(stock, nombre);
    }
    
}
