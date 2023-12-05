
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

class Clase {

	// ATRIBUTOS

	private int numAlumnos;
	private Alumno[] alumnos;
	private static final int TOTALALUMNOS = 15;
	private String nombre;

	// GETTERS Y SETTERS

	public int getNumAlumnos() {
		return numAlumnos;
	}

	public void setNumAlumnos(int numAlumnos) {
		this.numAlumnos = numAlumnos;
	}

	public Alumno[] getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(Alumno[] alumnos) {
		this.alumnos = alumnos;
	}

	public static int getTotalalumnos() {
		return TOTALALUMNOS;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	// CONSTRUCTOR

	public Clase(String nombre) {

		numAlumnos = 0;

		alumnos = new Alumno[TOTALALUMNOS];

		this.nombre = nombre;

	}

	// METODOS

	public String toString() {

		return ("[Clase: " + nombre + ", NumAlumnos: " + numAlumnos + "]");
	}

	public void add(Alumno nuevoAlu) {

		if (numAlumnos < TOTALALUMNOS) {
			alumnos[numAlumnos] = nuevoAlu;

			numAlumnos++;
		}

	}

	public void delete(String nombre) {

		for (int i = 0; i < getNumAlumnos(); i++) {
			if (getAlumnos()[i].getNombre() == nombre) {
				
				

			}
		}
	}

} // fin CLASE

public class AlumnoCesur {

	// MAIN

	public static void main(String[] args) {

		Alumno adrian = new Alumno("Adrian", 25, "DAM");
		Alumno ramon = new Alumno("Ramon", 24, "DAM");
		Alumno santi = new Alumno("Santiago", 22, "DAM");
		Alumno fran = new Alumno("Francisco", 18, "DAM");
		Alumno andres = new Alumno("Andres", 20, "DAM");
		Alumno juanca = new Alumno("Juan Carlos", 24, "DAM");
		Alumno alvaro = new Alumno("Alvaro", 18, "DAM");
		Alumno janhin = new Alumno("Janhin", 27, "DAM");
		Alumno alex = new Alumno("Alejandro", 23, "DAM");
		Alumno simri = new Alumno("Simranjeet", 23, "DAM");
		Alumno dario = new Alumno("Dario", 17, "DAW");
		Alumno joseRamon = new Alumno("Jose Ramon", 39, "DAW");
		Alumno juanan = new Alumno("Juan Antonio", 26, "DAW");

		System.out.println(adrian);

		Clase premiumPlus = new Clase("Premium Plus");

		premiumPlus.add(adrian);
		premiumPlus.add(ramon);
		premiumPlus.add(santi);
		premiumPlus.add(fran);
		premiumPlus.add(andres);
		premiumPlus.add(juanca);
		premiumPlus.add(alvaro);
		premiumPlus.add(janhin);
		premiumPlus.add(alex);
		premiumPlus.add(simri);
		premiumPlus.add(dario);
		premiumPlus.add(joseRamon);
		premiumPlus.add(juanan);

		System.out.println(premiumPlus);

		// BUCLE DE ALUMNOS

		for (int i = 0; i < premiumPlus.getNumAlumnos(); i++) {

			System.out.println(premiumPlus.getAlumnos()[i]);

		}
		System.out.println();
		// BUCLE CAMBIA EDAD

		for (int i = 0; i < premiumPlus.getNumAlumnos(); i++) {
			if (premiumPlus.getAlumnos()[i].getNombre() == "Dario") {

				dario.setEdad(18);
				System.out.println(dario);
			}

		}

		// BUCLE DAM Y DAW
		System.out.println();
		System.out.println("Los alumnos de DAM son: ");
		for (int i = 0; i < premiumPlus.getNumAlumnos(); i++) {
			if (premiumPlus.getAlumnos()[i].getCurso() == "DAM") {

				System.out.println(premiumPlus.getAlumnos()[i]);

			}
		}

		System.out.println();
		System.out.println("Los alumnos de DAW son: ");

		for (int i = 0; i < premiumPlus.getNumAlumnos(); i++) {
			if (premiumPlus.getAlumnos()[i].getCurso() == "DAW") {

				System.out.println(premiumPlus.getAlumnos()[i]);
			}
		}

	}// FIN MAIN

} // FIN ALUMNOCESUR
