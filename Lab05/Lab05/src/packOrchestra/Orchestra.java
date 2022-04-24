package packOrchestra;
import packMusician.Musician;
import packMusician.Director;

import java.util.ArrayList;

/**
 * Clase que representa toda la orquesta
 * @author Diego Fernandez
 *
 */
public class Orchestra {
	
	
	private ArrayList<Musician> orchestra;
	
	private String name;
	
	
	public Orchestra(String name) {
		this.name = name;
		orchestra = new ArrayList<Musician>();
	}

	
	public String getName() {
		return name;
	}
	
	
	
	public String hire(Musician musician) {
		if (musician.isContra()) {
			return "The musician was already hired";
		}
		else {
			musician.hire();
			orchestra.add(musician);
			//return Double.toString(musician.getSalario());
			return musician.getNombre()+" "+musician.getClass().getSimpleName().toLowerCase()+", hired for "+
			musician.getSalario()+ " euros.";
		}

		
	}
	
	/**
	 * metodo que interpreta la acutacion de la orquesta
	 */
	public void act() {

		for (Musician musico: orchestra) {
			
			System.out.println(" ["+musico.getNombre()+"]: "+musico.perform());
		}
	
	}
	
	
	
	/**
	 * metodo que devuelve el presupuesto para una actuacion de la orquesta
	 * @return
	 */
	public double getFee() {
		
		double total= 0.0;
		
		for (Musician musico: orchestra) {
			
			total+= musico.getSalario();
		}
		
		return total;
	}


	@Override
	public String toString() {
		String resultado= "These are the "+name+" participants:";
		
		for (Musician musico: orchestra) {
			resultado+="\n"+musico.toString();
		}
		
		return resultado;
	}
	
	
	
	
	
}
