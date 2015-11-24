import java.util.Scanner;
public class ejer3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//SISTEMA PROMEDIO
		Scanner entrada=new Scanner(System.in);
		System.out.println("***** BIENVENIDOS AL SISTEMA DE PROMEDIO GENERAL ");
		float acum=0;
		int x;
		float[] ind=new float[50];
		for(x=0;x<50;x++){
			System.out.println("***** INGRESE LAS NOTAS POR FAVOR ***** ");
			ind [x]=entrada.nextFloat();
			acum=acum+ind[x];
			
		}
		acum=acum/50;
		System.out.println("**** EL PROMEDIO ES:"+ acum);
		if
		(acum>70)
			System.out.println("***  ALUMNOS APROBADOS  ***");
		else
		if (acum<70){
			System.out.println(" **** ALUMNOS REPROBADOS ***");
			
		}
	}

}
