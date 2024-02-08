package formulaUno;

import practicas.Creator;

public class PruebaPersona {

	public static void main(String[] args) {

				// INGENIERO A
		ArrayIngeniero ingenieroA = new ArrayIngeniero();
		System.out.println("NumElem inicial del constructor por defecto es: " + (ingenieroA.getNumElem() == 0));
		System.out.println("La longitud del array debe ser de: " + ingenieroA.getLongitudDefault() + " : "
				+ (ingenieroA.getLongitudDefault() == ingenieroA.getMiArray().length));
		// Listado del Array usando GET INT MI ARRAY
		for (int i = 0; i < ingenieroA.getMiArray().length; i++) {
			System.out.print(ingenieroA.getIntMiArray(i) + " ");
		}
		System.out.println();
		// Listado del array usando GET MY ARRAY

		for (int i = 0; i < ingenieroA.getMiArray().length; i++) {
			System.out.print(ingenieroA.getMiArray()[i] + " ");
		}

		// LLENAMOS EL ARRAY

		for (int i = 0; i < 6; i++) {

			ingenieroA.insertarValor(new Ingeniero(20 + i, Creator.generadorNombre(), 100 + i));
			System.out.print("El ingeniero de la posición: " + i + " es: ");
			System.out.println(ingenieroA.getIntMiArray(i).toString());
		}

		System.out.println("Reseteamos a NULL el array: ");
		ingenieroA.resetear();
		System.out.println("NumElem: " + ingenieroA.getNumElem());
		for (int i = 0; i < 6; i++) {

			ingenieroA.insertarValor(new Ingeniero(20 + i, Creator.generadorNombre(), 100 + i));
			System.out.println("El ingeniero de la posición: " + i + " es: ");
			System.out.println(ingenieroA.getIntMiArray(i));
		}

		System.out.println("PRUEBA PARA COMPROBAR TODAS LAS POSIBILIDADES DE DESPEDIR A UN INGENIERO.");
		System.out.println("   Primera posibilidad: despedir un ingeniero en un array vacío");
		ingenieroA.despedirIngeniero(new Ingeniero(26, "Pedro", 123));
		System.out.println("   Segunda posibilidad: despedir un ingeniero que no esté");
		for (int i = 0; i < 6; i++) {
			ingenieroA.insertarValor(new Ingeniero(20 + i, Creator.generadorNombre(), 100 + i));
		}
		ingenieroA.despedirIngeniero(new Ingeniero(26, "Pedro", 123));
		System.out.println("   Tercera posibilidad: despedir un ingeniero que esté en el staff");
		System.out.println("      a) array lleno.");
		System.out.println("         1) ultima posicion.");
		System.out.println("NumElem antes: " + ingenieroA.getNumElem());
		ingenieroA.despedirIngeniero(ingenieroA.getIntMiArray(ingenieroA.getNumElem()-1));
		System.out.println("valor en posición ultima: " + ingenieroA.getIntMiArray(ingenieroA.getNumElem()));
		System.out.println("NumElem después: " + ingenieroA.getNumElem());

		
		
				// INGENIERO B

		System.out.println();
		ArrayIngeniero ingenieroB = new ArrayIngeniero(10);
		System.out.println(
				"NumElem inicial del constructor con parametro de longitud es: " + (ingenieroB.getNumElem() == 0));
		System.out.println("La longitud del array debe ser de 10: " + (10 == ingenieroB.getMiArray().length));

		// Listado del Array usando GET INT MI ARRAY
		for (int i = 0; i < ingenieroB.getMiArray().length; i++) {
			System.out.print(ingenieroB.getIntMiArray(i) + " ");
		}
		System.out.println();
		// Listado del array usando GET MY ARRAY

		for (int i = 0; i < ingenieroB.getMiArray().length; i++) {
			System.out.print(ingenieroB.getMiArray()[i] + " ");
		}
	}

}
