//5. Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos) separados por
//espacios. Muestra también el máximo, el mínimo y la media de esos números.
package segundo_trimestres;

import java.util.Random;

public class EJ5_Random {
	public static void main(String[] args) {
		Random random=new Random();
		int num;
		int max=0;
		int min=200;
		int media=0;
		for(int i=0;i<50;i++) {
			num=random.nextInt(100)+100;
			System.out.print(num+" ");
			media=media+num;
			if(num>max) {
				max=num;
				
			}
			if(num<min) {
				min=num;
			}
			
		}
		media=media/50;
		System.out.println();
		System.out.println("El numero maximo es "+max+", el numero minimo es "+min+" y la media es "+media);
		
		
		
	}
}
