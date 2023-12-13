package alumnocesur;

import practicas.Creator;

public class AlumnoCesur {

	// MAIN

	public static void main(String[] args) {
		
		Profesor teacher = new Profesor ("Daniel", 47,"DAM");
		System.out.println(teacher.getNombre());

		
		Clase premiumPlus = new Clase("Premium Plus");

		premiumPlus.setProfesor(teacher);
		for (int i = 0; i < 12; i++) {
			premiumPlus.add(new Alumno(Creator.generadorNombre(), Creator.generadorEdad(), "DAM"));
		}
		System.out.println(premiumPlus);

		// BUCLE DE ALUMNOS

		for (int i = 0; i < premiumPlus.getNumAlumnos(); i++) {

			System.out.println(premiumPlus.getAlumnos()[i]);

		}
		System.out.println();
		// BUCLE CAMBIA EDAD

		

		// BUCLE DAM Y DAW
		System.out.println();
		System.out.println("Los alumnos de DAM son: ");
		for (int i = 0; i < premiumPlus.getNumAlumnos(); i++) {
			if (premiumPlus.getAlumnos()[i].getCurso() == "DAM") {

				System.out.println(premiumPlus.getAlumnos()[i]);

			}
		}

		System.out.println();
		System.out.println("Los alumnos de DAW son: ");

		for (int i = 0; i < premiumPlus.getNumAlumnos(); i++) {
			if (premiumPlus.getAlumnos()[i].getCurso() == "DAW") {

				System.out.println(premiumPlus.getAlumnos()[i]);
			}
		}

		Clase presencial = new Clase("Presencial");

		for (int i = 0; i < presencial.getTotalalumnos(); i++) {

			presencial.add(new Alumno(Creator.generadorNombre(), Creator.generadorEdad(), "DAM"));

			System.out.println(presencial.getAlumnos()[i]);
		}

	}// FIN MAIN

} // FIN ALUMNOCESUR

// MAIN
