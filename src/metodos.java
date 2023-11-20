import java.util.Scanner;

public class metodos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int valor = 0;
		int max = 0;
		int min = 0;

		Scanner teclado = new Scanner(System.in);
		
		
		
		do {
		System.out.println("Introduzca un valor máximno: ");
		max = teclado.nextInt();
		System.out.println("Introduzca un valor mínimo: ");
		min = teclado.nextInt();
			
		} while (!metodos.maximominimo(max, min));
		
		
		do {
			System.out.println("Introduzca un valor cualquiera.");
			valor = teclado.nextInt();

		} while (!metodos.comprobarValor(max, min, valor));

		System.out.println("Es cierto que el valor " + valor + " esta entre " + min + " y " + max + " ?");
		System.out.println(metodos.comprobarValor(max, min, valor));
		teclado.close();
	}

	static boolean comprobarValor(int max, int min, int valor) {

		if (valor > max || valor < min) {
			return false;

		} else {
			return true;
		}
		
	}
	
	static boolean maximominimo (int max, int min) {
		
		if (max <= min ) {
			return false;
			
		} else {
			return true;
		}
	}
	
	static void HACEDOR() {
		
	}

}
