package packprimitiboa;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ticket {
    private int numbers[];
    private int numElems;

    private final int NUM_QUANT = 6;
    private final int MIN_NUM = 1;
    private final int MAX_NUM = 49;

    /**
     * Constructor
     */
    public Ticket() {
    	numElems = 0;
        numbers = new int[NUM_QUANT];
    }

    /**
     * Returns the number of possible numbers in the combination
     * @return the max number in a combination
     */
    public int getTicketSize() {
        return NUM_QUANT;
    }

    /**
     * Methods that obtains the number of values in a bet 
     * @return the number of values in a bet
     */
    public int getNumElems() {
    	return numElems;
    }
    
    /**
     * Methods that obtains the lowest number of values in a bet 
     * @return the lowest number of values in a bet
     */
    public int lowestNumber() {
    	
    	if (numElems>0) {
    		int min = numbers[0];
    		for (int i=1; i<numElems; i++) {
    			if (numbers[i]<min)
    				min = numbers[i];
    		}
    		return min;
    	}
    	else return -1;
    }
    
    /**
     * Returns the number in pos position
     * @return the number that is in the given position
     * @throws IndexOutOfBoundsException if pos<0 or pos>= number in the combination
     */
    public int getPosNumber(int pos) throws IndexOutOfBoundsException{
        if (pos >= numElems)
        	throw new IndexOutOfBoundsException("The position is not valid");
    	return numbers[pos];
    }

    /**
     * Inserts n number in the combination
     * @param n, number to be introduced in the combination
     * @throws IllegalArgumentException, if n has already been introduced 
     * @throws NumberOutRange, if n < MIN_NUM or  n > MAX_NUM
     * @throws IndexOutOfBoundsException, if the combination has been completed
     */
    public void addNumber(int n) throws IllegalArgumentException,
    NumberOutOfRange, IndexOutOfBoundsException {
        if (numElems == NUM_QUANT)
            throw new IndexOutOfBoundsException("The combination is complete.");
        if (n < MIN_NUM || n > MAX_NUM)
            throw new NumberOutOfRange(" Number "+ n  
                + " is not in the range [" + MIN_NUM + " , " + MAX_NUM+ "].");
        for (int i = 0; i < numElems; i++) {
            if (numbers[i] == n)
                throw new IllegalArgumentException("Number "+n 
                    + " is already in the combination.");
        }
        numbers[numElems] = n;
        numElems++;
    }

    /**
     * Returns the String representation of the combination
     */
    public String toString(){
        String devol="[ ";
        for (int i = 0; i < NUM_QUANT; i++) {
            devol=devol+numbers[i] + " ";
        }
        devol=devol+"]";
        return devol;
    }

    
    /**
     * metodo que guarda el contenido del toString en un archivo pasado por parametro
     * @param n, archivo donde guardar el contenido
     * @throws IOException
     */
    public void storeInFile(String n) throws IOException {
    	
    		FileWriter wr = new FileWriter(n);
    		wr.write(this.toString());
			wr.write("\n");

			wr.close();
    }
    
    
    public void readFromFile(String n) throws FileNotFoundException {
    	
    	Scanner sc = new Scanner(new FileReader(n));
    	String s;
    	while (sc.hasNext()) {
    		s = sc.nextLine();
    		System.out.println(s);
    	}
    	
    	sc.close();
    }
  
}
