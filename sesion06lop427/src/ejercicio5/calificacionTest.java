package ejercicio5;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

	public class calificacionTest {
	@ParameterizedTest
	@CsvSource({"4", "5", "8", "-3", "9.5", "10"})
	
	void notaTest(double nota) {
		Alumno al = new Alumno();
		al.calificacion(nota);
	}

}
