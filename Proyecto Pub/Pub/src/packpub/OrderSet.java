package packpub;

import java.util.ArrayList;

import javax.management.InstanceAlreadyExistsException;

/**
 * Clase para la gestion de los pedidos
 * @author Diego Fernandez
 *
 */
public class OrderSet {
	
	//private final int bolsa =9;
	private ArrayList<Order> orderList;
	private static OrderSet instance;
	
	
	private OrderSet() {
		
		orderList = new ArrayList<Order>();
		
	}
	
	
	
	public static OrderSet getInstance() {
		if (instance == null) {
			instance = new OrderSet();
		}
		return instance;
	}
	
	
	/**
	 * metodo que añade un elemento al final de la lista
	 * @param id, pedido que queremos insertar en la lista
	 * @throws InstanceAlreadyExistsException 
	 */
	public void addOrder(Order id) throws InstanceAlreadyExistsException {
		
		if (orderList.contains(id)) {
			throw new InstanceAlreadyExistsException("Este producto ya esta en la lista");
		}
		else {
			orderList.add(id);
		}
		
	}
	
	
	/**
	 * metodo auxiliar para poder visulizar el contenido de la lista
	 */
	public void showOrder() {
		
		for (Order d: orderList) {
			System.out.println(d.toString());
		}
		
	}
	
	
	
	/**
	 * metodo auxiliar que devuelve la posicion de una id
	 * @param id, el codigo del prodcuto a comprobar
	 * @return entero que representa la posicion
	 */
	public int obtainPos(int id) {
		
		for (Order p: orderList) {
			if (p.getId() == id) {
				return orderList.indexOf(p);
			}
		}
		return -1;
		
	}
	
	
	
	/**
	 * metodo que elimina un producto de la lista dado un codigo de un producto y lo
	 * devuelve
	 * @param id
	 * @throws UnknownCodeException 
	 */
	public void obtainAndRemoveFirstOrder(int id) {
		
		int nombre = 0;
		
		
		for (Order p: orderList) {
			if (p.getId() == id) {
				nombre = p.getId();
			}
		}
		
		if (this.obtainPos(id) == -1) {
			System.out.println("Error, no se ha detectado ningun producto con ese codigo");
		}
		else {
			orderList.remove(this.obtainPos(id));
			System.out.println("Se ha eliminado el pedido: " + nombre);
		}
		
	}
	
	
	
	/**
	 * metodo que vacia la lista de pedidos (imaginacion)
	 */
	public void resetOrder() {
		
		orderList.clear();
		
	}
	

}
