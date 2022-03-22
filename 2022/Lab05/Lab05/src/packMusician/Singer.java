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
		super.setSalario(super.getSalario()+200);
	}
	
	
	
	
	
	

}
