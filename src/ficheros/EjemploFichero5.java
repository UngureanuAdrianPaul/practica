package ficheros;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class EjemploFichero5 {
	public static void main(String[] args) throws IOException {

		DataOutputStream salida = null;

		try {
			salida = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("ficheroDatosGenericos.txt")));
			salida.writeChar('a');
			salida.writeBoolean(true);
			salida.writeUTF("frase en UTF");

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} finally {
			if (salida != null) {
				salida.close();
			}
		}

		DataInputStream entrada = null;

		try {
			entrada = new DataInputStream(new BufferedInputStream(new FileInputStream("ficheroDatosGenericos.txt")));
			System.out.println(entrada.readChar());
			System.out.println(entrada.readBoolean());
			System.out.println(entrada.readUTF());

			// En la lectura hay que leer de forma ordenada, tal y como lo hemos introducido
			// en el OutputStream

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());

		} finally {
			if (entrada != null) {
				entrada.close();

			}
		}

	}

}
