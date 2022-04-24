package packMusician;


/**
 * Clase que representa al director de la orquesta
 * @author Diego Fernandez
 *
 */
public class Director extends Musician {
	
	
	private int a�os;

	
	
	/**
	 * constructora de la clase
	 * @param nombre
	 * @param a�os
	 */
	public Director(String nombre, int a�os) {
		super(nombre);
		this.a�os=a�os;
		setSalario(getSalario() + 900);
	}
	


	/**
	 * @return the a�os
	 */
	private int getA�os() {
		return a�os;
	}



	/**
	 * @param a�os the a�os to set
	 */
	private void setA�os(int a�os) {
		this.a�os = a�os;
		
		
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
		return super.toString() + ",[a�os de antig�edad=" + a�os + "]";
	}

	
}	
