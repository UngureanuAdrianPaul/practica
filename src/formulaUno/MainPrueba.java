package formulaUno;

public class MainPrueba {

	public static void main(String[] args) {
		
		Persona persona1 = new Persona(18, "David", 1);
		Persona persona2 = new Persona(19, "Juan", 1);
		Persona persona3 = new Persona(20, "Luis", 3);
		
		Mecanico mec1 = new Mecanico(21, "Jose", 1);
		Mecanico mec2 = new Mecanico(21, "Jose", 1);
		
		System.out.println("Caso == : " + (persona1 == persona2));
		System.out.println("Caso equals:  " + (persona1.equals(persona3)));
		
		System.out.println("Caso == : " + (mec1 == mec2));
		System.out.println("Caso equals:  " + (mec1.equals(persona1)));
		System.out.println("Caso equals:  " + (persona1.equals(mec1)));
		
		
		
		
		
		
	}

}
