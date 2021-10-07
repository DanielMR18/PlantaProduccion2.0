package Clases;

public class Empleados {
	
	//Atributos
	int cedula;
	String nombre;
	String direccion;
	String celular;
	String correo;
	double salario;
	String fecha_ingreso_compañia;
	String fecha_cumpleaños;

	//Constructor
	public Empleados() {
		cedula = 1001234432;
		nombre = "Juan";
		direccion = "Cra 30, #80-15";
		celular = "3106823504";
		correo = "dm3147356@gmail.com";
		salario = 10000000;
		fecha_ingreso_compañia = "10/10/2018";
		fecha_cumpleaños = "10/10/1999";
	}
	
	//Responsabilidades
	void Liquidacion_nomina() {
		System.out.println("Estas liquidando nomina");
	}
	
	void liquidacion_vacaciones() {
		System.out.println("estas liquidando las vacaciones xd");
	}
	
	void consultar() {
		System.out.println("Buscando datos personales");
	}
	
	void actualizacion_datos() {
		System.out.println("Actualizando datos");
	}

}
