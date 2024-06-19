package com.cibertec.cibertec.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cibertec.cibertec.entity.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Integer> {

    public abstract List<Producto> findByStock(int stock);
    public abstract List<Producto> findByNombreLike(String nombre);
    
    @Query("SELECT p FROM Producto p WHERE p.stock= ?1 AND p.nombre= ?2")
    public abstract List<Producto> findByStockAndNombre(int stock, String nombre);
}
