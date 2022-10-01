package packfeed;

public class Pilsener extends Lager{
	
	
	
	private double temp;
	
	
	
	
	public Pilsener(String nombre, double IBU, double ABV, String origen, String marca, double temp) {
		
		super(nombre, IBU, ABV, origen, marca);
		this.temp=temp;
		
		setPrecio(2.0);
	}

	/**
	 * @return the temp
	 */
	public double getTemp() {
		return temp;
	}

	/**
	 * @param temp the temp to set
	 */
	public void setTemp(double temp) {
		this.temp = temp;
	}

	@Override
	public String toString() {
		return super.toString() + "[temperatura = " + temp + "]";
	}

	

	
	
	




}
