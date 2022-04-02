package packProduct;



/**
 * Clase que representa los electrodomesticos de la clase NoPerecederos
 * @author Diego Fernandez
 *
 */
public class Electrodomesticos extends NoPerecederos{

	
	
public Electrodomesticos(int id, String name, double weight, int amount, double price) {
		
		super(id, name, weight, amount, price);
	}
	


	public boolean takeProductOff(String reason) {
		if (getName().compareToIgnoreCase(reason) <= 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	
	/**
	 * Los electrodomesticos se retiran segun nombre
	 */
	public boolean retirar(String name) {
		if (this.getName().equals(name)) {
			System.out.println("Descatalogado " + name);
			return true;
		}
		return false;
	}
	
}
