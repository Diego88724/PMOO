package packSuper;

import packStock.*;
import packProduct.*;


/**
 * Clase que gestiona todo el supermercado
 * @author Diego Fernandez
 *
 */
public class SuperOnline {

	public static void main(String[] args) {
		
		
		Stock ins = new Stock();
		
	//Productos Perecederos:
		//Product p1 = new Product(98765, "banana", 4.6, 5, 3.2);	MAL
		Frutas f = new Frutas(65432, "banana", 4.6, 5, 3.2, "2/6/2022", "super");
		Lacteos l = new Lacteos(98765, "yogurt", 5.6, 2, 3.3, "4/5/2022", "9999");
		Bebidas b = new Bebidas(8743, "Jagger", 3.4, 2, 14.95, "toda la noche guarra", 35);
	//Productos No Perecederos:
		Limpieza limp = new Limpieza(65432, "aspiradora", 4.5, 1, 43.5, "M");
		Electrodomesticos elec = new Electrodomesticos(699432, "Lavadora", 4.5, 1, 63.5);
		
		//Los añadimos a la lista de stock
		
		ins.addProduct(f);
		ins.addProduct(l);
		ins.addProduct(b);
		ins.addProduct(limp);
		ins.addProduct(elec);
		
		
		System.out.println(ins.printPerishable());
		System.out.println();
		System.out.println(ins.ordered());
		System.out.println();
		
		
		System.out.println("Hay que retirar el lote 9999, esta en tienda? " + ins.itemsToRemove("9999"));
		System.out.println();
		System.out.println("Eliminamos el lote 9999, que tiene codigo 98765."); 
		ins.removeProduct(98765);
		System.out.println("Seguimos teniendo que retirar el lote 9999? " + ins.itemsToRemove("9999"));
		System.out.println();
		System.out.println("Es 30/03/22, hay productos caducados? " + ins.itemsToRemove("30/03/22") + "\n");
		System.out.println();
		System.out.println("Los lavavajillas estan descatalogados. Hay que retirar lavavajillas? " + ins.itemsToRemove("Dishwasher") + "\n");
		System.out.println();
		System.out.println("Los productos de limpieza de categoria M estan retirados? " + ins.itemsToRemove("M"));
		
		
	}	//MAIN
	
	
	
}
