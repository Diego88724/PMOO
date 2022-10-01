package packfeed;

public class Liqueur extends Drink{
	
	private String gradu;
	private int años;
	
	public Liqueur(String nombre, String gradu, int años) {
		
		super(nombre);
		this.gradu=gradu;
		this.años=años;
		
		for (int i = 0; i <= años; i++) {
			setPrecio(3.0 + 0.25*i);
		}
		
		
		
	}

	/**
	 * @return the gradu
	 */
	public String getGradu() {
		return gradu;
	}

	/**
	 * @return the años
	 */
	public int getAños() {
		return años;
	}

	/**
	 * @param gradu the gradu to set
	 */
	public void setGradu(String gradu) {
		this.gradu = gradu;
	}

	/**
	 * @param años the años to set
	 */
	public void setAños(int años) {
		this.años = años;
	}

	@Override
	public String toString() {
		return super.toString() + "[graduacion = " + gradu + ", años = " + años + "]";
	}
	
	

}