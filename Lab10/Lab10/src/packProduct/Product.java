package packProduct;

import javax.management.InvalidAttributeValueException;

/**
 * Clase que representa los productos de la tienda
 * @author Diego Fernandez
 *
 */
public abstract class Product implements Comparable<Product>{


	private int id;
	private String name;
	private double weight;
	private int amount;
	private double price;
	private final double IVA;
	
	
	/**
	 * Constructora de la clase que inicializa los atributos
	 * @param id, codigo del producto
	 * @param name, nombre del producto
	 * @param height, peso del producto
	 * @param cont, cantidad de productos
	 * @param price, precio del producto
	 */
	public Product(int id, String name, double weight, int amount, double price, double IVA) {
		this.id = id;
		this.name = name;
		this.weight = weight;
		this.amount = amount;
		this.price = price;
		this.IVA = IVA;
		
	}
	
	/**
	 * Constructora de productos: un par�metro por cada atributo, excepto IVA. 
	 * Con caracter general, el IVA sera de 0.21
	 * @param code		codigo
	 * @param name		nombre
	 * @param weigth	peso
	 * @param quantity	cantidad
	 * @param price		precio
	 */
	public Product(int id, String name, double weight, int amount, double price) {
		this.id = id;
		this.name = name;
		this.weight = weight;
		this.amount = amount;
		this.price = price;
		IVA=0.21;
	}
	
	
	
	
	
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @return the weight
	 */
	public double getWeight() {
		return weight;
	}


	/**
	 * @return the amount
	 */
	public int getAmount() {
		return amount;
	}


	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}


	/**
	 * @return the iVA
	 */
	public double getIVA() {
		return IVA;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @param weight the weight to set
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}


	/**
	 * amount the amount to set
	 * @param amount, cantidad del producto
	 * @throws InvalidAttributeValueException, 
	 */
	public void setAmount(int amount) throws InvalidAttributeValueException {
		if (amount < 0) {
			throw new InvalidAttributeValueException("Cantidad no valida");
			
		}
		else {
			this.amount = amount;
		}
		
	}


	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	
	
	/**
	 * metodo que calcula el precio con el IVA incluido
	 * @return
	 */
	public double priceWithIVA() {
		
		return price*(IVA+1);
		
	}


	/**
	 * metodo que obtiene todas las carateristicas de los productos en forma de String
	 */
	@Override
	public String toString() {
		return "Producto [id =" + id + ", nombre =" + name + ", peso =" + weight + 
				", cantidad =" + amount + ", precio =" + price + ", IVA =" + IVA + "]";
	}
	
	
	
	/**
	 * metodo que decide si el producto se retira o no
	 * @param motivo, motivo por el que se retira el producto
	 * @return, si cumple con los motivo devolver� true, si no false
	 */
	public abstract boolean retirar(String motivo);
	
	
	
	
	
	/**
	 * M�todo que devolver� si el objeto que invoca el m�todo es o no m�s barato 
	 * que el producto que se pasa por par�metro (sin IVA).
	 * @param p producto a comparar
	 * @return TRUE o FALSE (si es mas barato o no)
	 */
	public boolean isCheaper(Product prod) {
		return this.price < prod.price;
	}
	
	
	
	
	/**
	 * Metodo que te muestra la diferencia entre el producto en el que se usa el metodo
	 * y el metido por parametro
	 * @param p 
	 * @return la diferencia de ambos
	 */
	public int compareTo (Product prod) {
		if (this.id < prod.id) {
			return -1;
		}
		else {
			if (this.id == prod.id) {
				return 1;
			}
			else {
				return 0;
			}
		}
	}
	
	
	
	
	
	

}
