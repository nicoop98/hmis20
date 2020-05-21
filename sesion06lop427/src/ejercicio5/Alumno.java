package ejercicio5;

import java.util.ArrayList;

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
	
	public String calificacion(double nota) {
		
		if (nota>=0 && nota<5) return "Suspenso";
		else if (nota>=5 && nota<7) return "Aprobado";
		else if (nota>=7 && nota<9) return "Notable";
		else if (nota>=9 && nota<10) return "Sobresaliente";
		else if (nota == 10) return "Matrícula";
		
		return "Error en la nota";
	}
	
	public String cursoSegunEdad(int anyoNacimiento) {
		
		if (anyoNacimiento == 2017) return "1º Educación Infantil";
		else if (anyoNacimiento == 2016) return "2º Educación Infantil";
		else if (anyoNacimiento == 2015) return "3º Educación Infantil";
		else if (anyoNacimiento == 2014) return "1º Educación Primaria";
		else if (anyoNacimiento == 2013) return "2º Educación Primaria";
		else if (anyoNacimiento == 2012) return "3º Educación Primaria";
		else if (anyoNacimiento == 2011) return "4º Educación Primaria";
		else if (anyoNacimiento == 2010) return "5º Educación Primaria";
		else if (anyoNacimiento == 2009) return "6º Educación Primaria";
		else if (anyoNacimiento == 2008) return "1º Educación Secundaria";
		else if (anyoNacimiento == 2007) return "2º Educación Secundaria";
		else if (anyoNacimiento == 2006) return "3º Educación Secundaria";
		else if (anyoNacimiento == 2005) return "4º Educación Secundaria";
		return "Error en el año de nacimiento";
	}
	

}