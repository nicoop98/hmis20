package ual.hmis.sesion06;

public class Vehiculo {

	private int numPasajeros;
	private int numRuedas;
	private int peso;
	
	public Vehiculo(int peso, int numPasajeros, int numRuedas) {
		this.peso = peso;
		this.numPasajeros = numPasajeros;
		this.numRuedas = numRuedas;
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
