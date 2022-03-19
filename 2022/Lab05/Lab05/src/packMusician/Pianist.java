package packMusician;

/**
 * Clase que representa a los pianistas de la orquesta
 * @author Diego Fernandez
 *
 */
public class Pianist extends Instrumentalist{

	
	public Pianist(String nombre) {
		
		super(nombre, "piano");
		setSalario(getSalario() + 1000);
	}
	
	
	
	/**
	 * metodo que devuelve el sonido que hacen los pianistas
	 */
	public String perform() {
		
		return "Ding-ting-dang-ding-tang-ting";
	}
	
}
