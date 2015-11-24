import java.util.Scanner;
public class ejer1 {
	
	
		public static void main(String[] args) 
		{
	//SISTEMA PROMEDIO DE CAILIFACION DE N ALUMNOS 
			Scanner entrada= new Scanner (System.in);
			 int cantAl=0;
			 int cont=0; 
			 float calf=0.0f;
			 float prom=0.0f;
			System.out.println("******************************************************");
			System.out.println  ("****** BIENVENIDOS AL SISTEMA DE CALIFICACIONES******");
			
			System.out.println("****** INGRESE CANTIDAD DE ALUMNOS POR FAVOR ***********:");
				cantAl = entrada.nextInt();
			while (cont < cantAl)
				{
			System.out.print("********** INGRESE LAS CALIFICACION ***************");
			calf += entrada.nextFloat();
			cont++;
				}
			prom = (calf / cantAl);
			System.out.println("");	
			System.out.println("    EL PROMEDIO ES: ***********"   +prom+     "**********    "   );
			System.out.println("******* GRACIAS POR UTILIZAR NUESTRO SISTEMA ");	
					}
			}
	//ALAVA MARCILLO NOEMI ESTHER 


