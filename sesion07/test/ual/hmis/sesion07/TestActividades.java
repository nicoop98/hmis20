package ual.hmis.sesion07;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import ejercicio5.Actividad;
import ejercicio5.Alumno;
import ejercicio5.Ejercicio;
import ejercicio5.Profesor;

class TestActividades {

	Ejercicio ejer1 = new Ejercicio();
	Ejercicio ejer2 = new Ejercicio();
	Ejercicio ejer3 = new Ejercicio();
	Ejercicio ejer4 = new Ejercicio();
	
	Actividad act1 = new Actividad();
	Actividad act2 = new Actividad();

	@ParameterizedTest 
	@CsvSource({"Nota1,10,Nota1,10"})
	void testEjercicio(String nombreEspe, int notaEspe , String nombre, int nota) {
		
		ejer1.setNombre(nombre);
		ejer1.setPuntuacion(nota);
		
		assertEquals(nombreEspe, ejer1.getNombre());
		assertEquals(notaEspe,  ejer1.getPuntuacion());
		
		ejer1 = null;
	}
	
	@Test
	void testActividad() {
			
	    // EJERCICIOS 1
		
		ejer1 = new Ejercicio();
		ejer1.setNombre("Nota 1");
		ejer1.setPuntuacion(7);

		ejer2 = new Ejercicio();
		ejer2.setNombre("Nota 2");
		ejer2.setPuntuacion(1);
		
		ArrayList<Ejercicio> ejercicios1 = new ArrayList<Ejercicio>();
		ejercicios1.add(ejer2);
		ejercicios1.add(ejer1);
		
		act1.setEjercicios(ejercicios1);
		act1.setNombre("Actividad 0 repaso");
		act1.agregarEjercicioCalificado("Nota 1", 6.1);
		act1.agregarEjercicioCalificado("Nota 2", 4.1);
		act1.setApta(false);
		
		//EJERCICIOS 2
		
		ejer1 = new Ejercicio();
		ejer1.setNombre("Nota grupal");
		ejer1.setPuntuacion(7);

		ejer2 = new Ejercicio();
		ejer2.setNombre("Nota individual");
		ejer2.setPuntuacion(7);
		
		ArrayList<Ejercicio> ejercicios2 = new ArrayList<Ejercicio>();	
		ejercicios2.add(ejer1);
		ejercicios2.add(ejer2);
		
		act2.setNombre("Actividad 1 inicio");
		act2.setEjercicios(ejercicios2);
		act2.agregarEjercicioCalificado("Nota grupal", 7);
		act2.agregarEjercicioCalificado("Nota individual", 8);
		act2.setApta(true);
		
		assertEquals(0.0 , act1.getPuntuacionTotal());
		assertEquals("Actividad 0 repaso", act1.getNombre());
		assertEquals(act2.getEjercicios(),ejercicios2);
		assertEquals(false,act1.isApta());
		assertEquals(true, act2.isApta());
		
		act1.setPuntuacionTotal(8.0);
		
		assertEquals(8.0,act1.getPuntuacionTotal());
		act1 = act2 = null;
		ejer1 = ejer2 = null;
	}
	
	@ParameterizedTest 
	@CsvSource({"true,Notable,7","true,Notable,8.9","true,Aprobado,5","true,Aprobado,6.9","true,Suspenso,4"
		,"true,Aprobado, 6","true,Sobresaliente,9","true,Matricula,10", "true,Error en la nota,-5","true,Error en la nota,12",
		"false,Error en la fecha,2000","false,Error en la fecha,2050","false,2º Educacion Infantil,2017", "false,2º Educacion Infantil,2016",
		"false,3º Educacion Infantil,2015", "false,1º Educacion Primaria,2014", "false,2º Educacion Primaria,2013",
		"false,3º Educacion Primaria,2012", "false,4º Educacion Primaria,2011", "false,5º Educacion Primaria,2010",
		"false,6º Educacion Primaria,2009", "false,1º Educacion Secundaria,2008", "false,2º Educacion Secundaria,2007",
		"false,3º Educacion Secundaria,2006","false,4º Educacion Secundaria,2005"})
	void testAlumnoNotas_Curso(boolean tipoPrueba, String esperado, String parametro) {
		
		Alumno a = new Alumno();
		
		if(tipoPrueba) {//Prueba calificacion
			assertEquals(esperado, a.calificacion(Double.valueOf(parametro)));
		} else { //Prueba ano escolar
			assertEquals(esperado, a.cursoSegunEdad(Integer.valueOf(parametro)));

		}
	}
	

	@ParameterizedTest 
	@CsvSource({"Juan, 3, 2, 2, 7, Actividad1", "Pepe, 2, 0, 0, 2, Actividad2"
		
	})
	void testCalcularNotaAlumno(String nombreAlumno, double ejercicio1, double ejercicio2, double ejercicio3, double notaTotal, String nombreActividad) {

		Alumno a = new Alumno();
		a.setNombre(nombreAlumno);
		
		ArrayList<Ejercicio> ejercicios = new ArrayList<Ejercicio>();
		ejer1.setPuntuacion(ejercicio1);
		ejer2.setPuntuacion(ejercicio2);
		ejer3.setPuntuacion(ejercicio3);
		
		ejercicios.add(ejer1);
		ejercicios.add(ejer2);
		ejercicios.add(ejer3);
		
		act1.setEjercicios(ejercicios);
		act1.setNombre(nombreActividad);
		
		ArrayList<Actividad> actividades = new ArrayList<Actividad>();
		actividades.add(act1);
		a.setActAsign(actividades);
		
		assertEquals(notaTotal,a.calcularNotaActividad(nombreActividad));
		assertEquals(-1,a.calcularNotaActividad("otroNombreActividad"));
		assertEquals(nombreAlumno, a.getNombre());
		
		ejer1 = ejer2 = ejer3 = null;
		act1 = null;
	}
	
	@ParameterizedTest 
	@CsvSource({"Juan, Pepe, ej1, 5, ej2, 2, ejC, 2", "Antonio, Pepe, ej1, 4, ej2, 1, ejC, 1"
		
	})
	void testProfesor(String nombreAlumnoA, String nombreAlumnoB, String nombreEjercicio1, double puntEj1, String nombreEjercicio2, double puntEj2, String nombreComun, double puntComun  ) {
		
		Profesor p = new Profesor();
		Alumno a = new Alumno();
		Alumno b = new Alumno();
		a.setNombre(nombreAlumnoA);
		b.setNombre(nombreAlumnoB);

		//EJERCICIOS
		ejer1 = new Ejercicio();
		ejer1.setNombre(nombreEjercicio1);
		ejer1.setPuntuacion(puntEj1);
		
		ejer2 = new Ejercicio();
		ejer2.setNombre(nombreEjercicio2);
		ejer2.setPuntuacion(puntEj2);

		ejer3 = new Ejercicio();
		ejer3.setNombre(nombreComun);
		ejer3.setPuntuacion(puntComun);		
		
		ArrayList<Ejercicio> ejercicios1 = new ArrayList<Ejercicio>();
		ejercicios1.add(ejer1);
		ejercicios1.add(ejer3);

		ArrayList<Ejercicio> ejercicios2 = new ArrayList<Ejercicio>();
		ejercicios2.add(ejer2);
		ejercicios2.add(ejer3);

		
		// ACTIVIDADES
		act1.setNombre("Actividad1");
		act1.setEjercicios(ejercicios1);		
		
		act2.setNombre("Actividad2");
		act2.setEjercicios(ejercicios2);
		
		ArrayList<Actividad> actividades = new ArrayList<Actividad>();
		actividades.add(act1);
		actividades.add(act2);	
		
		ArrayList<Actividad> actividades2 = new ArrayList<Actividad>();
		actividades2.add(act2);	

		
		a.setActAsign(actividades);
		b.setActAsign(actividades2);
		
		ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
		alumnos.add(a);
		alumnos.add(b);
		
		assertEquals(null,p.getAlumnosDePracticas());
		
		p.setAlumnos(alumnos);
		p.calificarAlumnos();
		
		assertEquals(true, act1.isApta());
		assertEquals(false, act2.isApta());
	}

}
