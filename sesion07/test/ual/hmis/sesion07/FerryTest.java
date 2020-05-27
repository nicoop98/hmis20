package ual.hmis.sesion07;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Ejercicio8Test {

	@CsvSource({"1000,5,4,1000,5,4", "800,2,2,800,2,2", "8000,13,1,8000,13,1"})
	@ParameterizedTest
	void testVehiculo(int espePeso, int espePasajeros, int espeRuedas, int peso, int pasajeros, int ruedas) {

		Vehiculo v = new Vehiculo(pasajeros,ruedas,peso);

		assertEquals(espePeso, v.peso);
		assertEquals(espePasajeros, v.numPasajerosVehi );
		assertEquals(espeRuedas, v.numRuedas);

	}

	Vehiculo autobus = new Vehiculo(25, 10,10000);
	Vehiculo coche = new Vehiculo(4, 4, 1200);
	Vehiculo moto = new Vehiculo(1, 2, 400);
	Vehiculo trailer = new Vehiculo(1, 15, 12456);

	@CsvSource({"1,10,9000,2,0,0,0","2,10,10000,1,0,0,0"})
	@ParameterizedTest
	void testFerry(int caso, int numMaxPasajeros, int pesoMaxVehiculos, int numMaxVehiculos, int numVehiculos, int numPersonas, int pesoVehiculos) {

		Ferry f = new Ferry(numMaxVehiculos , numMaxPasajeros, pesoMaxVehiculos, numPersonas, numVehiculos, pesoVehiculos);

		
		assertEquals(true, f.vacio());

		f.setNumMaxVehiculos(numMaxVehiculos);
		assertEquals(0, f.totalVehiculos());
		
		assertEquals(false, f.superadoMaximoPeso());

		
		assertEquals(false, f.superadoMaximoVehiculos());

		f.setNumMaxPasajeros(numMaxPasajeros);
		assertEquals(numMaxPasajeros, f.getNumMaxPasajeros());

		f.setPesoMaxVehiculos(pesoMaxVehiculos);
		assertEquals(pesoMaxVehiculos, f.getPesoMaxVehiculos());

		assertEquals(numMaxVehiculos, f.getNumMaxVehiculos());

		f.setNumVehiculos(numVehiculos);
		assertEquals(numVehiculos, f.getNumVehiculos());

		f.setNumPersonas(numPersonas);
		assertEquals(numPersonas, f.getNumPersonas());

		f.setPesoVehiculos(pesoVehiculos);
		assertEquals(pesoVehiculos, f.getPesoVehiculos());

		if(caso == 1) {

			f.embarcarVehiculo(trailer);
			assertEquals(15, f.getVehiculos().get(0).numRuedas);
			assertEquals(false, f.vacio());
			assertEquals(1, f.totalVehiculos());
			assertEquals(true, f.superadoMaximoPeso());
			assertEquals(false, f.superadoMaximoVehiculos());
			f.vehiculos.clear();

		} else  {
			f.embarcarVehiculo(coche);
			f.embarcarVehiculo(moto);
			assertEquals(false, f.vacio());
			
			assertEquals(2, f.totalVehiculos());
			ArrayList<Vehiculo> vec = new ArrayList<Vehiculo>();
			vec.add(moto);
			vec.add(coche);
			vec.add(trailer);
			f.setVehiculos(vec);
			assertEquals(true, f.superadoMaximoPeso());
			assertEquals(true, f.superadoMaximoVehiculos());					
			f.vehiculos.clear();

		}

	}

}
