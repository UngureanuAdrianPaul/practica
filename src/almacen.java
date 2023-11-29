import java.util.Random;
import java.util.Scanner;

public class almacen {

	// Decalaramos variables genericas

	static final int TOTALNUM = 10;
	static int[] arrayEnteros = new int[TOTALNUM];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pideNumeros();
		imprimeNumeros();
		cambiarApar();

	}

	// Primer método: Solicita TOTALNUM y los almacena en array de int.

	static void pideNumeros() {

		Random aleatorio;
		aleatorio = new Random();

		System.out.print("Introduce 10 números:[ ");

		for (int i = 0; i < arrayEnteros.length; i++) {

			arrayEnteros[i] = aleatorio.nextInt(100);
			System.out.print(arrayEnteros[i] + " ");

		}
		System.out.println("]");
	}

	// Segundo método: Imprime del array de int solo los pares

	static void imprimeNumeros() {
		System.out.print("El array de números pares es: [ ");

		for (int i = 0; i < arrayEnteros.length; i++) {

			if (arrayEnteros[i] % 2 == 0) {
				System.out.print(arrayEnteros[i] + " ");
			}

		}
		System.out.println("]");
	}

	// Tercer método: Modifica el array poniendo todos los números pares, es decir,
	// si el numero es par lo mantiene, si no es par guarda el numero par siguiente
	// en esa posicion.

	static void cambiarApar() {

		System.out.print("El nuevo array modificado es:[ ");

		for (int i = 0; i < arrayEnteros.length; i++) {

			if (arrayEnteros[i] % 2 != 0) {

				arrayEnteros[i] = arrayEnteros[i] + 1;

			}
			System.out.print(arrayEnteros[i] + " ");

		}
		System.out.println("]");
	}

	// Cuarto método: pone a cero todos los números del array

	static void reseteaNumeros() {

		System.out.print("[ ");

		for (int i = 0; i < arrayEnteros.length; i++) {
			arrayEnteros[i] = 0;
			System.out.print(arrayEnteros[i] + " ");

		}
		System.out.println(" ]");
	}

	// Quinto método: pon a x el array

	static void reseteaNumerosX(int x) {

		System.out.print("[ ");

		for (int i = 0; i < arrayEnteros.length; i++) {
			arrayEnteros[i] = x;
			System.out.print(arrayEnteros[i] + " ");

		}
		System.out.println(" ]");
	}



	static void valorDesde(int x) {
		
	}
}
