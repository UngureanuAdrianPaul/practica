package alumnocesur;

class Alumno {

	// ATRIBUTOS

	private String nombre;
	private int edad;
	private String curso;

	// GETTERS Y SETTERS

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	// CONSTRUCTOR

	public Alumno(String nombre, int edad, String curso) {
		this.nombre = nombre;
		this.edad = edad;
		this.curso = curso;
	}

	public String toString() {

		return ("[Alumno: " + nombre + ", Edad: " + edad + ", Curso " + curso + "]");

	}

} // fin ALUMNO