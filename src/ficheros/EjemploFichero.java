package ficheros;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class EjemploFichero {

	public static void main(String[] args) throws IOException {

		FileInputStream entrada = null;
		FileOutputStream salida = null;

		try {
			entrada = new FileInputStream("pruebaFichero.txt");
			int asci = entrada.read();
			while (asci != -1) {
				System.out.println((char) asci + " ");
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
		try {
			salida = new FileOutputStream("pruebaFichero.txt");
			salida.write((int) 'H');

		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			if (salida != null) {
				salida.close();
			}
		}
	}
}
