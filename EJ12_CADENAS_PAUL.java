package segundo_trimestres;

import java.util.Scanner;

public class EJ12_CADENAS_PAUL {
	//definición de variables globales
		static Scanner scanner=new Scanner(System.in);
		static String[] nombres;
		static double[] precios;
		static int[] cantidades;
		static int pos=0;
		final static int TAM=10;
		public static void main(String[] args) {
		//Constuimos las variables globales
			nombres= new String[TAM];
			precios=new double[TAM];
			cantidades=new int[TAM];
			String nombre="";
			double precio=0;
			int cant=0;
			
			int opcion=0;
			do {
				mostrarMenu();
				opcion=scanner.nextInt();
				switch(opcion) {
					case 1:
						System.out.println("Introduce nombre, precio y cantidad");
						nombre=scanner.nextLine();
						scanner.nextLine();
						precio=scanner.nextDouble();
						cant=scanner.nextInt();
						if (insertaProducto(nombre,precio,cant))
							System.out.println("Producto insertado");
						else
							System.out.println("Producto NO insertado");
						break;
					case 2:
						buscarYMostrarProducto(nombre);
						break;
					case 3:
						modificarProducto(nombre,precio,cant);
						break;
					case 4:
						System.out.println("Ha salido.");
						break;
					default:
				
				}
				
			}while(opcion!=4);
		}
		
		public static void mostrarMenu() {
			System.out.println("ALMACEN DE PRODUCTOS");
			System.out.println("1. Insertar");
			System.out.println("2. Buscar por nombre");
			System.out.println("3. Modificar");
			System.out.println("4. Salir");
		}
		public static boolean insertaProducto(String nombre,
				double precio,int cant) {
			if (pos==TAM) {	//el almacen está lleno 
				return false;
			}
			for (int i=0;i<pos;i++) { //se repite el producto
				if (nombre.equals(nombres[i])) {
					return false;
				}
			}
			//el almacen tiene espacio y el producto no existe:
			nombres[pos]=nombre;
			precios[pos]=precio;
			cantidades[pos]=cant;
			pos++;
			return true;
			
		}
		public static void buscarYMostrarProducto(String nom) {
		System.out.println("Que producto buscas?");
		nom=scanner.nextLine();
		for(int i=0;i<TAM;i++) {
			if(nom.equals(nombres[i])) {
				System.out.println("El prodcto "+nombres[i]+"cuesta "+precios[i]+"y quedan en stock "+cantidades[i]);
			}else {
				System.out.println("Este procucto no existe");
			}
		}
	}
		public static void modificarProducto( String nom, double precio , int cant) {
			System.out.println("Que producto deseas modificar?");
			scanner.nextLine();
			nom=scanner.nextLine();
			for(int i=0;i<TAM;i++) {
				if(nom.equals(nombres[i])) {
					System.out.println("El precio actual del producto es de "+precios[i]+"$ y el stock es de "+cantidades[i]);
					System.out.println("Dime el nuevo precio del producto");
					precios[i]=scanner.nextDouble();
					System.out.println("Dime el nuevi stock del producto");
					cant=scanner.nextInt();		
					System.out.println("Ahora el producto vale "+precios[i]+"$ y el stock es de "+cantidades[i]);
				}
			}
			
			
		}
		
}

