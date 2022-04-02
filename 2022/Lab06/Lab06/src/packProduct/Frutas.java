package packProduct;


/**
 * Clase que representa las frutas de la clase Perecederos
 * @author Diego Fernandez
 *
 */
public class Frutas extends Perecederos{

	
	private String origen;
	
	public Frutas(int id, String name, double weight, int amount, double price, String fecha, String origen) {
		
		super(id, name, weight, amount, price, 0.04, fecha);
		this.origen = origen;
	}
	
		
	/**
	 * @return the origen
	 */
	public String getOrigen() {
		return origen;
	}


	/**
	 * @param origen the origen to set
	 */
	public void setOrigen(String origen) {
		this.origen = origen;
	}




	@Override
	public String toString() {
		return super.toString() + ", origen =" + origen + "]";
	}


	
	
	
	
	
}
