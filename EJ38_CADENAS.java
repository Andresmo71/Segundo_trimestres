package segundo_trimestres;

import java.util.Scanner;

public class EJ38_CADENAS {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Dime algo");
		String cad=in.nextLine();
		String cadInvertida="";
		for(int i=cad.length()-1;i>=0;i--) {
			cadInvertida+=cad.charAt(i);
		}
		System.out.println("Asi es al reves: "+cadInvertida);
		in.close();
	}

}
