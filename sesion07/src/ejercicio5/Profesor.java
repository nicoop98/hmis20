package ejercicio5;

import java.util.ArrayList;

public class Profesor {

		private ArrayList<Alumno> alumnos;

		
		public ArrayList<Alumno> getAlumnosDePracticas() {
			return alumnos;
		}

		
		public void setAlumnos(final ArrayList<Alumno> alumnosDePracticas) {
			this.alumnos = alumnosDePracticas;
		}

		
	public void calificarAlumnos() {
		
		
		for (int i = 0; i < alumnos.size(); i++) {
			if (alumnos.get(i).getActividadesAsignadas()== null) {
				return;
			}

			for (int j = 0; j < alumnos.get(i).
				getActividadesAsignadas().size(); j++) {

			double suma = 0.0;

			for (int k = 0; k < alumnos.get(i).getActividadesAsignadas().
				get(j).getEjercicios().size(); k++) {
				double puntuacion =
				alumnos.get(i).getActividadesAsignadas().get(j).
				getEjercicios().get(k).getPuntuacion();
					suma += puntuacion;
			}
		if (suma >= 5) {
			alumnos.get(i).getActividadesAsignadas().get(j).setApta(true);
		} else {
			alumnos.get(i).getActividadesAsignadas().get(j).setApta(false);
		}
				}
	}
}
}