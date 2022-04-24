package packStock;

import packProduct.Product;
import java.util.ArrayList;


/**
 * Clase que representa el stock de los productos de la tienda
 * @author Diego Fernandez
 *
 */
public class Stock {
	
	
	private ArrayList<Product> productList;
	
	public Stock() {
		
		productList = new ArrayList<Product>();
		
	}

	
	/**
	 * metodo que dado un producto lo a�ade a la lista
	 * @param prod, proucto a a�adir
	 */
	public boolean addProduct(Product prod) {
		
		if (productList.contains(prod)) {
			return false;
		}
		else {
			productList.add(prod);
			return true;
		}
		
		

	}
	
	
	/**
	 * metodo que devuelve la posicion de un producto
	 * @param id, el codigo del producto a comprobar
	 * @return
	 */
	public int obtainPos(int id) {
		
		for (Product p: productList) {
			if (p.getId() == id) {
				return productList.indexOf(p);
			}
		}
		return -1;
		
	}
	
	
	/**
	 * metodo que elimina un producto de la lista dado un codigo de un producto
	 * @param id
	 */
	public void removeProduct(int id) {
		
		
		if (this.obtainPos(id) == -1) {
			System.out.println("Error, no se ha detectado ningun producto con ese codigo");
		}
		else {
			productList.remove(this.obtainPos(id));
		}
		
	}
	
	
	/**
	 * metodo que devuelve la cantidad de producto diferentes en stock
	 * @return, el numero de elementos
	 */
	public int productQuantity() {
		
		int size = productList.size();
		return size;
		
	}

	
	/**
	 * Metodo que devuelve la cantidad de productos diferentes del tipo de producto pasado 
	 * por parametro
	 * @param tipo
	 * @return
	 */
	public int quantityType(Product tipo) {	
		int cont = 0;
		for (Product prod: productList) {
			if (prod.getClass().getSimpleName().equals(tipo)) {
				cont++;
			}
			

		}
		return cont;
	}
	
	
	
	
	
	

	@Override
	public String toString() {
		return "Stock [productList=" + productList + "]";
	}
	
	
	
	
	
	/**
	 * metodo que de dado un motivo debe de decidir si se puede eliminar de la lista
	 * @param motivo, motivo para su eliminaci�n
	 * @return, true si se elimina, false en caso contrario
	 */
	public boolean itemsToRemove(String motivo) {
		
		for (Product p: productList) {
			if (p.retirar(motivo)) {
				return true;
			}
		}
		return false;
		
		
	}
	
	
	
	
	
	
	
	
}
