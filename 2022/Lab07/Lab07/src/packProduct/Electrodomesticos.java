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
	
	
	
	
	
	public boolean isFragile() {
		return false;
	}
	
	
	public double Weight() {
		return getWeight();
	}
	
	public double shippingFee() {
		if (this.getWeight() > 20) {
			return 0.37 + (this.getWeight()-20)*0.01;
		}
		else {
			return 0.37;
		}
	}
	
	
}

