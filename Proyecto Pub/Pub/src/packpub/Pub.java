package packpub;

import java.io.FileNotFoundException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;




import java.util.Collections;
import java.util.Scanner;

//import javax.management.InstanceAlreadyExistsException;

import packfeed.*;



/**
 * Clase para representar la cerveceria
 * @author Diego Fernandez
 *
 */
public class Pub{

	
	private ArrayList<Food> listaFood;
	
	private ArrayList<Drink> listaDrink;
	
	private static Pub instance;
	
	
	/**
	 * Constructor que construye dos listas vacias
	 */
	private Pub() {
		
		listaFood = new ArrayList<Food>();
		
		listaDrink = new ArrayList<Drink>();
			
	}
	
	
	/**
	 * metodo que añade una bebida a la lista de bebidas
	 * @param bebida, bebida que queremos añadir
	 */
	public void addDrink(Drink bebida) {
		
		listaDrink.add(bebida);
		
	}
	
	
	
	
	/**
	 * metodo que elimina una bebida que le pasamos por parametro
	 * @param bebida, bebida que queremos eliminar de la lista
	 */
	public void removeDrink(Drink bebida) {
		
		for (int i=0; i<listaDrink.size(); i++) {
			if (listaDrink.get(i).equals(bebida)) {
				listaDrink.remove(i);
			}
		}
		
	}
	
	/**
	 * metodo que se encarga eliminar las bebidas cuyas calorias sean iguales o superiores de
	 * las que se pasan por parametro
	 * @param cal, calorias que compararemos para saber si hay que eliminar su bebida
	 * @return la lista de bebidas que hemos eliminado
	 */
	public ArrayList<Drink> removeDrinksByCalories(int cal){ 
		
		ArrayList<Drink> Cal = new ArrayList<Drink>();
		
		for (int i=0; i < listaDrink.size(); i++) {
			if (listaDrink.get(i).getCal() <= cal) {
				Cal.add(listaDrink.get(i));
				//listaDrink.remove(cal);
			}
		}
		
		return Cal;
		
	}
	
	
	
	/**
	 * metodo que devuelve la bebida con mas calorias
	 * @return, una bebida de tipo Drink
	 */
	public Drink mostCaloricDrink() {
		
		//FASE 1:
		
//		
//		Drink nBebida = new Drink("");
//		nBebida.setCal(0);
//		for(Drink maxCaloric: listaDrink) {
//			if (maxCaloric.getCal() > nBebida.getCal()) {
//				nBebida = maxCaloric;
//			}
//		}
//		return nBebida;
		
		
		//FASE 2:
		
		
		double cal = 0;
		Drink bebida = null;
		for(Drink caloric: listaDrink) {
			if (caloric.getCal() > cal) {
				bebida = caloric;
				cal = caloric.getCal();
			}
		}
		
		return bebida;
		
		
		
	}
	
	
	
	/**
	 * metodo que muestra la informacion de todas las bebidas de la lista
	 */
	public void showDrink() {
		
		for (Drink d: listaDrink) {
			System.out.println(d.toString());
		}
		
	}
	
	
	/**
	 * metodo que devuelve la bebida con el mismo nombre que el que se pasa por parametro, 
	 * si no hay ninguno, devuelve null
	 * 
	 * @param name, nombre de la bebida que queremos ver si esta en la lista
	 * @return la bebida a la que pertenece
	 */
	public String obtainDrink(String name) {
		
		for (Drink nom: listaDrink) {
			if (nom.getNombre().equals(name)) {
				
				return nom.toString();
			}
			
		}
		return name;
		
	}
	
	
	

	
	/**
	 * Metodo que ordena el arrayList en funcion de los nombres
	 */
	public void sort() {
		
		Collections.sort(listaDrink);

	}
	
	
	public String sortDrinks() {

		this.sort();
		return this.toString();
		
	}
	
	
	
	
	/**
	 * metodo que devuelve la bebida mas barata de la lista
	 * @return, la bebida mas barata
	 */
	public Drink cheapestDrink() {
		
		double price = 0;
		Drink bebida = null;
		for(Drink cheapest: listaDrink) {
			if (cheapest.getPrecio() > price) {
				bebida = cheapest;
			}
		}
		
		return bebida;
		
		
	}
	
	
	@Override
	public String toString() {
		return listaDrink + "";
	}
	
	
	/**
	 * metodo que devuelve la cerveza mas barata
	 * @return, la cerveza mas barata
	 */
	public Drink cheapestBeer() {
		
	
		ArrayList<Drink> BeerList = new ArrayList<Drink>();
		
		for(Drink d: listaDrink) {
			if (d instanceof Beer) {
				BeerList.add(d);
			}
		}
		
		
		double price = 0;
		Drink bebida = null;
		for(Drink b: BeerList) {
			if (b.getPrecio() > price) {
				bebida = b;
			}
		}
		
		return bebida;
		
		
	}
	
	
	/**
	 * metodo que imprime por pantalla las bebidas que tienen servicio a domicilio (imaginacion)
	 */
	public void tieneEnvio() {
		
		for (Drink e: listaDrink) {
			if (e instanceof Water || e instanceof SoftDrink) {
				System.out.println(e);
			}
		}
		
	}
	
	
	/**
	 * metodo que muestra por pantalla el precio de la bebidas de la lista
	 */
	public void precio() {
		for (Drink d: listaDrink) {
			System.out.println(d.getNombre() + ": " + d.getPrecio());
		}
	}
	
	
	
	//FASE 3
	
	
	
	/**
	 * metodo que devuelve la instancia de la clase Stock instance (singleton)
	 * @return, instance
	 */
	public static Pub getInstance() {
		if (instance == null) {
			instance = new Pub();
		}
		return instance;
		
	}
	
	
	
	/**
	 * metodo que añade un alimento a la lista, siempre que su nombre no coincida con 
	 * ninguno que este ya en la lista
	 * @param comida, alimento que queremos insertar
	 * @throws IllegalArgumentException, excepcion que saltara si su nombre es igual
	 */
	public void addFood(Food comida) throws IllegalArgumentException{
		
		if (!listaFood.contains(comida)) {
			
				listaFood.add(comida);			

		}
		else {
			throw new IllegalArgumentException("Ya existe en la lista un alimento con este nombre");
		}
		
		
		
	}
	
	
	/**
	 * metodo auxiliar para facilitar las pruebas, el cual muestra la informacion de 
	 * todos los alimentos de la lista
	 */
	public void showFood() {
		
		for (Food d: listaFood) {
			System.out.println(d.toString());
		}
		
	}
	
	
	/**
	 * metodo que almacena todas las comidas de lista en un fichero
	 * @param n, fichero en el que queremos almacenar informacion
	 * @throws IOException
	 */
	public void storeFoodInFile(String n) throws IOException, NullPointerException {
		
		FileWriter wr = new FileWriter(n);
		
		for (Food d: listaFood) {
			
			wr.write(d.toString());
			wr.write("\n");
			
		}
	
		wr.close();
		
	}
	
	/**
	 * metodo que lee el contenido del fichero que le pasemos por parametro
	 * @param n, el fichero que queremos leer
	 * @throws NullPointerException
	 * @throws FileNotFoundException
	 */
	public void loadFoodFromFile(String n) throws NullPointerException, FileNotFoundException {
		
		Scanner sc = new Scanner(new FileReader(n));
		
		String s;
		
		while (sc.hasNext()) {
			
			s = sc.nextLine();
			System.out.println(s);
			
		}
		
		sc.close();
		
	}
	
	
	
}
