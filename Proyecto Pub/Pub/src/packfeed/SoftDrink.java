package packfeed;

import java.util.Scanner;

public class SoftDrink extends Drink{

	
	public String sabor;
	public boolean burbujas;
	public int zumo;
	
	public SoftDrink(String nombre, String sabor, boolean burbujas, int zumo) {
		super(nombre);
		this.sabor=sabor;
		this.burbujas=burbujas;
		this.zumo=zumo;
		
		setPrecio(3.5);
	}

	/**
	 * @return the zumo
	 */
	public int getZumo() {
		return zumo;
	}

	/**
	 * @param zumo the zumo to set
	 */
	public void setZumo(int zumo) {
		this.zumo = zumo;
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

	@Override
	public String toString() {
		return super.toString() + "[sabor = " + sabor + ", burbujas = " + burbujas +
							", porcentaje de zumo= " + zumo + "]";
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
