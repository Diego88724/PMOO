package packMusician;

/**
 * Clase que representa a los cantantes de la orquesta
 * @author Diego Fernandez
 *
 */
public class Singer extends Musician{
	
	
	/**
	 * constructora de la clase
	 * @param name
	 */
	public Singer(String nombre) {
		
		super(nombre);
		
	}
	
	/**
	 * método que obtiene el salario de cantante
	 */
	public int getSalary() {
		return(super.getSalario()+200);
	}
	
	
	
	

}
