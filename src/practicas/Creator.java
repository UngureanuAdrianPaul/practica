package practicas;

import java.util.Random;


public class Creator {

	// ATRIBUTOS

	private static String[] nombres = { "Daniel", "Andres", "Francisco", "Santiago", "Joseramon", "Ramon", "Dario",
			"Juancarlos", "Alvaro", "Janhin	", "Adrian", "Alejandro", "Simri" };

	private static String[] apellidos = { "Perez", "Ruiz", "Ungureanu", "Diaz", "Fernandez", "Garcia", "Campos",
			"Rodriguez", "Torres", "Villa" };

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			System.out.println(generadorNombre());
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
	}
	

 // FIN GENERADOR
