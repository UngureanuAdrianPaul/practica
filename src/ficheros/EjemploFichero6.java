package ficheros;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import animales.Animal;

public class EjemploFichero6 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Animal perro = new Animal(32, "Perro");
		Animal gato = new Animal(22, "Gato");
		Animal pajaro = new Animal(10, "Pajaro");
		Animal pez = new Animal(342, "Pez");
		// OUTPUT
		ObjectOutputStream salida = null;

		try {
			salida = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("ficheroObjetos.txt")));
			salida.writeObject(perro);
			salida.writeObject(gato);
			salida.writeObject(pajaro);
			salida.writeObject(pez);
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} finally {
			if (salida != null) {
				salida.close();
			}
		}
		// INPUT
		Animal generico = null;
		int contador = 0;

		ObjectInputStream entrada = null;
		try {
			entrada = new ObjectInputStream(new BufferedInputStream(new FileInputStream("ficheroObjetos.txt")));

			// leer y almacenar todos los animales que hay en el fichero
			generico = (Animal) entrada.readObject();
			while (generico != null) {
				generico = (Animal) entrada.readObject();
				System.out.println(generico.getNombre());
				contador ++;
			}

		} catch (EOFException e) {
			System.out.println(e.getMessage());
		}

		finally {
			if (entrada != null) {
				entrada.close();

			}
		}

	} // fin main

}
