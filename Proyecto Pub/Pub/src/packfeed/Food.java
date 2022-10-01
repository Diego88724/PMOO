package packfeed;

import java.util.Scanner;

/**
 * clase que representa cada alimento del pub
 * @author Diego Fernandez
 *
 */
public class Food {
	
	private final String nombre;
	private String desc;
	private double cal;
	
	
	/**
	 * primera constructora de la clase pasandole dos parametros
	 * @param nombre, nombre de la comida
	 * @param cal, numero de calorias de la misma
	 */
	public Food(String nombre, double cal) {
		this.nombre = nombre;
		this.cal = cal;
	}
	
	
	
	/**
	 * segudna constructora de la clase pasandole un parametro
	 * @param nombre, nombre de la comida
	 */
	public Food(String nombre) {
		this.nombre = nombre;
		cal = 50; 
	}


///////////////GETTERS Y SETTERS//////////////

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}




	/**
	 * @return the cal
	 */
	public double getCal() {
		return cal;
	}



	/**
	 * @param cal the cal to set
	 */
	public void setCal(double cal) throws IllegalArgumentException{
		
		if (cal < 0) {
			throw new IllegalArgumentException("No puede haber valores negativos");
		}
		
		this.cal = cal;
	}
	
	
	
	/**
	 * metodo de equals redefinido para esta clase, el cual sera cierto cuando dos nombres
	 * de alimentos sean iguales
	 */
	public boolean equals(Object obj) {
		
		if (obj == null) return false;
		
		if (this.getClass() != obj.getClass()) return false;
		
		Food food = (Food) obj;
		
		return this.nombre.equals(food.nombre);
		
		
	}
	
	/**
	 * Deberá devolver un String con el nombre del alimento y sus calorias
	 */
	public String toString() {
		return "Food [Nombre: " + nombre + " | Calorias: " + cal + "]";
	}
	
	
	
	
	public double tiempoEnvio() {
		
		Scanner sc = new Scanner(System.in);
		
		double km;
		double tiempo=0.0;
		
		km= sc.nextDouble();
		
		for (int i=0; i<= km; i++) {
			tiempo = 3*i;
		}
		
		sc.close();
		
		return tiempo+10.0;
		
	}
	
	

}

	
