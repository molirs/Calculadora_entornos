/**************************************************************************
AUTOR: MIGUEL MOLINA QUEROL
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
		int n1,n2,result;
		String select;
		System.out.print("Introduce el primer valor: ");
		n1=teclado.nextInt();
		System.out.print("Introduce el segundo valor: ");
		n2=teclado.nextInt();
		System.out.print("Porfavor seleccione operacion a realizar: ");
		select=teclado.nextLine();
		switch(select) {
			case "2":
				result=(n1-n2);
				System.out.print("La resta de " + n1 + " y " + n2 + "es" + result);
				break;				
		}
	}
}