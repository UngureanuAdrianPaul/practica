package animales;

public class Animal {

	// ATRIBUTOS

	private int tpVida = 0;
	private String nombre;
	
	// CONSTUCTOR

	protected Animal(int tpVida, String nombre) {
		
		this.nombre = nombre;

		if ((tpVida > 0) && (tpVida < 150)) {
			this.tpVida = tpVida;

		} else {
			this.tpVida = 0;
		}

	}

	// GETTERS Y SETTERS

	public int getTpVida() {
		return tpVida;
	}

	public void setTpVida(int tpVida) {
		this.tpVida = tpVida;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



}
