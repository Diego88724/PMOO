package packProduct;


/**
 * Clase que representa los productos de limpieza de la clase NoPerecederos
 * @author Diego Fernandez
 *
 */
public class Limpieza extends NoPerecederos{

	
	private String cate;
	
	
	public Limpieza(int id, String name, double weight, int amount, double price, String cate) {
		
		super(id, name, weight, amount, price);
		this.cate = cate;
	}
	
	
	
	
	public boolean takeProductOff(String reason) {
		if (cate.equals(reason)) {
			return true;
		}
		else {
			return false;
		}
	}

	
	



/**
	 * @return the cate
	 */
	public String getCate() {
		return cate;
	}





public boolean retirar(String category) {
		
		if (this.getCate().equals(category)) {
			System.out.println("Se retira producto de limpieza por categoria");
			return true;
		}
		
		return false;
	}
	
	
	
	
	
}
