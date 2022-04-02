package packProduct;


/**
 * Clase que representa los productos lacteos de la clase Perecederos
 * @author Diego Fernandez
 *
 */
public class Lacteos extends Perecederos {

	
	private String lote;
	
	public Lacteos(int id, String name, double weight, int amount, double price, String fecha, String lote) {
		
		super(id, name, weight, amount, price, 0.1, fecha);
		this.lote = lote;
	}

	/**
	 * @return the lote
	 */
	public String getLote() {
		return lote;
	}

	/**
	 * @param lote the lote to set
	 */
	public void setLote(String lote) {
		this.lote = lote;
	}
	
	public String toString() {
		return super.toString() + ", [lote = " + lote + "]";
	}
	
	
	
	
	
	public boolean takeProductOff (String reason) {
		return lote.equalsIgnoreCase(reason);
	}
	
	
	public double shippingFee() {
		return super.shippingFee() + 1.03;
	}
	
	
	
	
	
	
	
}
