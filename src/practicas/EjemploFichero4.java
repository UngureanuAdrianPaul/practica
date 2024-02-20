package practicas;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class EjemploFichero4 {
	public static void main(String[] args) throws IOException {

		FileReader entrada = null;
		char caracter;
		boolean nofin = true;

		try {
			entrada = new FileReader("pruebaFichero2.txt");
			caracter = (char) entrada.read();

			while (caracter != (char) -1) {
				System.out.print(caracter);
				caracter = (char) entrada.read();
			}

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} finally {
			if (entrada != null) {
				entrada.close();
			}
		}

		// pedir por pantalla cuantas lineas queremos sacar
		entrada = null;
		Scanner teclado = new Scanner(System.in);

		try {
			entrada = new FileReader("pruebaFichero2.txt");
			System.out.println("¿Cuántas líneas quieres mostrar?");
			char caracter2 = (char) entrada.read();
			int numLineas = teclado.nextInt();
			do {
				System.out.print(caracter2);
				caracter2 = (char) entrada.read();
				
				if (caracter2 == '\n') {
					numLineas--;
				}

			} while ((caracter2 != (char) -1) && (numLineas > 0));

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} finally {
			if (entrada != null) {
				entrada.close();
			}
		}

	} // fin main
}
