package Clases;
import java.util.ArrayList;
public class Operativos extends Empleados{
	
	//Atributos
	ArrayList<String>cursos_realizados = new ArrayList<>();
	String ubicacion_zona_trabajo;
	String oficio;
	String descripcion_labores;
	int respuesta;
	
	//Constructor
	public Operativos() {
		cursos_realizados.add("POO");
		ubicacion_zona_trabajo = "507";
		oficio = "Limpieza de datos";
		descripcion_labores = "Limpieza General";
		respuesta = 0;
	}
	
	//Responsabilidades
	void consultar_cursos() {
		System.out.println("Esta Consultando sus Cursos");
	}
	
	void actualizar_cursos() {
		System.out.println("Esta Actualizando sus Cursos");
	}
	
	void consultar_labores() {
		System.out.println("Consultando labores");
	}
	
	void actualizar_labores() {
		System.out.println("Actualizando labores");
	}
	
	void liq_nomina1() {
		this.Liquidacion_nomina();
		this.liquidacion_vacaciones();
	}
	

}
