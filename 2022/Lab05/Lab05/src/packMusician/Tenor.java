package packMusician;


/**
 * Clase que representa a los tenores de la orquesta
 * @author Diego Fernandez
 *
 */
public class Tenor extends Singer{
	
	
	
	/**
	 * constructora de la clase
	 * @param name
	 */
	public Tenor(String nombre) {
		
		super(nombre);
		setSalario(getSalario() + 200);	
	}
	
	
	public String perform() {
		return "La-la-la-laaaaaaaaaa";
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	

}
