package alumnoCesur;

import practicas.Creator;
import java.util.Random;

public class AlumnoCesur {

	// MAIN

	public static void main(String[] args) {
		/*
		 * Persona pringao2 = new Alumno("Pedro Picapiedra", 16, "DAM");
		 * 
		 * Object pringao3 = new Alumno("Pedro Picapiedra", 16, "DAM");
		 * 
		 * System.out.println(pringao2.getClass());
		 * System.out.println(pringao3.getClass());
		 * 
		 * System.out.println(pringao2 instanceof Alumno);
		 * 
		 */

		// CONSTRIUMOS CENTRO CESUR ESTE

		CentroEstudio cesurEste = new CentroEstudio("CESUR EL PALO", 5, 4);

		System.out.println(cesurEste);

		// Creamos las 5 clases

		Clase claseTemp;
		Random aleatorio = new Random();
		String nombreClaseTemp;

		// Creamos los administrativos

		for (int i = 0; i < 5; i++) {
			nombreClaseTemp = Creator.newClase();
			claseTemp = new Clase(nombreClaseTemp);

			claseTemp.setProfesor(new Profesor(Creator.generadorNombre(), Creator.generadorEdad(), nombreClaseTemp));
			System.out.println(claseTemp);
			
			for (int j = 0; j < 15; j++) {

				claseTemp.add(new Alumno(Creator.generadorNombre(), Creator.generadorEdad(), nombreClaseTemp));
				
				System.out.println(claseTemp.getAlumnos()[j]);
			}
			cesurEste.getClases()[i] = claseTemp;
			
			System.out.println(cesurEste.getClases()[i]);
		}

		for (int i = 0; i < 4; i++) {

			cesurEste.getAdministrativos()[i] = new Administrativo(Creator.generadorNombre(), Creator.generadorEdad(),
					aleatorio.nextBoolean());
			
	
			

		}
		System.out.println(cesurEste);

	}// FIN MAIN

} // FIN ALUMNOCESUR

// MAIN
