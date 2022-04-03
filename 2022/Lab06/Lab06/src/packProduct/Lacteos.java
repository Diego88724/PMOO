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
	
	
	
	/**
	 * Metodo que devuelve True si el lote del lacteo igual al pasado por parametro
	 * @param 	lote String
	 * @return	True o False
	 */
	public boolean retirar(String lote) {
		if (this.lote.compareTo(lote) == 0) {
			System.out.println("Producto lacteo. Este lote esta caducado.");
			return true;
		}
		return false;
	}
	

	
	
	
	
	
}
