package topGun;

public class Entrenamiento extends Avion{

	//ATRIBUTOS
	
	private boolean tieneDobleMando = false;

	//CONSTRUCTOR
	
	public Entrenamiento( String modAvion, int capAvion, Piloto piloto, boolean tieneDobleMando) {
		super(modAvion, capAvion, piloto);
		this.tieneDobleMando = tieneDobleMando;
	}

	//GETTERS Y SETTERS
	
	public boolean isTieneDobleMando() {
		return tieneDobleMando;
	}

	public void setTieneDobleMando(boolean tieneDobleMando) {
		this.tieneDobleMando = tieneDobleMando;
	}
	
	
}