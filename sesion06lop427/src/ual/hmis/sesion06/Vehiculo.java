package ual.hmis.sesion06;

public class Vehiculo {

	private int numPasajeros;
	private int numRuedas;
	private int peso;
	
	public Vehiculo() {
		this.peso = 0;
		this.numPasajeros = 5;
		this.numRuedas = 4;
	}
	
	public int getNumPasajeros() {
		return numPasajeros;
	}

	public void setNumPasajeros(int numPasajeros) {
		this.numPasajeros = numPasajeros;
	}

	public int getNumRuedas() {
		return numRuedas;
	}

	public void setNumRuedas(int numRuedas) {
		this.numRuedas = numRuedas;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	
}
