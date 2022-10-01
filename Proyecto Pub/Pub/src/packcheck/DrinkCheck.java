package packcheck;

import packfeed.*;

public class DrinkCheck {

	public static void main(String[] args) {
		//TODO utiliza los distintos constructores
		System.out.println("PRUEBA DE CAMBIAR EL NOMBRE CON EL SETTER: ");
		SoftDrink drink1 = new SoftDrink("Coca-Cola", "", true, 5);
		//TODO probar getter y setter 
		System.out.println(drink1.getNombre());
		drink1.setNombre("Fanta");
		System.out.println(drink1.getNombre());
		System.out.println();
		//TODO probar el método toString 
		System.out.println();
		System.out.println("MOSTRAMOS LA BEBIDA POR PANTALLA: ");
		System.out.println(drink1.toString());
		System.out.println();
		
		
		//TODO prueba el método addFood
		System.out.println();
		System.out.println("AÑADIMOS UN ELEMENTO A LA LISTA: ");
		Food drink2 = new Food("Solomillo");
		drink1.addFood(drink2);
		System.out.println();
		//comprueba que se añade bien un alimento
		System.out.println(drink2.toString());
		System.out.println();
		//TODO prueba el método howManyPairs 
		System.out.println();
		System.out.println("En la lista tenemos un maximo de " + drink1.howManyPairing() + " elementos");
		System.out.println();
		//TODO comprueba el método pairingList
		System.out.println();
		System.out.println("LISTA DE LOS ALIMENTOS CON LOS QUE SE COMBINAN CON FANTA:");
		drink1.pairingList();
		//TODO borra el último alimento de la lista
		System.out.println();
		System.out.println("BORRAMOS EL ULTIMO ELEMENTO:");
		System.out.println();
		drink1.removeLastFood();
		//TODO borra el primer alimento de la lista
		System.out.println();
		System.out.println("BORRAMOS EL PRIMER ELEMENTO:");
		System.out.println();
		drink1.removeFirstFood();
		//TODO prueba el método pairs
		System.out.println();
		System.out.println("¿El/La " + drink1.getNombre() + " se combina con " + drink2.getNombre() + " ?: " + drink1.pairs(drink2));
		System.out.println();
		
		
		
		
		
	}

}
