//Ejercicio 12. Realizar un programa en java que gestione los datos de stock de una
//tienda de comestibles,la información a recoger será: nombre del producto(no se
//puede repetir), precio, cantidad en stock.
//La tienda dispone de 10 productos distintos. El programa debe ser capaz de:
//1. Dar de alta un producto nuevo.
//2. Buscar un producto por su nombre.
//3. Modificar el stock y precio de un producto dado.

package segundo_trimestres;

import java.util.Scanner;

public class EJ12_CADENAS {
	static Scanner entrada=new Scanner(System.in);
	public static void main(String[] args) {
	String [] nombre=new String[10];
	double [] precio=new double[10];
	int [] stock=new int[10];
	int opcion;
	int cont=1;
	String n;
	System.out.println("Introduce 10 productos");
	for(int i=0;i<10;i++) {
		System.out.println("Introduce el nombre del nuevo producto "+i);
		entrada.nextLine();
		nombre[i]=entrada.nextLine();
		System.out.println("Introduce el precio del nuevo producto "+i);
		precio[i]=entrada.nextDouble();
		System.out.println("Introduce el stock del nuevo producto "+i);
		stock[i]=entrada.nextInt();
		if(i>0) {
			for(int k=0;k<10;k++) {
					for(int l=0;l<10;l++) {
						while(nombre[k].equals(nombre[l])) {
							System.out.println();
						}
					}
			}
		}
	}
	
	do {
		System.out.println("1.Introducir producto");
		System.out.println("2.Buscar producto");
		System.out.println("3.Modificar producto");
		System.out.println("4.Salir");
		opcion=entrada.nextInt();	
		if(opcion==1) {
			System.out.println("Introduce el nombre del nuevo producto ");
			entrada.nextLine();
			nombre[cont]=entrada.nextLine();
			System.out.println("Introduce el precio del nuevo producto ");
			precio[cont]=entrada.nextDouble();
			System.out.println("Introduce el stock del nuevo producto ");
			stock[cont]=entrada.nextInt();
			cont++;
			for(int i=0;i<10;i++) {
				
			}
		}
		if(opcion==2) {
			System.out.println("Dime el producto que quieres buscar por su nombre");
			n=entrada.nextLine();			
			for(int j=0;j<10;j++) {
				if (n==nombre[j]) {
					System.out.println("El precio del producto es "+precio[j]);
					System.out.println("El stock del producto es "+stock[j]);
				}
			}
		}
		if(opcion==3) {
			System.out.println("Dime el nombre del producto que quieres modificar");
			n=entrada.nextLine();
			for(int j=0;j<10;j++) {
				if (n==nombre[j]) {
					System.out.println("El precio actual del producto es "+precio[j]+"y el stock actual es "+stock[j]);
					System.out.println("Dime el nuevo precio y el nuevo stock del producto");
					precio[j]=entrada.nextDouble();
					stock[j]=entrada.nextInt();		
					System.out.println("El precio del producto ahora es de "+precio[j]+"y el stock ahora es de "+stock[j]);
					}
			}
		}
	}while(opcion!=4);
		System.out.println("Te has salido del menu,chao");
		
	}
}
