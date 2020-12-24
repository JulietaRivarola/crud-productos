package com.julir.springboot.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.julir.springboot.models.Producto;
import com.julir.springboot.repository.ProductoRepository;
import com.julir.springboot.services.ProductoService;

@Service("productoService")

public class ProductoServiceImpl implements ProductoService {

	@Autowired
	private ProductoRepository productoRepository;

	@Override
	public Producto idProducto(String idProducto) {
		Producto producto = null;
		try {
			producto = productoRepository.findById(idProducto);
		} catch (Exception e) {

		}
		return producto;
	}

}
