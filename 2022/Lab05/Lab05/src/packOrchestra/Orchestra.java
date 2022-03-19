package packOrchestra;
import packMusician.Musician;

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
		if (musician.isContra() == false) {
			return "The	musician was already hired";
		}
		else {
			musician.hire();
			orchestra.add(musician);
			return Double.toString(musician.getSalario());
		}
		
	}
	
	/**
	 * metodo que interpreta la acutacion de la orquesta
	 */
	public void act() {
		System.out.println("Hoy actuará la orquesta " + name);
		for (Musician musc: orchestra) {
			System.out.println("["+musc.getNombre()+"]"+musc.perform());
		}
	
	}
	
	
	
	/**
	 * metodo que devuelve el presupuesto para una actuacion de la orquesta
	 * @return
	 */
	public int getFee() {
		
		int res=0;
		for(Musician precioMusc: orchestra) {
			res = res + precioMusc.getSalario();
		}
		
		return res;
	}


	@Override
	public String toString() {
		String orch = "";
		for (Musician musician: orchestra) {
			orch = orch + musician.toString() + "\n";
		}
		return orch;
	}
	
	
	
	
	
}
