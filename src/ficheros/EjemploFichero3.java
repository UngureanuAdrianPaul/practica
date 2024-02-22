package ficheros;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class EjemploFichero3 {
	public static void main(String[] args) throws IOException {

		FileReader entrada = null;
		Scanner teclado = new Scanner(System.in);

		boolean nofin = true;
		char caracter;

		// LEEMOS FICHERO
		try {
			entrada = new FileReader("pruebaFichero.txt");
			caracter = (char) entrada.read();

			while (caracter != (char) -1) {

				System.out.print(caracter);
				caracter = (char) entrada.read();
			}

			do {

				caracter = (char) entrada.read();

				if (caracter == (char) -1) {
					nofin = false;
				} else {

					System.out.print(caracter);
				}

			} while (nofin);

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} finally {
			if (entrada != null) {
				entrada.close();
			}
		} // fin try-catch

		// ESCRIBIMOS LA FRASE
		String frase = "Esto es una prueba de escritura en fichero";
		char[] fraseArray = new char[frase.length()];

		FileOutputStream salida = null;

		try {
			salida = new FileOutputStream("pruebaFichero.txt", true);

			for (int i = 0; i < fraseArray.length; i++) {
				fraseArray[i] = frase.charAt(i);

			}

			for (int i = 0; i < fraseArray.length; i++) {
				salida.write((int) fraseArray[i]);
			}
			salida.write('\n');

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());

		} finally {
			if (salida != null) {
				salida.close();
			}
		} // fin del try-catch

		// PEDIMOS POR PANTALLA

		String frase2;
		char[] array2;

		try {

			salida = new FileOutputStream("pruebaFichero.txt", true);
			do {
				System.out.println();
				System.out.println("Introduce una frase: ");
				frase2 = teclado.nextLine();
				array2 = new char[frase2.length()];
				for (int i = 0; i < array2.length; i++) {
					array2[i] = frase2.charAt(i);
				}

				salida.write('\n');
				for (int i = 0; i < array2.length; i++) {
					salida.write((int) array2[i]);
				}
			} while (frase2.charAt(0) != 'Q' || ((frase2.length() > 0) && frase2.length() != 1));

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} finally {
			if (salida != null) {
				salida.close();
			}
		}

		teclado.close();
	}

}
