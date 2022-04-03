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
	
//	
//	public boolean takeProductOff(String motivo) {
//		if (fecha.compareToIgnoreCase(motivo) <= 0) {
//			return true;
//		}
//		else {
//			return false;
//		}
//	}
	
	
	
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

	
	
}
