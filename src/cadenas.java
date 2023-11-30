
public class cadenas {

	// Con STRING NO se actualiza la informacion con la antigua en diferentes
	// metodos con el mismo nombre de variable. Al contrario que los ARRAYS donde SÍ
	// se guarda la info metida en un metodo primero y se actuliza para el siguente

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(uneCadenas("hola ", uneCadenas("adios", uneCadenas(" que", " tal"))));
		pasoCadenaA("hola ADIoS", true);
		System.out.println(numOcurrencias(" hola mundo", 'u'));

	}
	// Devuelve un String que es la union de los parametros de entrada.

	// ((Cuando NO tengo un VOID hay que poner un return))

	// PUEDO usar System.out.print con ese metodo y sus variables

	static String uneCadenas(String cadena1, String cadena2) {

		return cadena1 + cadena2;

	}

	// Modifica el String de entrada a mayusculas o minusculas dependiendo del
	// segundo parametro

	// Cuando el metodo tiene VOID NO puedo usar System.out.print con esas varibles,
	// tengo que asignar

	// al metodo lo que vale cada varible y luego imprimir APARTE el contenido de
	// esa variable

	static void pasoCadenaA(String cadena, boolean mayus) {

		if (mayus) {

			cadena = cadena.toUpperCase();

		} else {
			cadena = cadena.toLowerCase();

		}
		System.out.println(cadena);
	}

	// Devuleve el numero de caracteres que se repiten pasado como parametro en el
	// strig
	static int numOcurrencias(String cadena, char caracter) {
		int num = 0;

		for (int i = 0; i < cadena.length(); i++) {

			if (cadena.charAt(i) == caracter) {
				num++;
			}

		}
		return num;
	}

}
