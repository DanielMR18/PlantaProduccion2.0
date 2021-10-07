package Clases;
import java.util.Scanner;
public class Main {
	static int OpcionUsuario = -1;                                     
    static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		 while (OpcionUsuario != 0)
	        {
	            try{
	                System.out.println("***   PLANTA DE PRODUCCION ***\n");
	                System.out.println("     .:: MENU PRINCIPAL ::.   \n");
	                System.out.println("1. Operativos.                      ");
	                System.out.println("2. Administrativos.              ");            
	                System.out.println("3. Tecnicos.                     ");
	                System.out.println("4. No Tecnicos.                      ");
	                System.out.println("0. Salir                      \n");
	                System.out.print("Señor usuario, elige opción: _    ");
	                OpcionUsuario = Integer.parseInt(scanner.nextLine()); 
	                
	                switch(OpcionUsuario)
	                {
	                    case 1: 
	                        //Codigo opcion #1;
	                    	Operativos OP;
	                    	OP = new Operativos();
	                    	OP.consultar_cursos();
	                    	OP.actualizar_cursos();
	                    	OP.consultar_labores();
	                    	OP.actualizar_labores();
	                    	OP.liq_nomina1();
	                        break;
	                    case 2: 
	                        //Codigo opcion #2;
	                    	Administrativos AD;
	                    	AD = new Administrativos();
	                    	AD.generar_informes();
	                    	AD.consultar_titulos();
	                    	AD.modificar_titulos();
	                    	AD.modificar_datos_personales();
	                    	AD.consultar_datos_personales();
	                    	AD.liq_nomina();
	                        break;
	                    case 3: 
	                        //Codigo opcion #3;
	                    	Tecnicos TE;
	                    	TE = new Tecnicos();
	                    	TE.Informacion();
	                        break;
	                    case 4: 
	                        //Codigo opcion #4;
	                    	No_Tecnicos NTE;
	                    	NTE = new No_Tecnicos();
	                    	NTE.Informacion2();
	                        break;
	                    case 0: 
	                        System.out.println("Adios!");
	                        break;
	                    default:
	                        System.out.println("Opción no reconocida");break;
	                }
	                System.out.println("\n"); 
	            }
	            catch(Exception e){
	                System.out.println("Uoop! Error!");
	            }
	        }

	}

}
