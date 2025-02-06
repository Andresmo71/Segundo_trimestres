//Realizar un programa que dada una cadena de caracteres por caracteres, genere otra cadena
//resultado de invertir la primera.
package segundo_trimestres;

import java.util.Scanner;

public class EJ6_CADENAS {
	public static void main(String[] args) {
			Scanner entrada=new Scanner(System.in);
			String cad;
			System.out.println("Introduce uan cadena");
			cad=entrada.nextLine();
			for(int i=cad.length()-1;i>=0;i--) {
				System.out.print(cad.charAt(i));
			}
	}

    


}
