package com.papo.app;

import javax.swing.JOptionPane;

import com.papo.domain.Empleado;
import com.papo.domain.EmpleadoDirecto;
import com.papo.domain.EmpleadoFreelance;
import com.papo.domain.Nomina;
import com.papo.domain.Vendedor;

public class App {

	public static void main(String[] args) {
		Nomina nomina = new Nomina();
		while(true){
			
			String[] opciones = {"Ingresar empleado Directo", "Calcular nominas", "ingresar freelance","Ingresar vendedor", "cancelar"};
			int seleccion = JOptionPane.showOptionDialog(null, "Que deseas hacer", "Opciones", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
			
			if(seleccion == 0){
				String nombre = JOptionPane.showInputDialog("Escribe el nombre");
				String salario = JOptionPane.showInputDialog("Escribe el salario");
				long salarioLong = Integer.parseInt(salario);
				
				EmpleadoDirecto empleDirecto = new EmpleadoDirecto(nombre, salarioLong);
				
				nomina.getEmpleados().add(empleDirecto);
			}
			
			if(seleccion == 1){
				nomina.calcularNomina();
			}
			
			if(seleccion == 2){
				String nombre = JOptionPane.showInputDialog("Escribe el nombre");
				String basico = JOptionPane.showInputDialog("Escribe el basico hora");
				long basicoHora = Integer.parseInt(basico);
				String nroHoras = JOptionPane.showInputDialog("Cuantas horas trabajo");
				int horas = Integer.parseInt(nroHoras);
				
				EmpleadoFreelance freelance = new EmpleadoFreelance(nombre, basicoHora, horas);
				
				nomina.getEmpleados().add(freelance);
			}
			if(seleccion == 3){
				String nombre = JOptionPane.showInputDialog("Escribe el nombre");
				String basico = JOptionPane.showInputDialog("Escribe el salario");
				long salBasico = Integer.parseInt(basico);
				String ventas = JOptionPane.showInputDialog("ventas del mes");
				long ventasMes = Integer.parseInt(ventas);
				
				Vendedor vendedor = new Vendedor(nombre, salBasico, ventasMes);
				
				nomina.getEmpleados().add(vendedor);
			}
			
			if(seleccion == 4){
				break;
			}
		}

	}

}
