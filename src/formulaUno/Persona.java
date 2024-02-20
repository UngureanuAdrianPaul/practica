package formulaUno;

public class Persona implements Comparable {

	// ATRIBUTOS

	private int edad;
	private String nombre;
	private int dni;
	private int experiencia; // aumenta con las carreras
	// CONSTRUCTOR

	public Persona(int edad, String nombre, int dni) {
		super();
		this.edad = edad;
		this.nombre = nombre;
		this.dni = dni;
		this.experiencia = 0;
	}

	// GETTERS Y SETTERS

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDni() {
		return dni;
	}

	public int getExperiencia() {
		return experiencia;
	}

	public void aumentaExperiencia(int aumento) {
		this.experiencia = this.experiencia + aumento;
	}

	public String toString() {
		return ("[Nombre " + nombre + ", DNI: " + dni + ",edad: " + edad + ", experiencia: " + experiencia + "]");
	}

	// Sobreescrito equals
	public boolean equals(Object object) {

		if (object instanceof Persona) {

			return (this.dni == ((Persona) object).dni);

		} else {
			return false;
		}

	}

	public int hasCode() {

		return dni;

	}

	@Override
	public int compareTo(Object o) {
		
		
		
		return 0;
	}
	

}
