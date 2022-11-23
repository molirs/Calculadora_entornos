/**************************************************************************
AUTORES: MIGUEL MOLINA QUEROL, DAVID BALLESTEROS SANCHEZ, CRISTIAN PRIETO
FECHA INICIO: 14-11-2022
FECHA DE FINALIZACION: 14-11-2022
CENTRO: I.E.S. PABLO SERRANO
TITULACION: PROGRAMACION APLICACIONES MULTIPLATAFORMA
MODULO: PROGRAMACION
COMENTARIO: PROGRAMA QUE LEE UNA PALABRA E INTERCAMBIA PRIMERA Y ULTIMA
			LETRA Y TE DEVUELVE EL RESULTADO
**************************************************************************/

package calculator;
import java.util.Scanner;

public class calc {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int n1,n2,result, select;
		
		System.out.print("Introduce el primer valor: ");
		n1=teclado.nextInt();
		System.out.print("Introduce el segundo valor: ");
		n2=teclado.nextInt();
		
		System.out.println("SUMA (1)");
		System.out.println("RESTA (2)");
		System.out.println("MULTIPLICACION (3)");
		System.out.println("DIVISION (4)");
		System.out.print("Porfavor seleccione operacion a realizar: ");
		select=teclado.nextInt();
		
		switch(select) {
			case 1:
				result=n1+n2;
				System.out.println("La suma de " +n1+ " y " +n2+" es " + result);
			break;
			case 2:
				result=(n1-n2);
				System.out.print("La resta de " + n1 + " y " + n2 + " es " + result);
			break;
			case 3:
				result=n1*n2;
			System.out.println("El resultado de la multiplicación "+n1+" X "+n2+" es: "+result);
			break;
			case 4:
				result=n1/n2;
				System.out.println("El resultado de la division entera de "+n1+" / "+n2+" es: "+result);
			break;
		}
	}
}