package packMusician;

/**
 * Clase que representa a todos los musicos que tocan algun instrumento
 * @author Diego Fernandez
 *
 */

public class Instrumentalist extends Musician{
	
	
	private String instru;
	
	
	/**
	 * constructora de la clase
	 * @param nombre
	 */
	public Instrumentalist(String nombre, String instru) {
		
		super(nombre);
		this.instru = instru;
	}


	/**
	 * @return the instru
	 */
	private String getInstru() {
		return instru;
	}

	
	
	
	@Override
	public String toString() {
		return super.toString() + " [instrumento =" + instru + "]";
	}


	
	
	
	
	

}
