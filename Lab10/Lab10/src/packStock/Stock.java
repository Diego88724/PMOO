package packStock;

import packProduct.*;


import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Iterator;

import javax.management.InstanceAlreadyExistsException;
import javax.management.InvalidAttributeValueException;

import packException.UnknownCodeException;	

/**
 * Clase que representa el stock de los productos de la tienda
 * @author Diego Fernandez
 *
 */
public class Stock {
	
	
	private ArrayList<Product> productList;
	
	private static Stock instance;
	
	
	
	
	private Stock() {
		
		productList = new ArrayList<Product>();
		
	}
	
	
	/**
	 * @return the productList
	 */
	public ArrayList<Product> getProductList() {
		return productList;
	}

	
	/**
	 * metodo que dado un producto lo añade a la lista
	 * @param prod, proucto a añadir
	 */
	public void addProduct(Product prod) throws InstanceAlreadyExistsException {
		
		if (productList.contains(prod)) {
			throw new InstanceAlreadyExistsException("Este producto ya esta en la lista");
		}
		else {
			productList.add(prod);
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
	 * @throws UnknownCodeException 
	 */
	public void removeProduct(int id) throws UnknownCodeException {
		
		String nombre = "";
		
		
		for (Product p: productList) {
			if (p.getId() == id) {
				nombre = p.getName();
				//productList.remove(p);
			}
		}
		
		if (this.obtainPos(id) == -1) {
			//System.out.println("Error, no se ha detectado ningun producto con ese codigo");
			throw new UnknownCodeException("Error, no se ha detectado ningun producto con ese codigo");
		}
		else {
			productList.remove(this.obtainPos(id));
			System.out.println("Se ha eliminado el producto: " + nombre);
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
			
		}
		return cont;
	}
	
	
	
	
	
	

	@Override
	public String toString() {
		return "Stock :\n" + productList;
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
	
	
	/**
	 * metodo que devuelve la instancia de la clase Stock instance (singleton)
	 * @return, instance
	 */
	public static Stock getInstance() {
		if (instance == null) {
			instance = new Stock();
		}
		return instance;
		
	}
	
	
	/**
	 * metodo que dado un codigo devuelve el producto del stock que tiene dicho codigo
	 * @param id, codigo del producto que queremos saber su producto
	 * @return, el producto del id
	 */
	public Product obtainProduct(int id) {
		
//		int index = productList.indexOf(id);
//		Product res = null;
//		
//		if (index != -1) {
//			res =  productList.get(index);
//		}
//		
//		return res; 
		
		
		int i=0;
		while(i < productList.size() && productList.get(i).getId() != id) {
			i++;
		}
		if(i<productList.size()) {
			System.out.println("ID del producto: "+id+", encontrado.");
			return productList.get(i);
		}else {
			//return null;
			throw new InputMismatchException("ID del producto: "+id+", no encontrado.");
		}
				
		
	}
	
	
	
	/**
	 * metodo que dado un producto, devuelve true si dicho producto esta en stock
	 * @param p, producto que queremos saber si esta en stock
	 * @return true si esta, false si no
	 */
	public boolean containsProduct(Product p) {
		
		return productList.contains(p);
		
	}
	
	
	
	/**
	 * metodo que devuelve un arraylist de codigos de producto con una cantidad de unidades
	 * inferior al numero recibido por parametro
	 * @param n
	 * @return
	 */
	public ArrayList<Product> obtainProductListToOrder(int n) {
		
		ArrayList<Product> order = new ArrayList<Product>();
		
		for (Product p: productList) {
			if (p.getAmount() < n) {
				order.add(p);
			}
		}
		
		return order;
	}
	
	
	
	
	/**
	 * metodo que elimina del stock los productos con 0 unidades
	 */
	public void removeAllProductsWith0Units() {	
		
		Iterator<Product> it = productList.iterator();
		
		while (it.hasNext()) {
			Product p = it.next();
			if (p.getAmount() == 0) {
				it.remove();
			}
		}
		
	}
	
	
	
	/**
	 * metodo que dado un motivo de retirada, elimina los productos que cumplan dicha condicion
	 * y devolvera una lista de todos los productos eliminados
	 * @param motivo, motivo de retirada
	 * @return lista de los productos eliminados
	 */
	public ArrayList<Product> removeProduct(String motivo) {
		
		ArrayList<Product> elim = new ArrayList<Product>();
		
		for(Product p: productList) {
			if (p.getName().equals(motivo)) {
				productList.remove(p.getId());
				elim.add(p);
			}
		}
		
		return elim;
		
		
	}
	
	
	/**
	 * metodo que dado el codigo del producto y la cantidad, actualiza la cantidad del producto
	 * con dicho id
	 * @param id, codigo del producto
	 * @param amount, cantidad del producto
	 * @throws InvalidAttributeValueException 
	 */
	public void updateAmount(int id, int amount) throws InvalidAttributeValueException, UnknownCodeException {
		
		for (Product p: productList) {
			if(p.getId() == id) {
				try {
					p.setAmount(amount);
					p.toString();
				} catch (InvalidAttributeValueException e) {
					e.printStackTrace();
				}
				
				
				
			}
			
			//MAL
//			else {
//				throw new InvalidAttributeValueException("No existe producto con esa ID");
//				
//			}
		}
		

		
	}
	
	
	
	
	
	
	
}

