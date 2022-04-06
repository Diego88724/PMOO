package packProduct;


/**
 * Clase que representa los productos perecederos de la clase Product
 * @author Diego Fernandez
 *
 */
public abstract class Perecederos extends Product{

	
	private String fecha;
	
	public Perecederos(int id, String name, double weight, int amount, double price, String fecha) {
		
		super(id, name, weight, amount, price);
		this.fecha = fecha;
		
	}
	
	
	/**
	 * @return the fecha
	 */
	public String getFecha() {
		return fecha;
	}

	
	/**
	 * Metodo que devuelve True o False comparando la fecha de caducidad del producto 
	 * a la metida por paramtero
	 * @param fecha
	 * @return True or False 
	 */
	public boolean retirar(String fecha) {
		if (this.getFecha().compareTo(fecha) < 0) {
			System.out.println("Hay un producto perecedero caducado por fecha.");
			return true;
		}
		return false;
	}
	
	
	
	@Override
	public String toString() {
		return super.toString() + " [fecha=" + fecha + "]";
	}


	public double Weight() {
		return getWeight();
	}


	
	
	/**
	 * Los costes de envio del los productos perecederos, 0.25
	 * @param 0.25
	 */
	public double shippingFee() {
		return 0.25;
	}
	

	
}
