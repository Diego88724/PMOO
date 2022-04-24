package packDemo;

import packMusician.*;

import packOrchestra.Orchestra;

/**
 * Clase principal que pondra en marcha toda la orquesta
 * @author Diego Fernandez 
 *
 */
public class DemoOrchestra {

	public static void main(String[] args) {
		
		
		Musician Director = new Director("Diego Fernández",15);
		Musician Pianista = new Pianist("Elton John");
		Musician Soprano1 = new Soprano("Montserrat Caballe", true);
		Musician Soprano2 = new Soprano("Freddie Mercury", false);
		Musician Tenor = new Tenor("David Bowie");
		Musician Trompetista1 = new Trumpeter("Timmy Trumpet");
		Musician Trompetista2 = new Trumpeter("Armin Van Buuren");

		Orchestra orquesta = new Orchestra("JazzBan Orkestra");
		

		System.out.println(orquesta.hire(Pianista));
		System.out.println(orquesta.hire(Tenor));
		System.out.println(orquesta.hire(Soprano1));
		System.out.println(orquesta.hire(Trompetista1));
		System.out.println(orquesta.hire(Pianista));
		System.out.println(orquesta.hire(Tenor));
		System.out.println(orquesta.hire(Director));
		System.out.println(orquesta.hire(Trompetista2));
		System.out.println(orquesta.hire(Soprano2));
		System.out.println();
		
	
		System.out.println(orquesta+"\n");
		
		System.out.println("This is the "+orquesta.getName()+" performance:");
		orquesta.act();
		System.out.println();
		
		System.out.println("Spent on "+orquesta.getName()+" participants' salaries: "+
							orquesta.getFee()+" euros.");

	}

}
