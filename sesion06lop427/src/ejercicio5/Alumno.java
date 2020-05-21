package ejercicio5;

import java.util.ArrayList;
import java.util.*;

public class Alumno {

	private String nombre;
	private ArrayList<Actividad> actividadesAsignadas;


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Actividad> getActividadesAsignadas() {
		return actividadesAsignadas;
	}

	public void setActividadesAsignadas(ArrayList<Actividad> actividadesAsignadas) {
		this.actividadesAsignadas = actividadesAsignadas;
	}

	public double calcularNotaActividad(String nombreActividad) {
		double total = 0;
		for (Actividad actividad : actividadesAsignadas) {
			if(actividad.getNombre().equals(nombreActividad)) {
				for (Ejercicio ejercicio : actividad.getEjercicios()) {
					total += ejercicio.getPuntuacion();
				}
				actividad.setPuntuacionTotal(total);
				break;
			}
		}
		return total;
	}

}
