package ual.hmis.sesion06;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Ejercicio4Test {

	@ParameterizedTest
	@CsvSource({"hola,hola,hola", 
			 	"hola,qwer,",
			 	"hola,hol,hol", 
			 	})
	void testInterseccion(String p1, String p2, String expected) {
		if(expected == null) expected = "";
		Ejercicio4 c = new Ejercicio4();
		assertEquals(expected, c.interseccion(p1, p2));
	}

}
