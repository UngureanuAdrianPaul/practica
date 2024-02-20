package practicas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class EjemploBuffer {

	public static void main(String[] args) throws IOException {

		BufferedReader entrada = null;
		BufferedWriter salida = null;
		PrintWriter salida2 = null;
		try {
			entrada = new BufferedReader(new FileReader("pruebaFichero2.txt"));
			salida = new BufferedWriter(new FileWriter("copiaFichero.txt"));
			salida2 = new PrintWriter(new FileWriter("copiaFichero2.txt"));

			String linea;
			int numLinea = 4;
			while (numLinea > 0) {
				linea = entrada.readLine();
				if (numLinea % 2 == 0) {
					salida.write(linea);
				} else {
					salida2.println(linea);
				}

				numLinea--;
			}

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());

		} finally {
			if (entrada != null) {
				entrada.close();
			}
			if (salida != null) {
				salida.close();

			}
			if (salida2 != null) {
				salida2.close();
			}

		}

	}
}
