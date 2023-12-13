package practicas;

import java.util.Random;

public class Creator {

	// ATRIBUTOS

	private static String[] nombres = { "Daniel", "Andres", "Francisco", "Santiago", "Joseramon", "Ramon", "Dario",
			"Juancarlos", "Alvaro", "Janhin	", "Adrian", "Alejandro", "Simri" };

	private static String[] apellidos = { "Perez", "Ruiz", "Ungureanu", "Diaz", "Fernandez", "Garcia", "Campos",
			"Rodriguez", "Torres", "Villa" };

	private static String[] asistencia = { "PremiumPlus", "Online", "Presencial" };

	private static String[] tipoCurso = { "DAM", "DAW", "CiberSeguridad", "BigData" };

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			System.out.println(generadorNombre());
			System.out.println(newClase());
			
		}
	}

	// METODOS

	public static String generadorNombre() {

		Random aleatorio = new Random();

		int numNombre = aleatorio.nextInt(nombres.length);
		int numApellido1 = aleatorio.nextInt(apellidos.length);
		int numApellido2 = aleatorio.nextInt(apellidos.length);

		return (nombres[numNombre] + " " + apellidos[numApellido1] + " " + apellidos[numApellido2]);

	}

	public static int generadorEdad() {

		Random aleatorio = new Random();

		return (18 + aleatorio.nextInt(30));

	}

	public static String newClase() {
		
		Random aleatorio = new Random();
		
		
		return ("Tipo de asistencia: "+asistencia[aleatorio.nextInt(asistencia.length)] + ", Tipo de Curso: " + tipoCurso[aleatorio.nextInt(tipoCurso.length)]) ;
		
	}
}

// FIN GENERADOR
