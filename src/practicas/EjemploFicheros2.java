package practicas;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class EjemploFicheros2 {

	public static void main(String[] args) throws IOException {

		FileInputStream entrada = null;
		FileOutputStream salida = null;
		Scanner teclado = new Scanner(System.in);

		String frase;
		char[] array;

		// INPUT
		try {
			entrada = new FileInputStream("pruebaFichero.txt");
			int asci = entrada.read();
			while (asci != -1) {
				System.out.print((char) asci + " ");
				asci = entrada.read();

			}

		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			if (entrada != null) {
				try {
					entrada.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

		// OUTPUT
		try {
			salida = new FileOutputStream("pruebaFichero.txt");

			System.out.println("Introuduce una frase: ");
			frase = teclado.nextLine();
			array = new char[frase.length()];

			for (int i = 0; i < frase.length(); i++) {
				salida.write((int) frase.charAt(i));
				array[i] = frase.charAt(i);
			
			}

		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			if (salida != null) {
				salida.close();
			}
		}

		teclado.close();
	}
}
