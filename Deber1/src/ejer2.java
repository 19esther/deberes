import java.util.Scanner;
public class ejer2 {
	public static void main(String[] args)     {
		float imp=0;
		float desc=0,total=0,acum=0,acum1=0,acum2=0,tp1=0,tp2=0,tp3=0,sum=0;
		int op,s = 0;
//SISTEMA DE TIENDA DE DESCUENTO
		Scanner entrada= new Scanner (System.in);
	do
	{
				System.out.println("INGRESE EL IMPORTE DEL DIA POR FAVOR ");
				imp = entrada.nextFloat();
				
				System.out.println(" ****BIENVENIDOS AL MENU**** :"
						+ "\n     1. Bolita Roja     "
				        + "\n     2. Bolita Amarilla"
				+ "\n     3. Bolita Blanca");
			do
		{ System.out.println("****** ELIJA UNA DE LAS OPCIONES POR FAVOR *******:");
				op = entrada.nextInt(); 		
		}
		while (!(op >=1 && op<=3));
			switch (op)
			{
			case 1 : 
				desc=(float) (imp* 0.4);
				total =(float) (imp-desc);
				System.out.println(" EL TOTAL ES :" +total);
				System.out.println("****DESEA SEGUIR UTILIZANDO EL SISTEMA****:");
				System.out.println("1.-Si");
				System.out.println("2.-No");
				s= entrada.nextInt();
				acum=total+0;
				tp1=acum;
				break;
			case 2 :
				desc= (float)(imp*0.25);
				total=(float) (imp-desc);
				System.out.println("Total es:" +total);
				System.out.println("*****DESEA SEGUIR UTILIZANDO NUESTRO SISTEMA***** :");
				System.out.println("1.-Si");
				System.out.println("2.-No");
				s= entrada.nextInt();
				acum1=total+0;
				tp2=acum1;
				break;
			case 3 :	
				desc=(float) imp;
				System.out.println("El total es:"+desc);
				System.out.println("*****DESEAS UTILIZANDO NUESTRO SISTEMA*******:");
				System.out.println("1.-Si");
				System.out.println("2.-No");
				s= entrada.nextInt();
				acum2=desc+0;
				tp3=acum2;
			 break;
			}
	}	
	while (s==1);
	sum=tp1+tp2+tp3;
	if (s==2){
	System.out.println("***** TOTAL DE IMORTE DEL DIA****** :" +sum);
	System.out.println("*****GRACIAS POR UTILIZAR NUESTRO SERVICIO *********");	
	}
} 
	}
//ALAVA MARCILLO NOEMI ESTHER 
