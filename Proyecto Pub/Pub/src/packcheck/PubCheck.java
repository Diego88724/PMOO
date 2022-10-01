package packcheck;

import packpub.Pub;

import java.io.IOException;

import packfeed.*;

/**
 * Clase para probar el funcionamiento de la clase Pub
 * @author Diego Fernandez
 *
 */
public class PubCheck {

	

	public static void main(String[] args) {
		

		SoftDrink drink1 = new SoftDrink("Coca-Cola", "azucarado", true, 5);
		SoftDrink drink2 = new SoftDrink("Fanta", "zero", true, 5);
		SoftDrink drink3 = new SoftDrink("Pepsi", "zero", true, 5);
		Wine drink4 = new Wine("Vino Blanco", true, false);
		Liqueur drink5 = new Liqueur("Jagger", "", 6);
		DarkLager drink6 = new DarkLager("DarkLager", 3.7, 5.8, "Dinamarca", "Mahou", "botella");
		Pilsener drink7 = new Pilsener("Pilsener", 3.7, 5.8, "Groenlandia", "Voldawn", 5.8);
		Pub pub = Pub.getInstance();
		
		//añadimos 2 bebidas a la lista
		pub.addDrink(drink1);
		pub.addDrink(drink2);
		pub.addDrink(drink3);
		pub.addDrink(drink4);
		pub.addDrink(drink5);
		pub.addDrink(drink6);
		pub.addDrink(drink7);
		//Mostramos la lista de bebidas del pub
		System.out.println("MOSTRAMOS LA INFORMACION DE TODAS LAS BEBIDAS DISPONIBLES: ");
		pub.showDrink();
		System.out.println();
		//las ordenanamos segun el nombre
		System.out.println();
		System.out.println("ORDENAMOS LA LISTA EN FUNCION DEL NOMBRE:");
		System.out.println(pub.sortDrinks());
		System.out.println();
		//Eliminamos una bebida
		System.out.println("ELIMINAMOS LA FANTA:");
		pub.removeDrink(drink2);
		pub.showDrink();
		System.out.println();
		//eliminamos las bebidas cuyas calorias sean superiores a 150
		System.out.println();
		System.out.println("ELIMINAMOS LAS BEBIDAS CON CALORIAS SUPERIORES A 150:");
		System.out.println("PARA ELLO CAMBIAMOS LOS VALORES DE LAS CALORIAS PARA PROBAR SU FUNCIONAMIENTO:");
		System.out.println();
		drink1.setCal(160);
		drink5.setCal(120);
		pub.showDrink();
		System.out.println("Y ELIMINAMOS:");
		System.out.println(pub.removeDrinksByCalories(150));
		System.out.println();
		//informacion de una bebida especifica
		System.out.println("PEDIMOS QUE NOS DEVUELVA LA INFORMACION DE PEPSI: ");
		System.out.println(pub.obtainDrink("Pepsi"));
		System.out.println();
		//bebida con mas calorias
		System.out.println("¿CUAL ES LA BEBIDA CON MAS CALORIAS?: ");
		System.out.println(pub.mostCaloricDrink());
		System.out.println();
		//comprobar el precio de las bebidas
		System.out.println("PRECIO DE LAS BEBIDAS: ");
		System.out.println();
		pub.precio();
		System.out.println();
		//bebida mas barata (metodo imaginacion)
		System.out.println("BEBIDA MAS BARATA: ");
		System.out.println(pub.cheapestDrink());
		System.out.println();
		//cerveza mas barata
		System.out.println("CERVEZA MAS BARATA: ");
		System.out.println(pub.cheapestBeer());
		System.out.println();
		//bebida que tienen envio (metodo imaginacion)
		System.out.println();
		System.out.println("BEBIDAS QUE DISPONEN DE SERVICIO DE ENTREGA A DOMICILIO: ");
		pub.tieneEnvio();
		System.out.println();
		
		//FASE 3
		Food food1 = new Food("Pizza", 999);
		Food food2 = new Food("Burrito", 998);
		Food food3 = new Food("Hamburguesa", 997);
		
		pub.addFood(food1);
		pub.addFood(food2);
		pub.addFood(food3);
		System.out.println("MOSTRAMOS LA INFORMACION DE TODOS LOS ALIMENTOS DISPONIBLES: ");
		pub.showFood();
		System.out.println();
		System.out.println("GUARDAMOS TODAS LAS COMIDAS EN UN FICHERO");
		try {
			
			String n = "./data/FicheroComidas.txt";
			pub.storeFoodInFile(n);
			System.out.println("DEVOLVEMOS EL CONTENIDO DEL FICHERO:\n");
			pub.loadFoodFromFile(n);
			
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		
		}catch (NullPointerException e) {
			
			e.printStackTrace();
			
		}
		
		System.out.println();
		

	}

}
