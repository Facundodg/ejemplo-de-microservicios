package com.ejemploMicroservices.ejemplo.Controllers;

import com.ejemploMicroservices.ejemplo.Model.Producto;
import com.ejemploMicroservices.ejemplo.Services.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/producto")
public class ProductoController {

    @Autowired
    ProductoService productoService;

    @PostMapping
    public Producto GuardarProducto (@RequestBody Producto producto){

        return productoService.guardarProducto(producto);

    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Optional<Producto>> MostrarProducto(@PathVariable ("id") Long id){

        return ResponseEntity.status(HttpStatus.CREATED).body(productoService.mostrarProducto(id));

    }

    @GetMapping
    public ResponseEntity<List<Producto>> MostrarProductos(){

        return ResponseEntity.status(HttpStatus.CREATED).body(productoService.mostrarProductos());

    }

    @DeleteMapping(value = "/{id}")
    public Boolean borrarProducto(@PathVariable ("id") Long id){
        productoService.borrarProducto(id);
        return true;
    }

    @PutMapping
    public ResponseEntity<Producto> editStudent (@RequestBody Producto producto){
        System.out.println("entre");
        return ResponseEntity.status(HttpStatus.CREATED).body(productoService.modificarProducto(producto));
    }

}
