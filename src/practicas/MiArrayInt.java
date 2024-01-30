package practicas;

class MiArrayInt {
	// atributos
	private int[] miArray;
	private int numElem;
	private static final int lONGITUD_DEFAULT = 10;
	private int longitud;

	// constructores
	MiArrayInt(int longitud) {
		numElem = 0;
		miArray = new int[longitud];
		for (int i = 0; i < longitud; i = i + 1) {
			miArray[i] = -1;
		}

	}

	MiArrayInt() {
		numElem = 0;
		miArray = new int[lONGITUD_DEFAULT];
		for (int i = 0; i < miArray.length; i = i + 1) {
			miArray[i] = -1;
		}
	}

	// metodos
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
		if ((posicion < miArray.length) && (posicion >= 0)) {
			return miArray[posicion];
		} else {
			return -1; // en caso de error al meter la posición
		}
	}

	public void resetear() {
		for (int i = 0; i < miArray.length; i++) {
			miArray[i] = -1;
			numElem = 0;
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
		int temp;
		if (numElem == 0) {
			return -1;
		} else {
			numElem--;
			temp = miArray[numElem];
			miArray[numElem] = -1;
			return temp;

		}
	}

} // cierra MiArray

