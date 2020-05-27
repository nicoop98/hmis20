package ual.hmis.sesion07;

public class Ejercicio4 {
	public String interseccion(String p1, String p2) {
		String aux = "";
		for(int i = 0; i < p1.length(); i++) {
			if(p2.contains(String.valueOf(p1.charAt(i)))) {
				aux += p1.charAt(i);
			}
		}
		return aux;
	}
}
