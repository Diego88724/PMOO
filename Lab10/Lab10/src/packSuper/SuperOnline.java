package packSuper;

import packStock.*;
import packProduct.*;

import java.util.Scanner;

import java.util.InputMismatchException;

import javax.management.InstanceAlreadyExistsException;
import javax.management.InvalidAttributeValueException;

import packException.UnknownCodeException;

/**
 * Clase que gestiona todo el supermercado
 * @author Diego Fernandez
 *
 */
public class SuperOnline {

	public static void main(String[] args)  {
		
		SuperOnline m = new SuperOnline();
		
		try {
			
			loadProducts();
			
		} catch (InstanceAlreadyExistsException e) {
			e.printStackTrace();
		}
		
		
		
		try {
			
			m.menu();
			
		} catch (InvalidAttributeValueException e) {
			
			e.printStackTrace();
			
		} catch (UnknownCodeException e) {

			e.printStackTrace();
		}
		
		


	}	//MAIN
	

		
		static Stock mStock = Stock.getInstance();
	
		
		/**
		 * metodo que crea un menu que hara la lista de tareas presentes en el enunciado
		 * @throws InvalidAttributeValueException 
		 * @throws UnknownCodeException 
		 */
		public void menu() throws InvalidAttributeValueException, UnknownCodeException {
			Scanner sc = new Scanner(System.in);
			int n;
			int a;
			int opciones;
			
			do {
				
				printMenuReadOption();
				opciones = sc.nextInt();
				
				switch(opciones) {
					
				case 1:
					System.out.println(mStock.toString());
					System.out.println();
					break;
				case 2:
					System.out.println("Introduce una ID valida: ");
					n = sc.nextInt();
					readProductCode(n);
					System.out.println();
					break;
				case 3:
					System.out.println("Introduce una ID valida: ");
					n = sc.nextInt();
					try {
						mStock.removeProduct(n);
					} catch (UnknownCodeException e) {
						e.printStackTrace();
					}
					
					//System.out.println(mStock.toString());
					System.out.println();
					break;
				case 4:
					System.out.println(mStock.printPerishable());
					System.out.println();
					break;
				case 5:
					System.out.println("Introduce una ID valida: ");
					n = sc.nextInt();
					System.out.println("Introduce una nueva cantidad del producto: ");
					a = sc.nextInt();
					try {
						mStock.updateAmount(n, a);
					} catch (InvalidAttributeValueException e) {
						e.printStackTrace();
					}
					
					System.out.println();
					break;
				case -1:
					break;
				
				}
				
			} while (opciones != -1);
			
			
			sc.close();

		}
		
		/**
		 * metodo estatico que almacenara los productos en Stock
		 */
		private static void loadProducts() throws InstanceAlreadyExistsException{

			try {
				mStock.addProduct(new Frutas(12,"banana", 0.23, 7, 0.130, "2022/05/15", "Canarias")); 
				mStock.addProduct(new Electrodomesticos(43, "screwdriver", 16.75, 15, 0.720)); 
				mStock.addProduct(new Limpieza(51, "bleach", 1.25, 23, 2.3, "cleaning")); 
				mStock.addProduct(new Frutas(12, "mango", 3.27, 65, 0.35, "2022/05/30", "India"));
				mStock.addProduct(new Lacteos(37, "yogurt", 0.45, 120, 0.2, "2022/05/20", "18-23"));  
				mStock.addProduct(new Bebidas(25, "ron", 13.87, 23, 1.2, "2035/12/31", 18.5));
				mStock.addProduct(new Electrodomesticos(43, "drill", 43.95, 10, 1.51));
				mStock.addProduct(new Bebidas(28, "wine", 9.85, 24, 1.3, "2030/12/31", 6.3));
			}
			catch (InstanceAlreadyExistsException e) {
				e.printStackTrace();
			}
			
			
			//SEGUNDA FORMA
			
//			try {mStock.addProduct(new Frutas(12, "banana", 0.23, 7, 0.130, "2022/05/15", "Canarias"));
//			}			
//			catch (InstanceAlreadyExistsException e){
//				System.out.println(e.getMessage());
//				}
//			try {
//				mStock.addProduct(new Electrodomesticos(43, "screwdriver", 16.75, 15, 0.720));
//			} 
//			catch (InstanceAlreadyExistsException e) {
//				System.out.println(e.getMessage());
//				}
//			try {mStock.addProduct(new Limpieza(51, 
//				"bleach", 1.25, 0, 2.3, "cleaning"));
//			} 
//			catch (InstanceAlreadyExistsException e) {
//				System.out.println(e.getMessage());
//			} 
//			try {
//				mStock.addProduct(new Frutas(12, "mango", 3.27, 65, 0.35, "2022/05/30", "India"));
//			} catch (InstanceAlreadyExistsException e) {
//				System.out.println(e.getMessage());
//			}
//			try {
//				mStock.addProduct(new Lacteos(37, "yogurt", 0.45, 120, 0.2, "2022/05/20", "18-23"));
//			} catch (InstanceAlreadyExistsException e) {
//				System.out.println(e.getMessage());
//			}  
//			try {
//				mStock.addProduct(new Bebidas(25, "ron", 13.87, 23, 1.2, "2035/12/31", 18.5));
//			} catch (InstanceAlreadyExistsException e) {
//				System.out.println(e.getMessage());
//			}
//			try {
//				mStock.addProduct(new Electrodomesticos(43, "drill", 43.95, 10, 1.51));
//			} catch (InstanceAlreadyExistsException e) {
//				System.out.println(e.getMessage());
//			}
//			try {
//				mStock.addProduct(new Bebidas(28, "wine", 9.85, 24, 1.3, "2030/12/31", 6.3));
//			} catch (InstanceAlreadyExistsException e) {
//				System.out.println(e.getMessage());
//			}
			
			
		}
		
		/**
		 * metodo que muestra por pantalla la descripcion del menu
		 */
		public void printMenuReadOption() {
			
			
			
			String opciones =  "----BIENVENIDO AL MENU DE SUPERONLINE----\n"
					+ "TECLA 1 = informacion de los productos\n"
					+ "TECLA 2 = obtener el producto dandole una id valida\n"
					+ "TECLA 3 = borrar un producto indicandole su id\n"
					+ "TECLA 4 = lista de los productos enviables\n"
					+ "TECLA 5 = actualiza la cantidad de un producto\n\n"
					+ "TECLA -1 = salir del menu...";	
			
			System.out.println(opciones);
			System.out.println();
			System.out.println("Tecleé una opción: ");
			
			
			
			
		}
		
		/**
		 * metodo que mostrara la informacion de un producto pasandole su id
		 * @param id, id del producto del cual queremos saber su descripcion
		 */
		public void readProductCode(int id) {
			try {
				System.out.println(mStock.obtainProduct(id));
			} catch (InputMismatchException e) {
				e.printStackTrace();
			}
			
			
		}
	
}
