//7. Escribe un programa que muestre tres apuestas de la quiniela en tres columnas para los 14
//partidos y el pleno al quince (15 filas).

package segundo_trimestres;

import java.util.Random;
import java.util.Scanner;

public class EJ7_Random {
	static Scanner entrada=new Scanner(System.in);
	public static void main(String[] args) {
		Random random=new Random();
	
		Tabla();
		
		
		
	}
	public static void Tabla() {
		Random random1=new Random();
		
		System.out.println(r=(char) (random1.nextInt(3)+'0')+"   "+r+"   "+r);
		System.out.println();
	}
}
