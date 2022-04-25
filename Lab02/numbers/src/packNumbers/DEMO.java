package packNumbers;
import java.util.Scanner;

public class DEMO {

	public static void main(String[] args) {
		
		int n;
		workingWithNumbers num = new workingWithNumbers();
		
		Scanner consola = new Scanner (System.in);
		
		
		
		System.out.println("Para el numero: ");
		n = consola.nextInt();
		System.out.println();
		System.out.println("¿El numero es par?: " + num.isEven(n));	
		System.out.println();
		num.evenValues(n);
		consola.close();
	}

}
