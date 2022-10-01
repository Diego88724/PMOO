package packfeed;

public class Ale extends Beer{

	
	private String color;
	
	public Ale(String nombre, double IBU, double ABV, String origen, String color) {
		
		super(nombre, IBU, ABV, origen);
		this.color=color;
		
		for (int i = 0; i <= ABV; i++) {
			setPrecio(3.0 + 0.05*i);
		}
		
		
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return super.toString() + "[color = " + color + "]";
	}
	
	
	


	
	
}
