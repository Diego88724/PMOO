package packMusician;

/**
 * Clase que representa a los trompetistas de la orquesta
 * @author Diego Fernandez
 *
 */
public class Trumpeter extends Instrumentalist {

	
	public Trumpeter(String nombre) {
		
		super(nombre, "Trompeta");
		
		setSalario(getSalario() + 100 );
		
	}
	
	
	/**
	 * metodo que devuelve el sonido que hacen los trompetistas
	 */
	public String perform() {
		
		return "Tu-ru-ru-tu-ru-ru";
	}
	
	
	
	
	
	
}

