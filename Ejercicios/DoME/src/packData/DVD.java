package packData;

/**
 * The DVD class represents a DVD object. Information about the 
 * DVD is stored and can be retrieved. We assume that we only deal 
 * with movie DVDs at this stage.
 * 
 */
public class DVD extends Item {
	
	
	private String director;

    /**
     * Constructor for objects of class DVD
     * @param theTitle The title of this DVD.
     * @param theDirector The director of this DVD.
     * @param time The running time of the main feature.
     */
    public DVD(String theTitle, int time, String theDirector)
    {
        super(theTitle, time);
        director = theDirector;
    }

    /**
     * @return The director for this DVD.
     */
    public String getDirector()
    {
        return director;
    }
}
