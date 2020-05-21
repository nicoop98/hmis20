package ual.hmis.sesion06;

public class Ejercicio3 {

	public String asteriscos(int nAsteriscos) {
		if(nAsteriscos < 0) return "Numero erroneo";
		if(nAsteriscos < 5) return "*****";
		if(nAsteriscos > 12) return "************";
		String salida = "";
		for(int i = 0; i < nAsteriscos; i++) {
			salida += "*";
		}
		return salida;
	}
}