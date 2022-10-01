package packfeed;

public class Wine extends Drink{
	
	
	private boolean denor; //denominacion de origen
	private boolean espumoso;
	
	
	public Wine(String nombre, boolean denor, boolean espumoso) {
		
		super(nombre);
		this.denor=denor;
		this.espumoso=espumoso;
		
		
		
		if (espumoso == true) {
			setPrecio(3.0);
		}
		else {
			setPrecio(2.0);
		}
	}



	/**
	 * @return the denor
	 */
	public boolean isDenor() {
		return denor;
	}



	/**
	 * @return the espomoso
	 */
	public boolean isEspumoso() {
		return espumoso;
	}



	/**
	 * @param denor the denor to set
	 */
	public void setDenor(boolean denor) {
		this.denor = denor;
	}



	/**
	 * @param espomoso the espomoso to set
	 */
	public void setEspumoso(boolean espumoso) {
		this.espumoso = espumoso;
	}



	@Override
	public String toString() {
		return super.toString() + "[denominacion de origen = " + denor + ", espumoso = " + espumoso + "]";
	}
	
	

}
