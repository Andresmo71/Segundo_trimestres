package segundo_trimestres;

import java.util.Scanner;

public class Usar_Password {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		
		int num_contraseñas;
		System.out.println("Dime cuantas contraeñas quieres guardar");
		num_contraseñas=entrada.nextInt();
		
		String [] array_contraseñas= new String[num_contraseñas];
		int longitud_contraseñas=0;
		
		System.out.println("Dime la longitud que quieres que tengan las contraseñas");
		longitud_contraseñas=entrada.nextInt();
		boolean [] array_booleanos=new boolean[num_contraseñas];

		for(int i=0;i<num_contraseñas;i++) {
			Password contraseña=new Password(longitud_contraseñas);
			array_contraseñas[i]=contraseña.GetContraseña();
			array_booleanos[i]=contraseña.esFuerte(array_contraseñas[i]);
			
		}
		for(int i=0;i<num_contraseñas;i++) {
			System.out.println("Contraeña "+(i+1)+":  "+array_contraseñas[i]+"  -  "+array_booleanos[i]);
		}
		
		
		entrada.close();
	}

}
