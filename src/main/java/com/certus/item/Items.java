package com.certus.item;

public class Items {
	
	
	Integer  id;
	String  nombre;
	String apellido;
	
	
	
	Items(Integer id,String nombre, String apellido){
		this.id=id;
		this.nombre=nombre;
		this.apellido=apellido;
		
		
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	
	
}
