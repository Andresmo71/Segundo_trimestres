//Pide una cadena y dos caracteres por teclado (valida que sea un carácter), sustituye la aparición
//del primer carácter en la cadena por el segundo carácter.
package segundo_trimestres;

import java.util.Scanner;

public class EJ7_CADENAS {
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		String cad;
		String cad2="";
		char c1='a';
		char c2;
		System.out.println("Introduce una cadena");
		cad=entrada.nextLine();
		System.out.println("Dime un caracter que este en tu cadena");
		c1=entrada.nextLine().charAt(0);
		System.out.println("Dime otro carcater");
		c2=entrada.nextLine().charAt(0);
		for(int i=0;i<cad.length();i++) {
			if(cad.charAt(i)==c1) {
				cad2+=c2;
				}else {
			cad2+=cad.charAt(i);
		}
		}
		System.out.println("Tu cadena ahora es asi: "+cad2);
	}
}
