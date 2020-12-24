package com.julir.springboot.repository;

import java.io.Serializable;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.julir.springboot.models.Producto;

@Repository("productoRepository")
public interface ProductoRepository extends MongoRepository<Producto, Serializable> {

	Producto findById(String id);
}
