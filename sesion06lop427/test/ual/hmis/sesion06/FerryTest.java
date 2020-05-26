package ual.hmis.sesion06;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class FerryTest {

	@ParameterizedTest
	@CsvSource({"500 5 4", 
			 	"600 4 5",
			 	"405 6 8"})
	void testFerry(int peso, int numPasajeros, int numRuedas) {
		Vehiculo v1 = new Vehiculo(peso, numPasajeros, numRuedas);
		
		Ferry f = new Ferry();
		assertTrue(f.vacio());
		
		f.embarcarVehiculo(v1);
			
		f.setNumMaxVehiculos(2);
		Vehiculo v2 = new Vehiculo(800, 6, 4);
		Vehiculo v3 = new Vehiculo(900, 5, 5);
		f.embarcarVehiculo(v2);
		f.embarcarVehiculo(v3);
		assertTrue(f.superadoMaximoVehiculos());
		f.setPesoMaxVehiculos(2000);
		assertTrue(f.superadoMaximoPeso());
		
	}

}
