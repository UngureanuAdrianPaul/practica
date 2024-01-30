package formulaUno;

class ArrayCoche {

	private Coche[] miArray;
	private int numElem;
	private static final int lONGITUD_DEFAULT = 2;
	private int longitud;

	// constructores
	ArrayCoche(int longitud) {
		numElem = 0;
		miArray = new Coche[longitud];
		for (int i = 0; i < longitud; i = i + 1) {
			miArray[i] = null;
		}

	}

	ArrayCoche() {
		numElem = 0;
		miArray = new Coche[lONGITUD_DEFAULT];
		for (int i = 0; i < miArray.length; i = i + 1) {
			miArray[i] = null;
		}
	}

	// metodos
	public int getNumElem() {
		return numElem;
	}

	public void setNumElem(int numElem) {
		this.numElem = numElem;
	}

	public Coche[] getMiArray() {
		return miArray;
	}

	public Coche getIntMiArray(int posicion) {
		if ((posicion < miArray.length) && (posicion >= 0)) {
			return miArray[posicion];
		} else {
			return null; // en caso de error al meter la posición
		}
	}

	public void resetear() {
		for (int i = 0; i < miArray.length; i++) {
			miArray[i] = null;
			numElem = 0;
		}

	}

	public void insertarValor(Coche coches) {
		if (numElem == miArray.length) {
			System.out.println("Array lleno, no se ha insertado elemento");
		} else {
			miArray[numElem] = coches;
			numElem++;
		}
	}

}

class ArrayIngeniero {

	private Ingeniero[] miArray;
	private int numElem;
	private static final int lONGITUD_DEFAULT = 6;
	private int longitud;

	// constructores
	ArrayIngeniero(int longitud) {
		numElem = 0;
		miArray = new Ingeniero[longitud];
		for (int i = 0; i < longitud; i = i + 1) {
			miArray[i] = null;
		}

	}

	ArrayIngeniero() {
		numElem = 0;
		miArray = new Ingeniero[lONGITUD_DEFAULT];
		for (int i = 0; i < miArray.length; i = i + 1) {
			miArray[i] = null;
		}
	}

	// metodos
	public int getNumElem() {
		return numElem;
	}

	public void setNumElem(int numElem) {
		this.numElem = numElem;
	}

	public Ingeniero[] getMiArray() {
		return miArray;
	}

	public Ingeniero getIntMiArray(int posicion) {
		if ((posicion < miArray.length) && (posicion >= 0)) {
			return miArray[posicion];
		} else {
			return null; // en caso de error al meter la posición
		}
	}

	public void resetear() {
		for (int i = 0; i < miArray.length; i++) {
			miArray[i] = null;
			numElem = 0;
		}

	}

	public void insertarValor(Ingeniero ingenieros) {
		if (numElem == miArray.length) {
			System.out.println("Array lleno, no se ha insertado elemento");
		} else {
			miArray[numElem] = ingenieros;
			numElem++;
		}
	}

}

class ArrayMecanico {

	private Mecanico[] miArray;
	private int numElem;
	private static final int lONGITUD_DEFAULT = 4;
	private int longitud;

	// constructores
	ArrayMecanico(int longitud) {
		numElem = 0;
		miArray = new Mecanico[longitud];
		for (int i = 0; i < longitud; i = i + 1) {
			miArray[i] = null;
		}

	}

	ArrayMecanico() {
		numElem = 0;
		miArray = new Mecanico[lONGITUD_DEFAULT];
		for (int i = 0; i < miArray.length; i = i + 1) {
			miArray[i] = null;
		}
	}

	// metodos
	public int getNumElem() {
		return numElem;
	}

	public void setNumElem(int numElem) {
		this.numElem = numElem;
	}

	public Mecanico[] getMiArray() {
		return miArray;
	}

	public Mecanico getIntMiArray(int posicion) {
		if ((posicion < miArray.length) && (posicion >= 0)) {
			return miArray[posicion];
		} else {
			return null; // en caso de error al meter la posición
		}
	}

	public void resetear() {
		for (int i = 0; i < miArray.length; i++) {
			miArray[i] = null;
			numElem = 0;
		}

	}

	public void insertarValor(Mecanico mecanicos) {
		if (numElem == miArray.length) {
			System.out.println("Array lleno, no se ha insertado elemento");
		} else {
			miArray[numElem] = mecanicos;
			numElem++;
		}
	}

}

class ArrayPiloto {

	private Piloto[] miArray;
	private int numElem;
	private static final int lONGITUD_DEFAULT = 2;
	private int longitud;

	// constructores
	ArrayPiloto(int longitud) {
		numElem = 0;
		miArray = new Piloto[longitud];
		for (int i = 0; i < longitud; i = i + 1) {
			miArray[i] = null;
		}

	}

	ArrayPiloto() {
		numElem = 0;
		miArray = new Piloto[lONGITUD_DEFAULT];
		for (int i = 0; i < miArray.length; i = i + 1) {
			miArray[i] = null;
		}
	}

	// metodos
	public int getNumElem() {
		return numElem;
	}

	public void setNumElem(int numElem) {
		this.numElem = numElem;
	}

	public Piloto[] getMiArray() {
		return miArray;
	}

	public Piloto getIntMiArray(int posicion) {
		if ((posicion < miArray.length) && (posicion >= 0)) {
			return miArray[posicion];
		} else {
			return null; // en caso de error al meter la posición
		}
	}

	public void resetear() {
		for (int i = 0; i < miArray.length; i++) {
			miArray[i] = null;
			numElem = 0;
		}

	}

	public void insertarValor(Piloto pilotos) {
		if (numElem == miArray.length) {
			System.out.println("Array lleno, no se ha insertado elemento");
		} else {
			miArray[numElem] = pilotos;
			numElem++;
		}
	}

}
