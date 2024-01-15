package animales;

public class Insecto extends Animal {

	// ABTRIBUTOS

	private boolean alas;
	private boolean antenas;
	private Enemigo enemigo;

	// CONSTRUCTOR

	public Insecto(int tpVida, String nombre, boolean alas, boolean antenas, String enemigo) {
		super(tpVida, nombre);
		this.enemigo = new Enemigo(enemigo);
		this.alas = alas;
		this.antenas = antenas;
	}

	// GETTERS Y SETTERS

	public boolean isAlas() {
		return alas;
	}

	public void setAlas(boolean alas) {
		this.alas = alas;
	}

	public boolean isAntenas() {
		return antenas;
	}

	public void setAntenas(boolean antenas) {
		this.antenas = antenas;
	}

	public Enemigo getEnemigo() {
		return enemigo;
	}

	public void setEnemigo(Enemigo enemigo) {
		this.enemigo = enemigo;
	}

	class Enemigo {

		private String nombre;

		public Enemigo(String nombre) {
			super();
			this.nombre = nombre;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

	}

}