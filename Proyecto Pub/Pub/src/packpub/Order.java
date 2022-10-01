package packpub;

import java.util.ArrayList;

/**
 * Clase para la creacion de los pedidos
 * @author Diego Fernandez
 *
 */
public class Order {
	
	private int id;
	private ArrayList<Order> enviablesList;
	
	
	public Order(int id) {
		
		this.id=id;
		enviablesList = new ArrayList<Order>();
		
	}


	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}


	@Override
	public String toString() {
		return "Order [id=" + id + ", enviablesList=" + enviablesList + "]";
	}
	
	

}
