package com.julir.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.julir.springboot.models.Producto;
import com.julir.springboot.services.ProductoService;

@RestController
public class ProductoController {
	@Autowired
	private ProductoService productoService;

	@GetMapping(value = "/producto/{idProducto}")
	public ResponseEntity<Producto> findByProducto(@PathVariable String idProducto) {

		Producto producto = new Producto();

		producto = productoService.idProducto(idProducto);
		return new ResponseEntity<Producto>(producto, HttpStatus.OK);

	}
//	@GetMapping(value = "/producto/{idProducto}")
//	public ResponseEntity<Producto> findByIdProducto(@PathVariable String idProducto) {
//
//		// Instancio un nuevo objeto producto
//		Producto producto = new Producto();
//
//		// llamo al servicio creado y le paso por parametro el idProducto
//		producto = productoService.idProducto(idProducto);
//
//		// Si el servicio me devolvio un resultado exitoso o 200
//		// devuelvo al FrontEnd todos los datos del Producto solicitado
//		return ResponseEntity.ok(producto);
//	}
}
