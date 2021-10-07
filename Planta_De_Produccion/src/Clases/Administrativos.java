package Clases;
import java.util.ArrayList;
public class Administrativos extends Empleados {

	//Atributos
	ArrayList<String>titulos_realizados = new ArrayList<>();
	int años_experiencia;
	int numero_personas_a_cargo;
	int numero_extencion;
	
	//Constructor
	public Administrativos() {
		titulos_realizados.add("Ingeniero en Sistemas");
		años_experiencia = 10;
		numero_personas_a_cargo = 5;
		numero_extencion = 225;
	}
	
	//Responsabilidades
	void generar_informes() {
		System.out.println("Generando informe de planta");
	}
	
	void consultar_titulos() {
		System.out.println("Estos son los titulos");
	}
	
	void modificar_titulos() {
		System.out.println("Modificando titulos");
	}
	
	void consultar_datos_personales() {
		this.consultar();
	}
	
	void modificar_datos_personales() {
		this.actualizacion_datos();
	}
	
	void liq_nomina() {
		this.Liquidacion_nomina();
		this.liquidacion_vacaciones();
	}
	

}
