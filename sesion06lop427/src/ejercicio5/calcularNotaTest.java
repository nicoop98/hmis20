package ejercicio5;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class calcularNotaTest {

	@ParameterizedTest
	@CsvSource({"Actividad 2,5.5", 
			 	"Actividad 24,0",})
	void testCalcularNota(String input, double expected) {
		Actividad a1 = new Actividad();
		Actividad a2 = new Actividad();
		Actividad a3 = new Actividad();
		a1.setNombre("Actividad 1");
		a2.setNombre("Actividad 2");
		a3.setNombre("Actividad 3");
		a2.setEjercicios(new ArrayList<Ejercicio>());
		a2.agregarEjercicioCalificado("e1", 2);
		a2.agregarEjercicioCalificado("e2", 0.5);
		a2.agregarEjercicioCalificado("e3", 3);
		
		ArrayList<Actividad> actividades = new ArrayList<Actividad>();
		actividades.add(a1);
		actividades.add(a2);
		actividades.add(a3);
		
		Alumno alumno = new Alumno();
		alumno.setActividadesAsignadas(actividades);
		
		assertEquals(expected, alumno.calcularNotaActividad(input));
	}

}