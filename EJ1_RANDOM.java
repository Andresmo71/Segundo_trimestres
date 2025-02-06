package segundo_trimestres;

import java.util.Random;

public class EJ1_RANDOM {
	public static void main(String[] args) {
		Random random=new Random();
		
		for(int i=0;i<20;i++) {
			int n=random.nextInt(11);
			System.out.print(n+" ");
		
	}
		System.out.println("Cambio en el archivo");
 }
}
