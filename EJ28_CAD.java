//28. Programa que lea una cadena que contiene el nombre y apellidos de una persona, y lo
//devuelva en formato «Apellidos, Iniciales»
package segundo_trimestres;

import java.util.Scanner;

public class EJ28_CAD {
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		String cad;
		System.out.println("Introduce tu nombre y apellidos");
		cad=entrada.nextLine();
		String [] NombreApellidos = cad.split(" ");
		if(NombreApellidos.length==3) {
			System.out.println(NombreApellidos[1]+" "+NombreApellidos[2]+" "+NombreApellidos[0]);
		}
		if(NombreApellidos.length==4) {
			System.out.println(NombreApellidos[2]+" "+NombreApellidos[3]+" "+NombreApellidos[0].charAt(0)+"."+NombreApellidos[1].charAt(0));
		}
		
		
		
		
		
		entrada.close();
	}

}
