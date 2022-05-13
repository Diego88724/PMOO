package packUnit;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Test para la clase Counter")

class CounterTest {
	
	
	Counter counter1;
	
	
	@BeforeEach
	void setUp() throws Exception {
		counter1 = new Counter();
	}
	

	@Test
	@DisplayName("Prueba inicialización correcta")
	void testIncrement() {
        assertEquals(11, counter1.increment());
        assertEquals(12, counter1.increment());
	}

	@Test
	void testDecrement() {
		assertTrue(counter1.decrement() == 9, "Se esperaba 9 y ha funcionado bien el decrement");
	}

}
