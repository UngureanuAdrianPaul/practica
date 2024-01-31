package topGun;

public class Entrenamiento extends Avion{

	//ATRIBUTOS

	private boolean tieneDobleMando = false;

	//CONSTRUCTOR

	public Entrenamiento(int idAvion, String modAvion, int capAvion, Piloto piloto, boolean tieneDobleMando) {
		super(idAvion, modAvion, capAvion, piloto);
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