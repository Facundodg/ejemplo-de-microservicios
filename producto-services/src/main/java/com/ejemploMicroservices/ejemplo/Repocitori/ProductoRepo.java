package com.ejemploMicroservices.ejemplo.Repocitori;

import com.ejemploMicroservices.ejemplo.Model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepo extends JpaRepository<Producto,Long> {



}
