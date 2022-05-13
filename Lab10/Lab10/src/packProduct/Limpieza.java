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
	
	
	/**
	 * @return the cate
	 */
	public String getCate() {
		return cate;
	}
	
	
	public boolean retirar(String cate) {
		
			if (this.getCate().equals(cate)) {
				System.out.println("Se retira producto de limpieza por categoria");
				return true;
			}
		
			return false;
	}




	@Override
	public String toString() {
		return super.toString() + "[categoria =" + cate + "]\n";
	}
	
	
	
	
	
}
