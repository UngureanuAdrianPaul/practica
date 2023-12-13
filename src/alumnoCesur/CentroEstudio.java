package alumnoCesur;

public class CentroEstudio {

	// ATRIBUTOS

	private String nombre;
	private Administrativo[] administrativos;
	private Clase[] clases;
	private final int MAX_CLASES;
	private final int MAX_ADMIN;

	// CONSTRUCTOR

	public CentroEstudio(String nombre, int mAX_CLASES, int mAX_ADMIN) {
		super();
		this.nombre = nombre;
		MAX_CLASES = mAX_CLASES;
		MAX_ADMIN = mAX_ADMIN;
		this.administrativos = new Administrativo[MAX_ADMIN];
		this.clases = new Clase[MAX_CLASES];

	}

	public CentroEstudio(String nombre) {
		MAX_ADMIN = 10;
		MAX_CLASES = 10;
		administrativos = new Administrativo[MAX_ADMIN];
		clases = new Clase[MAX_CLASES];
		this.nombre = nombre;
	}

	// GETTERS Y SETTERS

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Administrativo[] getAdministrativos() {
		return administrativos;
	}

	public void setAdministrativos(Administrativo[] administrativos) {
		this.administrativos = administrativos;
	}

	public Clase[] getClases() {
		return clases;
	}

	public void setClases(Clase[] clases) {
		this.clases = clases;
	}

	public int getMAX_CLASES() {
		return MAX_CLASES;
	}

	public int getMAX_ADMIN() {
		return MAX_ADMIN;
	}

	public String toString() {

		return ("[" + "Centro: " + nombre + ", CAPACIDAD { Clases: " + MAX_CLASES + ", Admin: " + MAX_ADMIN + " }]");
	}

}
