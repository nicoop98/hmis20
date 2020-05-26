package ejercicio5;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

	public class anyoNacimientoTest {
	@ParameterizedTest
	@CsvSource({"2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012",
		"2013", "2014", "2015", "2016", "2017"})
	
	void notaCursoSegunEdad(int anyo) {
		Alumno al = new Alumno();
		al.cursoSegunEdad(anyo);
	}

}
