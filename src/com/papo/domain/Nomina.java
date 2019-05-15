package com.papo.domain;

import java.util.ArrayList;
import java.util.Arrays;

public class Nomina {
	private ArrayList<Empleado> empleados = new ArrayList<>(Arrays.asList());;
	
	public void calcularNomina(){
		System.out.println(empleados.size());
		for (Empleado empleado : empleados) {
			
			System.out.println(empleado.getNombre() + " " + empleado.calcularSalario());
		}
	}
	public void listarDirectos(){
		
	}

	public void listarFreelance(){
	
	}
	public ArrayList<Empleado> getEmpleados() {
		return empleados;
	}		
	
	
}
