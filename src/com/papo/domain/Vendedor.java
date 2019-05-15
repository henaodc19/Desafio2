package com.papo.domain;

public class Vendedor extends EmpleadoDirecto{
	private long ventasDelMes;
	
	public Vendedor(String nombre, long salario, long ventasDelMes) {
		super(nombre, salario);
		this.ventasDelMes = ventasDelMes;
		
	}
	
	public double calcularComision(){
		if(getSalario() < 1000000){
			return ventasDelMes * 0.03;
		}
		
		return ventasDelMes * 2.6 / 100;
		
	}
	
	@Override
	protected double calcularSalario() {
		return super.calcularSalario() + calcularComision();
	}

}
