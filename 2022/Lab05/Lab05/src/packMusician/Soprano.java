package packMusician;


/**
 * Clase que representa a los sopranos de la orquesta
 * @author Diego Fernandez
 *
 */
public class Soprano extends Singer {
		
	private boolean inter;
	
	
	/**
	 * constructora de la clase
	 * @param name
	 * @param inter
	 */
	public Soprano(String nombre, boolean inter) {
		
		super(nombre);
		this.inter=inter;
		
		if (inter==true) setSalario(getSalario() + (getSalario() * 0.33));
		
			
	}
	
	public String perform() {
		return "Li-li-li-liiiiiiiii";
	}
	
	@Override
	public String toString() {
		return super.toString() + ", international=" + inter;
	}
	
	
	
}
