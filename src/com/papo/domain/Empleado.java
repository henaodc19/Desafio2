package com.papo.domain;

public abstract class Empleado {
	
	private String nombre;

	public Empleado(String nombre) {
		this.nombre = nombre;
	}

	protected  abstract double calcularSalario();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	
	
}
