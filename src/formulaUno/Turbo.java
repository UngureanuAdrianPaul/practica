package formulaUno;
import java.util.Random;
public class Turbo {

	// ATRIBUTOS

	private final int IDTURBO;
	private final int RPM;
	private final int TAMANO;
	private final Ingeniero INGENIERO;
	private final int TRABAJOING;

	// ATRIBUTOS

	public Turbo(int idTurbo, int rpm, int tamano, Ingeniero ingeniero) {
		this.TRABAJOING = ingeniero.trabajo();
		Random aleatorio = new Random();
		this.IDTURBO = idTurbo;
		this.RPM = aleatorio.nextInt(10);
		this.TAMANO = aleatorio.nextInt(10);
		this.INGENIERO = ingeniero;
	}

	// GETTERS Y SETTERS

	public int getIdTurbo() {
		return IDTURBO;
	}

	public int getRpm() {
		return RPM;
	}

	public int getTamano() {
		return TAMANO;
	}

	public Ingeniero getIngeniero() {
		return INGENIERO;
	}

	public int construido() {
		
		return ((RPM+TAMANO+TRABAJOING)/3);
	}
}
