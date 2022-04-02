package packProduct;


/**
 * Clase que representa los productos no perecederos de la clase Product
 * @author Diego Fernandez
 *
 */
public abstract class NoPerecederos extends Product{

	
	
	public NoPerecederos(int id, String name, double weight, int amount, double price) {
		
		super(id, name, weight, amount, price);

	}
	
	public abstract boolean retirar(String criterio);
	
}
