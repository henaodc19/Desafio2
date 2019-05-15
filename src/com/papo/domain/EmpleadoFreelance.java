package com.papo.domain;

public class EmpleadoFreelance extends Empleado{
	private long calcularHora;
	private int nroHoras;

	public EmpleadoFreelance(String nombre, long calcularHora, int nroHoras) {
		super(nombre);
		this.calcularHora = calcularHora;
		this.nroHoras = nroHoras;
	}

	@Override
	protected double calcularSalario() {
		return this.calcularHora * this.nroHoras;
	}
	
	
	
	
}
