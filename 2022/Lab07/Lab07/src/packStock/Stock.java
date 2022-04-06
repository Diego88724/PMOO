package packStock;

import packProduct.*;
//import java.util.*;

import java.util.ArrayList;
import java.util.Collections;
	

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
	 * metodo que dado un producto lo añade a la lista
	 * @param prod, proucto a añadir
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
	 * @param id, el codigo del prodcuto a comprobar
	 * @return entero que representa la posicion
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

	
	
	public int quantityType(Product tipo) {	
		int cont = 0;
		for (Product prod: productList) {
			if (prod.getClass().getSimpleName().equals(tipo)) {
				cont++;
			}
			//if (prod.equals(tipo)) ¿?

		}
		return cont;
	}
	
	
	
	
	
	

	@Override
	public String toString() {
		return "Stock :" + productList + "]";
	}
	
	
	
	
	
	/**
	 * metodo que de dado un motivo debe de decidir si se puede eliminar de la lista
	 * @param motivo, motivo para su eliminación
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
	
	
	
	/**
	 * Metodo que ordena de manera ascendente el arrayList
	 */
	public void sort() {
		Collections.sort(productList);
	}
	
	
	
	
	/**
	 * metodo que devuelve los productos perecederos
	 */
	public String printPerishable() {	
		
		//VOID
//		for (Product pere: productList) {
//			if (pere.getClass().getSimpleName().equals("Perecederos")) {
//				System.out.println(pere.toString());
//			}
//		}
		
		String perishable = "";

		
		for (Product p: productList) {
			if(p instanceof Perecederos) {
				perishable += "\n" + "- " + p.getName();
			}

		}
		
		return "Son productos perecederos: " + perishable;
		
	}
	
	
	/**
	 * metodo que muestra por pantalla los productos que se pueden enviar junto con
	 * su precio y su coste de envio
	 */
	public void printShippable() {
		
		for (Product prod : productList) {
			if (prod instanceof IShipped) {
				System.out.println( prod.priceWithIVA() );
			}
		}				//prod.priceWithIVA() + ((IShipped) prod).shippingFee())
		
		
		
//		String shippable = "";
//		for (Product p: productList) {
//			if (p instanceof IShipped)	{
//				shippable += "\n" + p.getName() + "   Costs: " + p.getPrice() + "   ShippingFee: " + ((IShipped) p).shippingFee();
//			}
//		}
//		return "Se pueden enviar: " + shippable;
		
		
		
	}
	
	
	
	
	
	
	/**
	 * Metodo que ordena y devuelve un String con la lista de productos
	 * @return string
	 */
	//CLASE DE SUPERONLINE
	public String ordered() {

		this.sort();
		return this.toString();
		
	}
	
	
	
}
