package packMusician;


/**
 * Clase que representa a los musicos de la orquesta
 * @author Diego Fernandez
 *
 */
public abstract class Musician {

	
	private String nombre;
	
	private int salario;
	
	private boolean contra;
	
	
	
	/**
	 * constructora de la clase que le pasa el nombre como parametro
	 * @param nombre, nombre del que le pasa como parametro
	 */
	public Musician(String nombre) {
		
		this.nombre=nombre;
		salario = 500;
		contra = false;
		
	}



	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}



	/**
	 * @return the salario
	 */
	public int getSalario() {
		return salario;
	}



	/**
	 * @return the contra
	 */
	public boolean isContra() {
		return contra;
	}



	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	/**
	 * @param salario the salario to set
	 */
	public void setSalario(int salario) {
		this.salario = salario;
	}

	
	/**
	 * metodo que realiza el proceso de contratacion de un musico
	 * @return si no esta contratado, lo contrata(true), y si ya lo estaba (false)
	 */
	public void hire() {
		
		if (contra == false) {
			contra = true;
		}
		else {
			contra = false;
		}
	}
	
	
	
	
	/**
	 * metodo que representa la actuacion de un musico
	 * @return, devuelve "ssss" es decir que esta en silencio
	 */
	public String perform() {
		return "sssssss";
	}
	
	
	
	/**
	 * metodo equals que compara dos elementos y devuelve true si son iguales
	 * y false en caso contrario
	 */
	public boolean equals(Object obj) {
		
		Musician musc = (Musician) obj;
		
		return musc.nombre.equals(nombre);
		
		
	}



	@Override
	public String toString() {
		return "Musician [nombre=" + nombre + ", salario=" + salario + ", contratado=" + contra + "]";
	}
	
	
	
	
	
	
}
