
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

	public void insertarCoche(Coche coches) {
		if (numElem == miArray.length) {
			System.out.println("Array lleno, no se ha insertado elemento");
		} else {
			miArray[numElem] = coches;
			numElem++;
		}
	}

	public void destruirCoche(Coche coche) {

		if (numElem > 0) { // hay coches en el garaje
			boolean noEncontrado = true;
			int contador = 0;
			while (noEncontrado && (contador < numElem)) {
				if (miArray[contador] == coche) {
					noEncontrado = false;
				} else {
					contador++;
				}

			}

			if (contador == numElem) { // el coche no ha sido encontrado
				System.out.println("El coche: " + coche.getModelo() + " no se encuentra en el garaje");
			} else { // hemos encontrado el coche, lo tengo que borrar
				numElem--;
				for (int i = contador; i < numElem; i++) {
					miArray[i] = miArray[i + 1];
				}
				miArray[numElem] = null;
			}

		} else { // garaje vacio
			System.out.println("Garaje vacío");
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

	public static int getLongitudDefault() {
		return lONGITUD_DEFAULT;
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

	public void despedirIngeniero(Ingeniero ingeniero) {

		if (numElem > 0) { 
			boolean noEncontrado = true;
			int contador = 0;
			while (noEncontrado && (contador < numElem)) {
				if (miArray[contador] == ingeniero) {
					noEncontrado = false;
				} else {
					contador++;
				}

			}

			if (contador == numElem) {
				System.out.println("El ingeniero: " + ingeniero.getNombre() + " no se encuentra en el staff");
			} else {
				numElem--;
				for (int i = contador; i < numElem; i++) {
					miArray[i] = miArray[i + 1];
				}
				miArray[numElem] = null;
			}

		} else {
			System.out.println("Staff vacío");
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
	
	public void despedirMecanico(Mecanico mecanico) {

		if (numElem > 0) { 
			boolean noEncontrado = true;
			int contador = 0;
			while (noEncontrado && (contador < numElem)) {
				if (miArray[contador] == mecanico) {
					noEncontrado = false;
				} else {
					contador++;
				}

			}

			if (contador == numElem) { 
				System.out.println("El coche: " + mecanico.getNombre() + " no se encuentra en el garaje");
			} else {
				numElem--;
				for (int i = contador; i < numElem; i++) {
					miArray[i] = miArray[i + 1];
				}
				miArray[numElem] = null;
			}

		} else { 
			System.out.println("Garaje vacío");
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
	
	public void despedirPiloto(Piloto piloto) {

		if (numElem > 0) { 
			boolean noEncontrado = true;
			int contador = 0;
			while (noEncontrado && (contador < numElem)) {
				if (miArray[contador] == piloto) {
					noEncontrado = false;
				} else {
					contador++;
				}

			}

			if (contador == numElem) { 
				System.out.println("El coche: " + piloto.getNombre() + " no se encuentra en el garaje");
			} else {
				numElem--;
				for (int i = contador; i < numElem; i++) {
					miArray[i] = miArray[i + 1];
				}
				miArray[numElem] = null;
			}

		} else { 
			System.out.println("Garaje vacío");
		}
	}

}
