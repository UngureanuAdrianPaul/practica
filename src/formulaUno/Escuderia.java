package formulaUno;

public class Escuderia {

	// ATRIBUTOS

	private final String nombre;
	private JefeEscuderia jefe;
	private Ingeniero[] ingenieros;
	private Mecanico[] mecanicos;
	private Piloto[] pilotos;
	private Coche[] coches;
	private static final int NUMING = 4;
	private static final int NUMMEC = 6;
	private static final int NUMPIL = 2;
	private static final int NUMCOC = 2;

	// CONSTRUCTOR

	public Escuderia(String nombre) {

		this.nombre = nombre;
		this.jefe = null;
		coches = new Coche[NUMCOC];
		ingenieros = new Ingeniero[NUMING];
		mecanicos = new Mecanico[NUMMEC];
		pilotos = new Piloto[NUMPIL];

	}

	// GETTERS Y SETTTERS

	public String getNombre() {
		return nombre;
	}

	public JefeEscuderia getJefe() {
		return jefe;
	}

	public void setJefe(JefeEscuderia jefe) {
		this.jefe = jefe;
	}

	public Ingeniero[] getIngenieros() {
		return ingenieros;
	}

	public void contrataIngeniero(Ingeniero ingeniero) {

		ingenieros[0] = ingeniero;

	}

	public Mecanico[] getMecanicos() {
		return mecanicos;
	}

	public Piloto[] getPilotos() {
		return pilotos;
	}

	public Coche[] getCoches() {
		return coches;
	}

	public static int getNuming() {
		return NUMING;
	}

	public static int getNummec() {
		return NUMMEC;
	}

	public static int getNumpil() {
		return NUMPIL;
	}

	public static int getNumcoc() {
		return NUMCOC;
	}
}
