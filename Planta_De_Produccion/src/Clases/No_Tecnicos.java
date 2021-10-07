package Clases;

public class No_Tecnicos extends Operativos{

	//Constructor
	public No_Tecnicos() {
		
	}
	
	//Responsabilidades
	void Informacion2 () {
		System.out.println("Esta en No Tecnicos");
		System.out.println("");
		System.out.println(ubicacion_zona_trabajo+ " En el 5 piso");
		System.out.println(oficio);
		System.out.println(descripcion_labores);
		this.consultar();
		this.actualizacion_datos();
	}

}
