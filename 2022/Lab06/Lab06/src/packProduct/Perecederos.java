package packProduct;


/**
 * Clase que representa los productos perecederos de la clase Product
 * @author Diego Fernandez
 *
 */
public abstract class Perecederos extends Product{

	
	private String fecha;
	
	public Perecederos(int id, String name, double weight, int amount, double price, double IVA, String fecha) {
		
		super(id, name, weight, amount, price, IVA);
		this.fecha = fecha;
		
	}
	
	
	
	
	public double shippingFee() {
		return 0.25;
	}
	
	
	
	public boolean takeProductOff(String reason) {
		if (fecha.compareToIgnoreCase(reason) <= 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	
	/**
	 * @return the fecha
	 */
	public String getFecha() {
		return fecha;
	}





	public boolean retirar(String date) {
		if (this.getFecha().compareTo(date) < 0) {
			System.out.println("Hay un producto perecedero caducado por fecha.");
			return true;
		}
		return false;
	}

	
	
}
