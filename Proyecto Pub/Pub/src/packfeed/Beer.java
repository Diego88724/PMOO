package packfeed;

public abstract class Beer extends Drink {
	
	
	private double IBU;
	private double ABV;
	private String origen;
	
	//private double precio;
	
	
	
	public Beer(String nombre, double IBU, double ABV, String origen) {
		
		super(nombre);
		this.ABV=ABV;
		this.IBU=IBU;
		this.origen=origen;
		
	}



	/**
	 * @return the iBU
	 */
	public double getIBU() {
		return IBU;
	}



	/**
	 * @return the aBV
	 */
	public double getABV() {
		return ABV;
	}



	/**
	 * @return the origen
	 */
	public String getOrigen() {
		return origen;
	}



	/**
	 * @param iBU the iBU to set
	 */
	public void setIBU(double iBU) {
		IBU = iBU;
	}



	/**
	 * @param aBV the aBV to set
	 */
	public void setABV(double aBV) {
		ABV = aBV;
	}



	/**
	 * @param origen the origen to set
	 */
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	
	



	@Override
	public String toString() {
		return super.toString() + "[IBU = " + IBU + ", ABV = " + ABV + ", origen = " + 
									origen + "]";
	}
	
	
	
	/**
	 * precio base de la cerveza
	 * @return
	 */
	public double precio() {
		return 1.5;
	}
	

}
