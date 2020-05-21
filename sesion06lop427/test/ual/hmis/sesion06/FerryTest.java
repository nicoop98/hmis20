package ual.hmis.sesion06;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class FerryTest {

	@ParameterizedTest
	@CsvSource({"Actividad 2,5.5", 
			 	"Actividad 24,0",})
	void testFerry(Vehiculo input, Ferry expected) {
		Vehiculo v1 = new Vehiculo();
		Vehiculo v2 = new Vehiculo();
		Vehiculo v3 = new Vehiculo();
		
		v1.setPeso(500);
		v2.setPeso(800);
		v3.setPeso(1050);
		
		Ferry f = new Ferry();
		
		assertTrue(f.vacio());
		
		f.embarcarVehiculo(v1);
		f.embarcarVehiculo(v2);
		
		assertTrue(f.vacio()==false);
		
		
		
		
		
		
		
		f.embarcarVehiculo(v3);
		
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
