package packpub;

import packfeed.*;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import javax.management.InstanceAlreadyExistsException;

/**
 * Clase que se encargara del menu con la gestion del pub
 * @author Diego Fernandez
 *
 */
public class PubManagement {
	
	

	public static void main(String[] args) {
		
		
		try {
			menu();
		} catch (NullPointerException | FileNotFoundException e) {
			e.printStackTrace();
		}
		

	}

	
	
	
	/**
	 * metodo auxiliar para facilitar la lectura del metodo main
	 * Muestra por pantalla la descripcion del menu
	 */
	public static void printMenuOptions() {
		
		
		
		String opciones =  "\n----BIENVENIDO AL MENU DEL PUB----\n"
				+ "TECLA 1 = informacion de los alimentos\n"
				+ "TECLA 2 = informacion de las bebidas\n"
				+ "TECLA 3 = ordenar la lista de bebidas segun el nombre\n"
				+ "TECLA 4 = cerveza mas barata?\n"
				+ "TECLA 5 = bebida mas barata?\n"
				+ "TECLA 6 = precio de las bebidas\n"
				+ "TECLA 7 = bebidas que disponen de servicio a domicilio\n"
				+ "TECLA 8 = incorporar un pedido\n"
				+ "TECLA 9 = borrar un pedido\n"
				+ "TECLA 10 = guardar la lista de la comida en un fichero\n"
				+ "TECLA 11 = leer el contenido del fichero\n"
				+ "TECLA 12 = vaciar la lista de pedidos\n"
				+ "TECLA 13 = mostrar la lista de pedidos\n\n"
				+ "TECLA -1 = salir del menu del pub...";	
		
		System.out.println(opciones);
		System.out.println();
		System.out.println("Tecleé una opción: ");
		
		
		
		
	}
	
	
	
	static Pub listaPub = Pub.getInstance();
	
	static OrderSet listaOrder = OrderSet.getInstance();
	
	
	/**
	 * metodo auxiliar para facilitar la lectura del metodo main
	 * muestra las diferentes opciones que ofrece el menu, y el tratamiento
	 * de cada una de las excepciones
	 * @throws FileNotFoundException 
	 * @throws NullPointerException 
	 */
	public static void menu() throws NullPointerException, FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		int opciones;
		int n;
		String fichero = "./data/FicheroComidas.txt";
		
		
		try {
			cargarBebidas();
			cargarPedidos();
			cargarAlimentos();
		} catch (InstanceAlreadyExistsException e) {
			e.printStackTrace();
		}

		
		do {
			
			printMenuOptions();
			opciones = sc.nextInt();
			
			switch(opciones) {
				
			case 1:
				listaPub.loadFoodFromFile(fichero);
				System.out.println();
				break;
				
			case 2:
				listaPub.showDrink();
				System.out.println();
				break;
				
			case 3:
				System.out.println(listaPub.sortDrinks());
				System.out.println();
				break;
				
			case 4:
				System.out.println(listaPub.cheapestBeer());
				System.out.println();
				break;
				
			case 5:
				System.out.println(listaPub.cheapestDrink());
				System.out.println();
				break;
				
				
			case 6:
				listaPub.precio();
				System.out.println();
				break;
			
				
			case 7:
				listaPub.tieneEnvio();
				System.out.println();
				break;
				
			case 8:
				
				try {
					System.out.println("Introduce una ID valida: ");
					n = sc.nextInt();
					Order ordern = new Order(n);
					listaOrder.addOrder(ordern);
					System.out.println("PEDIDO AÑADIDO");
				}catch (InstanceAlreadyExistsException e) {
					e.printStackTrace();
				}
				
				System.out.println();
				break;
				
			case 9:
				System.out.println("Introduce una ID valida: ");
				n = sc.nextInt();
				listaOrder.obtainAndRemoveFirstOrder(n);
				System.out.println("LA LISTA QUEDA ASI:");
				listaOrder.showOrder();
				System.out.println();
				
				break;
				
			case 10:
				
				try {
					
					String f = "./data/FicheroComidas.txt";
					listaPub.storeFoodInFile(f);
					System.out.println("ALIMENTOS AÑADIDOS CON EXITO");
						
				} catch (IOException e) {
					
					e.printStackTrace();
				
				}catch (NullPointerException e) {
					
					e.printStackTrace();
					
				}
				
				System.out.println();
				break;
				
			case 11:
				
				try {
					String f = "./data/FicheroComidas.txt";
					listaPub.loadFoodFromFile(f);
				} catch (IOException e) {
					
					e.printStackTrace();
				
				}catch (NullPointerException e) {
					
					e.printStackTrace();
					
				}
				
				System.out.println();
				break;
				
				
			case 12:
				listaOrder.resetOrder();
				System.out.println("LISTA BORRADA");
				System.out.println();
				
			case 13:
				listaOrder.showOrder();
				System.out.println();
				
				
			case -1:
				
				break;
			
			}
			
		} while (opciones != -1);
		
		
		sc.close();

	}
	
	
	/**
	 * metodo auxiliar para cargar las bebidas en la lista del pub
	 * @throws InstanceAlreadyExistsException
	 */
	public static void cargarBebidas() throws InstanceAlreadyExistsException{
		
		SoftDrink drink1 = new SoftDrink("Coca-Cola", "azucarado", true, 5);
		SoftDrink drink2 = new SoftDrink("Fanta", "zero", true, 5);
		SoftDrink drink3 = new SoftDrink("Pepsi", "zero", true, 5);
		Wine drink4 = new Wine("Vino Blanco", true, false);
		Liqueur drink5 = new Liqueur("Jagger", "", 6);
		DarkLager drink6 = new DarkLager("DarkLager", 3.7, 5.8, "Dinamarca", "Mahou", "botella");
		Pilsener drink7 = new Pilsener("Pilsener", 3.7, 5.8, "Groenlandia", "Voldawn", 5.8);
		
		//añadimos las bebidas a la lista
		listaPub.addDrink(drink1);
		listaPub.addDrink(drink2);
		listaPub.addDrink(drink3);
		listaPub.addDrink(drink4);
		listaPub.addDrink(drink5);
		listaPub.addDrink(drink6);
		listaPub.addDrink(drink7);
		
		
		
	}
	
	/**
	 * metodo auxiliar para cargar pedidos
	 * @throws InstanceAlreadyExistsException
	 */
	public static void cargarPedidos() throws InstanceAlreadyExistsException {
		
		Order order1 = new Order(999);
		Order order2 = new Order(998);
		Order order3 = new Order(997);
		Order order4 = new Order(996);
		
		
		//añadimos los pedidos a la lista
		listaOrder.addOrder(order1);
		listaOrder.addOrder(order2);
		listaOrder.addOrder(order3);
		listaOrder.addOrder(order4);
		
	}
	
	
	
	public static void cargarAlimentos() throws InstanceAlreadyExistsException {
		
		Food food1 = new Food("Pizza", 999);
		Food food2 = new Food("Burrito", 998);
		Food food3 = new Food("Hamburguesa", 997);
		
		listaPub.addFood(food1);
		listaPub.addFood(food2);
		listaPub.addFood(food3);
	}
	
	
	
	
	
	
	
}
