package ual.hmis.sesion07;

import java.util.ArrayList;

public class Ferry {

	private int numMaxPasajeros;
	private int pesoMaxVehiculos;
	private int numMaxVehiculos;
	private int numVehiculos;
	private int numPersonas;
	private int pesoVehiculos;

	ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();

	
	public Ferry(final int numMaxVehiculos, final int numMaxPasajeros,
		final int pesoMaxVehiculos, final int personas,
		final int vehiculos, final int pesoVehiculos) {
		this.numPersonas = personas;
		this.numVehiculos = vehiculos;
		this.pesoVehiculos = pesoVehiculos;
		this.numMaxVehiculos = numMaxVehiculos;
		this.numMaxPasajeros = numMaxPasajeros;
		this.pesoMaxVehiculos = pesoMaxVehiculos;
	}
	
	public int getNumMaxPasajeros() {
		return numMaxPasajeros;
	}
	
	public void setNumMaxPasajeros(final int numMaxPasajeros) {
		this.numMaxPasajeros = numMaxPasajeros;
	}

	
	public int getPesoMaxVehiculos() {
		return pesoMaxVehiculos;
	}

	public void setPesoMaxVehiculos(final int pesoMaxVehiculos) {
		this.pesoMaxVehiculos = pesoMaxVehiculos;
	}
	
	public int getNumMaxVehiculos() {
		return numMaxVehiculos;
	}
	
	public void setNumMaxVehiculos(final int numMaxVehiculos) {
		this.numMaxVehiculos = numMaxVehiculos;
	}
	
	public int getNumVehiculos() {
		return numVehiculos;
	}

	public void setNumVehiculos(final int numVehiculos) {
		this.numVehiculos = numVehiculos;
	}
	
	public int getNumPersonas() {
		return numPersonas;
	}
	
	public void setNumPersonas(final int numPersonas) {
		this.numPersonas = numPersonas;
	}
	
	public int getPesoVehiculos() {
		return pesoVehiculos;
	}
	
	public void setPesoVehiculos(final int pesoVehiculos) {
		this.pesoVehiculos = pesoVehiculos;
	}

	public ArrayList<Vehiculo> getVehiculos() {
		return vehiculos;
	}

	public void setVehiculos(final ArrayList<Vehiculo> vehiculos) {
		this.vehiculos = vehiculos;
	}
		
	public boolean embarcarVehiculo(Vehiculo v) {
		this.pesoVehiculos = this.pesoVehiculos + v.peso;
		this.numPersonas = this.numPersonas + v.numPasajerosVehi;
		return vehiculos.add(v);
	}
	
	public int totalVehiculos() {
		return vehiculos.size();
	}
	
	public boolean vacio() {
		return vehiculos.size() == 0;
	}
	
	public boolean superadoMaximoVehiculos() {
		return vehiculos.size() > this.numMaxVehiculos;
	}
	
	public boolean superadoMaximoPeso() {
		int peso = 0;
		for (Vehiculo v: vehiculos) {
			peso += v.peso;
		}
		return peso > this.pesoMaxVehiculos;
	}

}

