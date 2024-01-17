package practicas;

public class SimuladorLista {

	public static void main(String[] args) {

		MiArray array1 = new MiArray(100);
		for (int i = 0; i < 100; i++) {

			array1.insertarValor(i);

			System.out.println(array1.getIntMiArray(i));
		}

		System.out.println("NumElems: " + array1.getNumElem());

	}

}

class MiArray {
	// ATRIBUTOS
	public int[] miArray;
	public int numElem;
	public static final int LONGITUD = 10;

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

		for (int i = 0; i < LONGITUD; i++) {
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