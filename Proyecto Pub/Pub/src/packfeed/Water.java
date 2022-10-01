package packfeed;

import java.util.Scanner;

public class Water extends Drink{

	public String sabor;
	public boolean burbujas;
	private String origen;
	private boolean manantial;
	
	public Water(String nombre, String sabor, boolean burbujas, String origen, boolean manantial) {
	
		super(nombre);
		this.sabor=sabor;
		this.burbujas=burbujas;
		this.origen=origen;
		this.manantial=manantial;
		
		setPrecio(3.5);
	}

	/**
	 * @return the origen
	 */
	public String getOrigen() {
		return origen;
	}

	/**
	 * @param origen the origen to set
	 */
	public void setOrigen(String origen) {
		this.origen = origen;
	}

	/**
	 * @return the sabor
	 */
	public String getSabor() {
		return sabor;
	}

	/**
	 * @return the burbujas
	 */
	public boolean isBurbujas() {
		return burbujas;
	}

	/**
	 * @param sabor the sabor to set
	 */
	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	/**
	 * @param burbujas the burbujas to set
	 */
	public void setBurbujas(boolean burbujas) {
		this.burbujas = burbujas;
	}

	
	
	
	/**
	 * @return the manantial
	 */
	public boolean isManantial() {
		return manantial;
	}

	/**
	 * @param manantial the manantial to set
	 */
	public void setManantial(boolean manantial) {
		this.manantial = manantial;
	}

	@Override
	public String toString() {
		return super.toString() + "[sabor = " + sabor + ", burbujas = " +
						burbujas + ", origen = " + origen + ", manantial = " + manantial + "]";
	}
	
	
	
	public double tiempoEnvio() {
		
		Scanner sc = new Scanner(System.in);
		
		double km;
		double tiempo=0.0;
		
		km= sc.nextDouble();
		
		for (int i=0; i<= km; i++) {
			tiempo = 3*i;
		}
		
		sc.close();
		
		return tiempo+2.0;
		
		
	}
	
	
	
}
