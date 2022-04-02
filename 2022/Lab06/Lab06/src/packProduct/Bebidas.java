package packProduct;



/**
 * Clase que representa las bebidas de la clase Perecederos
 * @author Diego Fernandez
 *
 */
public class Bebidas extends Perecederos{
	
	
	private String gradu;
	
	public Bebidas(int id, String name, double weight, int amount, double price, String fecha, String gradu) {
		
		super(id, name, weight, amount, price,0.1, fecha);
		this.gradu = gradu;
	}

	/**
	 * @return the gradu
	 */
	public String getGradu() {
		return gradu;
	}

	/**
	 * @param gradu the gradu to set
	 */
	public void setGradu(String gradu) {
		this.gradu = gradu;
	}
	
	
	public String toString() {
		return super.toString() + ", [graduacion = " + gradu + "]";
	}
	
	public double shippingFee() {
		return super.shippingFee() + 1.03;
	}

	
	
	
	
	

}
