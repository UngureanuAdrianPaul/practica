package practicas;

import java.util.Scanner;

public class Palindromo {

	public static void main(String[] args) {

		System.out.println("Intoduce una palabra: ");
		Scanner teclado = new Scanner(System.in);
		String palabra = teclado.nextLine();
		char cadena[] = palabra.toCharArray();

		// Longitud par
		int j = cadena.length;
		int i = 0;
		boolean noEs = true;
		while (noEs && (i<cadena.length/2)) {
			j--;
			if (cadena[i] != cadena[j]) {
				noEs = false;
			}
			i++;
		}

		System.out.println("Es palindromo? " + noEs);

		teclado.close();

	}
}
