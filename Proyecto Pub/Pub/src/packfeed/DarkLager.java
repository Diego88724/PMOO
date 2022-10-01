package packfeed;

public class DarkLager extends Lager{
	
	private String cerv; //si la cerveceria las tiene en botella o en barril
	
	public DarkLager(String nombre, double IBU, double ABV, String origen, String marca, String cerv) {
		
		super(nombre, IBU, ABV, origen, marca);
		this.cerv=cerv;
		
		
		if (cerv == "barril") {
			setPrecio(2.0*0.01);
		}
		else if (cerv == "botella") {
			setPrecio(2.0 + 1.0);
		}
		
	}

	/**
	 * @return the cerv
	 */
	public String getCerv() {
		return cerv;
	}

	/**
	 * @param cerv the cerv to set
	 */
	public void setCerv(String cerv) {
		this.cerv = cerv;
	}

	@Override
	public String toString() {
		return super.toString() + "[cerveceria = " + cerv + "]";
	}
	
	
	

}
