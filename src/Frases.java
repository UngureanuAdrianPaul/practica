import java.util.Scanner;

public class Frases {

	static final int CANTIDAD = 10;

	static String[] cadenas = new String[CANTIDAD];

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		for (int i = 0; i < CANTIDAD; i++) {

			System.out.println("Escribe una frase o palabra para la posición " + i + ": ");

			setValue(cadenas, i, teclado.nextLine());

		}
		System.out.print("La frase escrita anteriormente es:");

		for (int i = 0; i < CANTIDAD; i++) {

			System.out.print(" " + getValue(cadenas, i));

		}
		teclado.close();
	}

	static String getValue(String[] cadenas, int posicion) {

		return cadenas[posicion];

	}

	String getValue(int posicion) {

		return cadenas[posicion];

	}

	static void setValue(String[] cadenas, int posicion, String nuevaCadena) {
		cadenas[posicion] = nuevaCadena;

	}

}
