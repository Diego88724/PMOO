package packprimitiboa; 

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SimulatorScanner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ticket combination = new Ticket();
        int howMany = 0;
        while (howMany < combination.getTicketSize()) { 
            System.out.println("Write the number " + (howMany + 1)
                    + " of the combination: ");
            try {
                int n = sc.nextInt();
                combination.addNumber(n);
                howMany++;
            } catch (IllegalArgumentException e) {
                System.out.println("Unapproved value. " + e.getMessage()
                        + " Type again:");
                sc.nextLine() ;
            } catch (NumberOutOfRange e) {
                System.out.println("Unapproved value. " + e.getMessage()
                + " Type again");
                sc.nextLine() ;
            } catch (InputMismatchException e) { //It is not a number! 
                System.out.println("Unapproved value. " + e.toString()
                        + " Type again:");
                sc.nextLine() ;
            }
        }
        System.out.print("The ticket combination is complete. ");
        System.out.println("Combination:");
        System.out.println(combination.toString());
        
        
        try {
        	String n = "./data/Combinacion.txt";
			combination.storeInFile(n);
			System.out.println("LEE EL CONTENIDO DEL FICHERO?\n");
			combination.readFromFile(n);
		} catch (IOException e) {
			e.printStackTrace();
		}
        
        
     
        
        
        
        sc.close();
    }
 

}
