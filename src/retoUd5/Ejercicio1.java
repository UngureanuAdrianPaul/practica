package retoUd5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio1 {

	public static void main(String[] args) {

	} // fin MAIN

	// METODOS

	static boolean leerDeFichero(File miFichero) throws IOException {

		FileReader entrada = null;

		try {
			entrada = new FileReader(miFichero);
			int caracter = entrada.read();
			while (caracter != -1) {
				System.out.println((char) caracter);
				caracter = entrada.read();

			}

			return true;
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			return false;
		} finally {
			if (entrada != null) {
				entrada.close();
			}
		}
	}

	static boolean leerDeFichero(String miFichero) throws IOException {

		FileReader entrada = null;
		try {
			entrada = new FileReader(miFichero);
			int caracter = entrada.read();

			while (caracter != -1) {
				System.out.println((char) caracter);
				caracter = entrada.read();
			}

			return true;
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			return false;
		} finally {
			if (entrada != null) {
				entrada.close();
			}
		}
	}

	static boolean escribirEnFichero(String miFichero) throws IOException {

		FileWriter salida = null;

		try {
			salida = new FileWriter(miFichero);

			for (int i = 0; i < 11; i++) {
				salida.write((char) i);
				salida.write('\n');
			}

			return true;
		} catch (IOException e) {
			System.out.println(e.getMessage());
			return false;
		} finally {
			if (salida != null) {
				salida.close();
			}
		}
	}

	static boolean escribirEnFichero(File miFichero) throws IOException {

		FileWriter salida = null;

		try {
			salida = new FileWriter(miFichero);

			for (int i = 0; i < 11; i++) {
				salida.write((char) i);
				salida.write('\n');
			}

			return true;
		} catch (IOException e) {
			System.out.println(e.getMessage());
			return false;
		} finally {
			if (salida != null) {
				salida.close();
			}
		}
	}

	static boolean borrarFichero(File miFichero) {

		return miFichero.delete();

	}

	static boolean borrarFichero(String miFichero) {

		File fichero = new File(miFichero);

		return fichero.delete();
	}

	static boolean comprobarExiste(File fichero) {

		return fichero.exists();
	}
	
	static boolean comporbarExiste(String fichero) {
		File miFichero = new File(fichero);
		
		return miFichero.exists();
	}

	static boolean duplicarFicheros(File origen, File destino) throws IOException {
		
		FileReader entrada = null;
		FileWriter salida = null;
		
		try {
			entrada = new FileReader(origen);
			salida = new FileWriter(destino);
			
			int caracter = entrada.read();
			
			while (caracter != -1) {
				salida.write((char) caracter);
				caracter = entrada.read();
			}
			
			
			return true;
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			return false;
		} catch (IOException e) {
			System.out.println(e.getMessage());
			return false;
		} finally {
			if (entrada != null) {
				entrada.close();
			}
			
			if (salida != null) {
				salida.close();
			}
		} 
		
	}
	
	
} // fin CLASE
