package com.ejemploMicroservices.ejemplo.Services;


import com.ejemploMicroservices.ejemplo.Model.Producto;
import com.ejemploMicroservices.ejemplo.Repocitori.ProductoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoService {


    @Autowired
    private ProductoRepo productoRepo;


    public Producto guardarProducto(Producto producto){

        return productoRepo.save(producto);

    }

    public Optional<Producto> mostrarProducto(Long id){

        return productoRepo.findById(id);

    }

    public List<Producto> mostrarProductos(){

        return productoRepo.findAll();

    }
    public Producto modificarProducto(Producto producto){

        if (productoRepo.existsById(producto.getId())){
            System.out.println(producto);
            return productoRepo.save(producto);
        }else{
            System.out.println(producto);
            return productoRepo.save(producto);
        }

    }

    public void borrarProducto(Long id){

        productoRepo.deleteById(id);

    }

}
