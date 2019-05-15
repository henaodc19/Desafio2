package com.papo.domain;

public class EmpleadoDirecto extends Empleado {
	private long salario;

	public EmpleadoDirecto(String nombre, long salario) {
		super(nombre);
		this.salario = salario;
	}
	
	public double calcularSalud(){
		
		return salario * 0.04;
		
	}
	
	public double calcularPension(){
		return salario * 0.05;
		
	}
	
	@Override
	protected double calcularSalario() {
		return salario - calcularPension() - calcularSalud();
	}

	public long getSalario() {
		return salario;
	}

	
	
	
}
