package packMusician;


/**
 * Clase que representa al director de la orquesta
 * @author Diego Fernandez
 *
 */
public class Director extends Musician {
	
	
	private int años;

	
	
	/**
	 * constructora de la clase
	 * @param nombre
	 * @param años
	 */
	public Director(String nombre, int años) {
		super(nombre);
		this.años=años;
		setSalario(getSalario() + 900);
	}
	


	/**
	 * @return the años
	 */
	private int getAños() {
		return años;
	}



	/**
	 * @param años the años to set
	 */
	private void setAños(int años) {
		this.años = años;
		
		
	}



	/**
	 * metodo que devuelve la actuacion del director
	 * @return
	 */
	public String perform() {
		return "Tok tok tok: (silence)";
	}
	
	
	
	@Override
	public String toString() {
		return super.toString() + ",[años de antigüedad=" + años + "]";
	}

	
}	
