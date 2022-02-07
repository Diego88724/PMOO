package packNumbers;
import java.util.*;

public class DEMO {

	public static void main(String[] args) {
		
		int n;
		workingWithNumbers num = new workingWithNumbers();
		
		Scanner consola = new Scanner (System.in);
		n = consola.nextInt();
		
		
		System.out.println("Para el numero: " + n);
		System.out.println("¿El numero es par?: " + num.isEven(n));	
		System.out.println("Los numeros pares hasta " + n + " son: " + num.evenValues(n));
		consola.close();
	}

}
