//44. Realizar un programa que compruebe si una frase es palíndroma.
package segundo_trimestres;

import java.util.Scanner;

public class EJ44_CAD {
	public static void main(String[] args) {
		Scanner entrada=new Scanner (System.in);
		String frase;
		System.out.println("Dime una frase y te dire si es palindroma o no ");
		frase=entrada.nextLine();
		
		String fraseInvertida="";
		for(int i=frase.length()-1;i>=0;i--) {
			
				fraseInvertida+=frase.charAt(i);
			
			
			
		}
		if(frase.equals(fraseInvertida)) {
			System.out.println("La frase es palindroma");
		}else {
			System.out.println("La frase no es palindroma");
		}
		
		
		
		
		
		
		entrada.close();
	}

}
