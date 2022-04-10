package packNumbers;

public class workingWithNumbers {
	
	/**
	 * Metodo que nos indica si un numero es par o no pasandole ese numero como parametro
	 * @param num, numero del que queremos saber si es par
	 * @return un booleano que dice si es par (true) o no (false)
	 */
	public boolean isEven(int num) {
		
		if (num % 2 == 0) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	
	/**
	 * metodo que nos devuelve los numeros pares hasta el numero que le pasamos por parametro y 
	 * cuantos ha encontrado
	 * @param valor, numero que sera el limite de la lista de los numeros pares
	 * 
	 */
	public void evenValues(int valor) { 		
		
		int cont=0;
		int res;
		for (int i=1; i <= valor; i++) {
			
			if (i % 2 == 0) {
				System.out.println(i);
				cont++;
			}
			
					
		}
		System.out.println();
		System.out.println("Hasta el numero " + valor + " hay " + cont + " numeros pares");
		
	}

}
