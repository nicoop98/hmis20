package ejercicio5;

import java.time.LocalDate;
import java.util.ArrayList;

public class Alumno {

	private String nombreActividad;
	
	private ArrayList<Actividad> actividades;
	
	public String getNombre() {
		return nombreActividad;
	}

	
	public void setNombre(final String nombre) {
		this.nombreActividad = nombre;
	}

	
	public ArrayList<Actividad> getActividadesAsignadas() {
		return actividades;
	}

	
	public void setActAsign(final ArrayList<Actividad> act) {
		this.actividades = act;
	}

	
	public String calificacion(final Double nota) {

		if (0.0 > nota ||  nota > 10) {
			return "Error en la nota";
		} else if (nota == 10) {
			return "Matricula";
		}

	return nota >= 5 && nota <= 6.99
		? "Aprobado" :  (nota < 5)
		? "Suspenso" : (nota > 6.99  
		&& nota <= 8.99) ? "Notable" : "Sobresaliente";
	}


	
	public String cursoSegunEdad(int anoNacimiento) {
		
		LocalDate today = LocalDate.now();
		
		int edad = today.getYear() - anoNacimiento;

		String res = "";

		if (edad > 17 || edad < 0) {
			return "Error en la fecha";
		}

		if (edad < 6
				&& anoNacimiento >= 0) {
			
			res = edad <= 2 ? "1º "
				: edad <= 4 
				? "2º " : "3º ";
			res += "Educacion Infantil";

		} else if (edad >= 6
				&& edad < 12) {

			res = edad == 6 ? "1º "
				: edad == 7
				? "2º " : edad == 8
				? "3º " : edad == 9
				? "4º " :  edad == 10
				? "5º " : "6º ";
			res += "Educacion Primaria";

		} else {
			res = edad == 12 ? "1º "
			: edad == 13 ?
			"2º ": edad == 14
			? "3º " : "4º ";
			res += "Educacion Secundaria";
		}
		return res;
	}

	public double calcularNotaActividad(String nombreActividad) {
		double result = -1;

		for (int i = 0; i < actividades.size(); i++) {
			if (actividades.get(i).getNombre().equals(nombreActividad)) {
				result = 0;
				for (Ejercicio e : actividades.get(i).getEjercicios()) {
					
					
					result += e.getPuntuacion();
				}
				actividades.get(i).setPuntuacionTotal(result);

			}
		}
		
		return result;
	}
}