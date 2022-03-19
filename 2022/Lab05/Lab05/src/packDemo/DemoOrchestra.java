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
		
		
		
		Director.hire();
		Pianista.hire();
		Soprano1.hire();
		Soprano2.hire();
		Tenor.hire();
		Trompetista1.hire();
		Trompetista2.hire();
		
		
		System.out.println(Director.getNombre() + " Director, hired for " + Director.getSalario() + " euros");
		System.out.println(Pianista.getNombre() + " Pianist, hired for " + Pianista.getSalario() + " euros");
		System.out.println(Soprano1.getNombre() + " Soprano, hired for " + Soprano1.getSalario() + " euros");
		System.out.println(Soprano2.getNombre() + " Soprano. hired for " + Soprano2.getSalario() + " euros");
		System.out.println(Tenor.getNombre() + " Tenor, hired for " + Tenor.getSalario() + " euros");
		System.out.println(Trompetista1.getNombre() + " Trompetista, hired for " + Trompetista1.getSalario() + " euros");
		System.out.println(Trompetista2.getNombre() + " Trompetista, hired for " + Trompetista2.getSalario() + " euros\n");
		

		
		System.out.println("These are the " + orquesta.getName() + " participants:");
		System.out.println(Director.toString());
		System.out.println(Pianista.toString());
		System.out.println(Tenor.toString());
		System.out.println(Soprano1.toString());
		System.out.println(Soprano2.toString());
		System.out.println(Trompetista1.toString());
		System.out.println(Trompetista2.toString() + "\n");
		
		
		orquesta.toString();
		
		
		
		System.out.println("This is the " + orquesta.getName() + " performance:");
		System.out.println(Director.getNombre() + ": " + Director.perform());
		System.out.println(Pianista.getNombre() + ": " + Pianista.perform());
		System.out.println(Tenor.getNombre() + ": " + Tenor.perform());
		System.out.println(Soprano2.getNombre() + ": " + Soprano2.perform());
		System.out.println(Trompetista1.getNombre() + ": " + Trompetista1.perform());
		System.out.println(Trompetista2.getNombre() + ": " + Trompetista2.perform());
		System.out.println(Soprano1.getNombre() + ": " + Soprano1.perform() + "\n");
		
		
		orquesta.act();

		
		System.out.println("Spent on " + orquesta.getName() + " participants salaries: " + orquesta.getFee() + " euro.");
		

	}

}
