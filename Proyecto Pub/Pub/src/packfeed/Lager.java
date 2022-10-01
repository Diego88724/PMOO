package packfeed;

public abstract class Lager extends Beer{

	private String marca;
	
	public Lager(String nombre, double IBU, double ABV, String origen, String marca) {
		
		super(nombre, IBU, ABV, origen);
		this.marca=marca;
		
		setPrecio(2.0);
		
	}

	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return super.toString() + "[marca = " + marca + "]";
	}
	
	


	
	
	
}
