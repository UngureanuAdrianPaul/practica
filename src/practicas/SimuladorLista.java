package practicas;

import java.util.Random;

public class SimuladorLista {

	public static void main(String[] args) {

		Random aleatorio = new Random();

		MiArray original = new MiArray(100);

		// INSERTAR 100 NUMEROS

		for (int i = 0; i < 100; i++) {

			original.insertarValor(aleatorio.nextInt(100));

			System.out.print(original.getIntMiArray(i) + " ");

		}

		// SACAR LOS 10 PRIMEROS
		System.out.println();
		System.out.println();
		System.out.println("Los 10 primeros numeros son: ");

		for (int i = 0; i < 10; i++) {

			System.out.print(original.getIntMiArray(i) + " ");

		}

		// NUMEROS PARES
		System.out.println();
		System.out.println();
		System.out.println("Los números pares son: ");
		int numPares = 0;
		for (int i = 0; i < 100; i++) {

			if (original.getIntMiArray(i) % 2 == 0) {
				numPares++;
				System.out.print(original.getIntMiArray(i) + " ");
			}

		}
		System.out.println();
		System.out.println("Hay un total de " + numPares + " numeros Pares.");

		// NUMEROS IMPARES

		System.out.println();
		System.out.println("Los números impares son: ");
		int numImpares = 0;

		for (int i = 0; i < 100; i++) {

			if (original.getIntMiArray(i) % 2 != 0) {
				numImpares++;
				System.out.print(original.getIntMiArray(i) + " ");
			}

		}
		System.out.println();
		System.out.println("Hay un total de " + numImpares + " numeros Impares.");

		// DIVIDIMOS EN PARES E IMPARES

		// ARRAY DE PARES
		System.out.println();
		MiArray arrayPares = new MiArray(numPares);

		for (int i = 0; i < original.getNumElem(); i++) {

			if (original.getIntMiArray(i) % 2 == 0) {

				arrayPares.insertarValor(original.getIntMiArray(i));

			}
		}
		System.out.println("El array de pares es: ");
		for (int i = 0; i < numPares; i++) {

			System.out.print(arrayPares.getIntMiArray(i) + " ");
		}

		// ARRAY DE IMPARES
		System.out.println();
		System.out.println();
		MiArray arrayImpares = new MiArray(numImpares);

		for (int i = 0; i < original.getNumElem(); i++) {

			if (original.getIntMiArray(i) % 2 != 0) {

				arrayImpares.insertarValor(original.getIntMiArray(i));

			}
		}
		System.out.println("El array de impares es: ");
		for (int i = 0; i < numImpares; i++) {

			System.out.print(arrayImpares.getIntMiArray(i) + " ");
		}

		// ARRAY ORIGINAL RESETADO
		System.out.println();
		System.out.println();
		System.out.println("Array Original reseteado: ");

		for (int i = 0; i < original.getNumElem(); i++) {

			original.resetear();
			System.out.print(original.getIntMiArray(i) + " ");
		}

		// ARRAY ORIGINAL RELLENO

		for (int i = 0; i < original.getNumElem(); i++) {

			original
		}

	}

}

class MiArray {
	// ATRIBUTOS
	private int[] miArray;
	private int numElem;
	private static final int LONGITUD = 10;

	// CONSTRUCTOR

	MiArray(int longitud) {
		numElem = 0;
		miArray = new int[longitud];
		for (int i = 0; i < longitud; i++) {
			miArray[i] = -1;

		}

	}

	MiArray() {
		numElem = 0;
		miArray = new int[LONGITUD];
		for (int i = 0; i < LONGITUD; i++) {
			miArray[i] = -1;

		}

	}

	// METODOS
	public int getNumElem() {
		return numElem;
	}

	public void setNumElem(int numElem) {
		this.numElem = numElem;
	}

	public int[] getMiArray() {
		return miArray;

	}

	public int getIntMiArray(int posicion) {

		if (posicion < miArray.length && posicion >= 0) {
			return miArray[posicion];

		} else {
			return -1; // En caso de error al meter la posicion
		}

	}

	public void resetear() {

		for (int i = 0; i < numElem; i++) {
			miArray[i] = -1;

		}
	}

	public void insertarValor(int valor) {

		if (numElem == miArray.length) {
			System.out.println("Array lleno, no se ha insertado elemento");
		} else {
			miArray[numElem] = valor;
			numElem++;
		}

	}

	public int sacarValorUltimo() {

		if (numElem == 0) {
			return -1;
		} else {
			int temp = miArray[numElem - 1];
			numElem--;
			miArray[numElem] = -1;
			return temp;

		}
	}

	public int sacarValorPrimero() {

		if (numElem == 0) {
			return -1;
		} else {

			int temp = miArray[0];

			for (int i = 0; i < numElem - 1; i++)
				if (i < numElem - 1) {
					miArray[i] = miArray[i + 1];
				}
			miArray[numElem - 1] = -1;
			numElem--;

			return temp;
		}
	}

}
