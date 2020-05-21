package ual.hmis.sesion06;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Ejercicio3Test {

	@ParameterizedTest
	@CsvSource({"-4,Numero erroneo", 
			 	"3,*****",
			 	"24,************", 
			 	"9,*********"})
	void testAsteriscos(int input, String expected) {
		Ejercicio3 c = new Ejercicio3();
		assertEquals(expected, c.asteriscos(input));
	}

}
