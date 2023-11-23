import java.util.Random;

public class arrays {

	public static void main(String[] args) {
		HACEDOR();

	}
	static void HACEDOR() {
	// DECLARACION DE VARIABLES

	int[] listaInteger = new int[10];
	int[] listaPares;
	int[] listaImpares;
	int numPares = 0;
	int numImpares = 0;
	int contPar = 0;
	int contImpar = 0;
	Random aleatorio;
	aleatorio = new Random();

	// BUCLE para dar valor a cada elemento del array y después
	// ver cuantos numeros impares y pares hay

	System.out.print("El array inicial es:[");

	for (int i = 0; i < listaInteger.length; i++) {

		listaInteger[i] = aleatorio.nextInt(1000);
		System.out.print(listaInteger[i] + ",");

		if (listaInteger[i] % 2 == 0) {

			numPares++;

		} else {
			numImpares++;

		}

	}
	System.out.println("]");
	// Decimos que congitud tiene la nueva lista de pares e impares usando la
	// longitud antes
	// obtenida

	listaPares = new int[numPares];
	listaImpares = new int[numImpares];

	System.out.println("Hay un total de " + numPares + " números pares.");
	System.out.println("Hay un total de " + numImpares + " números pares.");

	// BUCLE DE ORDENACION ASCENDENTE

	for (int i = 0; i < listaInteger.length; i++) {

		for (int j = 0; j < (listaInteger.length - 1 - i); j++) {

			if (listaInteger[j] < listaInteger[j + 1]) {

				int aux = listaInteger[j];
				listaInteger[j] = listaInteger[j + 1];
				listaInteger[j + 1] = aux;
			}

		}

	}

	// SEPARACION ENTRE PARES E IMPARES

	for (int i = 0; i < listaInteger.length; i++) {

		if (listaInteger[i] % 2 == 0) {
			listaPares[contPar] = listaInteger[i];
			contPar++;
		} else {
			listaImpares[contImpar] = listaInteger[i];
			contImpar++;

		}

	}

	// Imprimir por pantalla los números pares e impares

	System.out.print("El array de números ordenados es:[");

	for (int i = 0; i < listaPares.length; i++) {

		System.out.print(listaPares[i] + ",");

	}
	System.out.println("]");

	System.out.print("El array de impares ordenados es:[");

	for (int i = 0; i < listaImpares.length; i++) {

		System.out.print(listaImpares[i] + ",");

	}
	System.out.print("]");
	
	} //MAIN FIN
	static void imprimeArray (int[] array) {
		System.out.println();
		
	}
}
 	

	
	
		
	
	
