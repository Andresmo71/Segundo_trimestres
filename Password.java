package segundo_trimestres;

import java.util.Random;
import java.util.Scanner;

public class Password {
	
	
	private int longitud;
	private String contraseña;

	public Password() {
		longitud=8;
		contraseña="";
		
	}
	public Password(int longitud) {
	    this.longitud=longitud;
	    contraseña="";
		generarPassword();
	}
	public boolean esFuerte(String c) {
		String minus=c.toLowerCase();
		String mayus=c.toUpperCase();
		int may=0;
		int min=0;
		int num=0;
		for(int i=0;i<c.length();i++) {
			if(c.charAt(i)==mayus.charAt(i)) {
				may++;
			}
		}
		for(int i=0;i<c.length();i++) {
			if(c.charAt(i)==minus.charAt(i)) {
				min++;
			}
		}
		num=c.length()-(may+min);
		if(num>5 && may>2 && min>1) {
			return true;
		}
		return false;
	}
	public void generarPassword() {
		Random random=new Random();
		int num;
		String s="abcdefghijklmnñopqrstuvwxytABCDEFGHIJKLMNÑOPRSTUVWXYZ0123456789";
		 
		for(int i=0;i<longitud;i++) {
			num=random.nextInt(s.length());
			this.contraseña+=s.charAt(num);
		}
	}
	
	public void ponerLongitud(int longitud) {
		Scanner in=new Scanner(System.in);
		longitud=in.nextInt();
		in.close();
	}
	
	public int GetLongitud() {
	return longitud;
	}
	public String GetContraseña() {
		return contraseña;
		}
	
}

