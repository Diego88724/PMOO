package packfeed;


/**
 * Clase que representa las bebidas del pub
 * @author Diego Fernandez
 *
 */
public abstract class Drink implements Comparable<Drink>{

	
	private String nombre;
	private int cal = 100;	//medido en ml
	private boolean glutenFree;
	private Food[] pairing;
	private final int MAX_NUM = 10;
	private int num;
	
	//FASE 2
	private double precio;
	
	
	
	/**
	 * metodo contructor que construye un objeto de tipo Drink
	 */
	public Drink(String nombre) {
		
		pairing = new Food[MAX_NUM]; //array de 10 elementos de tipo Food
		
		this.nombre = nombre;

	}
	
	
////////////GETTERS Y SETTERS//////////////

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @return the cal
	 */
	public int getCal() {
		return cal;
	}

	/**
	 * @return the glutenFree
	 */
	public boolean isGlutenFree() {
		return glutenFree;
	}

	/**
	 * @return the pairing
	 */
	public Food[] getPairing() {
		return pairing;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @param cal the cal to set
	 */
	public void setCal(int cal) {
		this.cal = cal;
	}

	/**
	 * @param glutenFree the glutenFree to set
	 */
	public void setGlutenFree(boolean glutenFree) {
		this.glutenFree = glutenFree;
	}

	/**
	 * @param pairing the pairing to set
	 */
	public void setPairing(Food[] pairing) {
		this.pairing = pairing;
	}
	
	
	
	/**
	 * @return the precio
	 */
	public double getPrecio() {
		return precio;
	}


	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}


	/**
	 * metodo de equals redefinido para esta clase, el cual sera cierto cuando dos nombres
	 * de bebidas sean iguales
	 */
	public boolean equals(Object obj) {
		
		if (obj == null) return false;
		
		if (this.getClass() != obj.getClass()) return false;
		
		Drink drink = (Drink) obj;
		
		return this.nombre.equals(drink.nombre);
		
		
	}

	
	@Override
	public String toString() {
		return "\nDrink [nombre = " + nombre + ", calorias = " + cal + ", gluten = " + glutenFree + "]";
	}
	
	
	
	///////////////////////////////////////////////////////////////////////

	
	
	
	
	


	/**
	 * metodo que añade al final de la lissta un alimento
	 * @param food, alimento que queremos añadir
	 */
	public void addFood (Food food) {
		
		
		if (num < MAX_NUM) {
			pairing[num] = food;
			num++;
		}
		

	}
	
	/**
	 * metodo que elimina el ultimo alimento de la lista
	 */
	public void removeLastFood() { 

		
		int pos = MAX_NUM;
		
		for (int i=0; i<MAX_NUM; i++) {
			System.out.print("Elemento ("+i+"): "  + pairing[i]);
			System.out.println();
		}

		
		for (int j=pos; j < MAX_NUM-1; j++) {
			pairing[j]= pairing[j+1];
		}
		
		System.out.println("la tabla queda: "); 
		for (int k=0; k<MAX_NUM-1; k++) {
			System.out.println("Elemento ("+k+"): " + pairing[k]);
			
		}
		
		
	}
		
	
	
	/**
	 * metodo que elimina el primer elemento de la lista
	 */
	public void removeFirstFood() {
		
		int pos = 0;
		
		for (int i=0; i<MAX_NUM; i++) {
			System.out.print("Elemento ("+i+"): "  + pairing[i]);
			System.out.println();
		}

		for (int j=pos; j < MAX_NUM-1; j++) {
			pairing[j]= pairing[j+1];
		}
		
		System.out.println("la tabla queda: "); 
		for (int k=0; k<MAX_NUM-1; k++) {
			System.out.println("Elemento ("+k+"): " + pairing[k]);
			
		}
		
		
		
	}
	
	
	/**
	 * metodo que devuelve la longitud de la lista
	 * @return, un entero indicando la longitud de la lista
	 */
	public int howManyPairing() {
		
		return pairing.length;
		
	}
	
	
	/**
	 * metodo que devolvera true si la bebida desde la que se invoca el metodo se combina con
	 * el alimento pasado por parametro
	 * @param f, alimento del que queremos saber si se combina con la bebida
	 * @return, true si se combina, false si no se combina
	 */
	public boolean pairs(Food f) {
		
		if (f.getCal() == this.getCal()) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	
	
	/**
	 * metodo que devuelve en un String los alimentos con los que se combina bien con la bebida
	 */
	public void pairingList() {
		
		
		
		for (int i=0; i < pairing.length; i++) {
			Food f = new Food("");
			if (f.getCal() == this.getCal()) {
				System.out.println(f.toString());
			}
		}
		
		
		
		
		
	}
	
	
	//FASE 2
	
	/**
	 * Metodo que te muestra la diferencia entre el producto en el que se usa el metodo
	 * y el metido por parametro
	 * @param p 
	 * @return la diferencia de ambos
	 */
	public int compareTo (Drink dr) {
		
		return this.nombre.compareTo(dr.nombre);
		
	}
	
	
	
}
