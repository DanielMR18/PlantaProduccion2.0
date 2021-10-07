package Clases;

public class Tecnicos extends Operativos{

	//Constructor
	public Tecnicos() {
		
	}
	
	//Responsabilidades
	void Informacion () {
		System.out.println("Esta en Tecnicos");
		System.out.println("");
		System.out.println(ubicacion_zona_trabajo);
		System.out.println(oficio);
		System.out.println(descripcion_labores);
		this.consultar();
		this.actualizacion_datos();
	}

}
