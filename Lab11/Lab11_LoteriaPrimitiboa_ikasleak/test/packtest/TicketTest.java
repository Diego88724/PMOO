package packtest;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import packprimitiboa.NumberOutOfRange;
import packprimitiboa.Ticket;

@DisplayName("Test para la clase Ticket")
public class TicketTest {
	
	Ticket ticket1;

	@BeforeEach
	public void setUp() throws Exception {
		ticket1 = new Ticket();
	}



	@Test
	@DisplayName("Prueba para lowestNumber()")
	public void testLowestNumber() throws IllegalArgumentException, IndexOutOfBoundsException, NumberOutOfRange {
		
		assertEquals(-1, ticket1.lowestNumber());
		
		ticket1.addNumber(7);
		assertEquals(ticket1.getPosNumber(0), ticket1.lowestNumber());
		
		ticket1.addNumber(2);
		assertEquals(ticket1.getPosNumber(ticket1.getNumElems()-1), ticket1.lowestNumber());
		
		ticket1.addNumber(3);
		assertEquals(ticket1.getPosNumber(1), ticket1.lowestNumber());
		
	}
	
	
	@Test
	@DisplayName("Prueba para el metodo getPosNumber()")
	public void testGetPosNumber() throws IllegalArgumentException, IndexOutOfBoundsException, NumberOutOfRange {
		
		
		assertThrows(IndexOutOfBoundsException.class, () -> {ticket1.getPosNumber(0);}  );
		
		ticket1.addNumber(2);
		ticket1.addNumber(4);
		assertEquals(2, ticket1.getPosNumber(0));
		
		int n = 0;
		assertFalse(ticket1.getPosNumber(n) < 0);
		
		assertThrows(IndexOutOfBoundsException.class, () -> {ticket1.getPosNumber(3);}  );
		
		
		assertThrows(IndexOutOfBoundsException.class, () -> {ticket1.getPosNumber(50);}  );
		
	}
	

	
	
	
}
