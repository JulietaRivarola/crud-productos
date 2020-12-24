package com.julir.springboot.models;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "productos")
public class Producto implements Serializable {
	
	@Id
	@MongoId(value = FieldType.OBJECT_ID)
	private static final long serialVersionUID = 6419866720449957770L;
	private String id;
	private String nombre;
	private String descripcion;
	private String marca;
	private Double precio;
	private Integer cantidad;
	private String rubro;
	
	
}
