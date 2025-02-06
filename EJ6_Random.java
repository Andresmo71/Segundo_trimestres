//6. Escribe un programa que piense un número al azar entre 0 y 100. El usuario debe adivinarlo y
//tiene para ello 5 oportunidades. Después de cada intento fallido, el programa dirá cuántas
//oportunidades quedan y si el número introducido es menor o mayor que el número secreto.

package segundo_trimestres;

import java.util.Random;
import java.util.Scanner;

public class EJ6_Random {
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		Random random= new Random();
		int num_secreto=random.nextInt(101);
		int num=0;
		int intentos=5;
		System.out.println("Intenta adivinar el numero , dispones de 5 intentos");
		System.out.println("Dime un numero");
		do {
			num=entrada.nextInt();
			if(num==num_secreto) {
				System.out.println("Has adivinado el numero");
			}else {
				intentos--;
				if(num<num_secreto && intentos>=1) {
					System.out.println("El numero secreto es mas alto");
					System.out.println("Te quedan "+intentos+" intentos");
				}else {
					System.out.println("El numero secreto es mas bajo");
					System.out.println("Te quedan "+intentos+" intentos");
				}
			}
		
	  }while(intentos!=0);
		System.out.println("El numero secreto era "+num_secreto+" , te has quedado sin intentos");
		
		entrada.close();
	}
	
  
}
