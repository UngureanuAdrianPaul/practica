package animales;

public class Mamifero extends Animal {
	
	
	//ATRIBUTOS 
	
	private boolean velloCorporal;

	//CONSTRUCTOR
	
	public Mamifero(int tpVida, String nombre, boolean velloCorporal) {
		super(tpVida, nombre);
		this.velloCorporal = velloCorporal;
	}

	public boolean isVelloCorporal() {
		return velloCorporal;
	}

	public void setVelloCorporal(boolean velloCorporal) {
		this.velloCorporal = velloCorporal;
	}
	
	

	
	
}
