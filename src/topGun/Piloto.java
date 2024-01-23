package topGun;

public class Piloto {

	// ATRIBUTOS

	private final int idPiloto;
	protected String nomPiloto;
	private int horasVueloPiloto;
	private String rangoPiloto;
	private static int contador = 0;

	public void mostrarPiloto() {
		System.out.println("[Identificacion: " + idPiloto + "| Nombre: " + nomPiloto + "| Horas de Vuelo: "
				+ horasVueloPiloto + "| Rango: " + rangoPiloto + "]");
	}
	// CONSTRUCTOR

	public Piloto(String nomPiloto, int horasVueloPiloto, String rangoPiloto) {
		contador++;
		this.idPiloto = contador;
		this.nomPiloto = nomPiloto;
		this.horasVueloPiloto = horasVueloPiloto;
		this.rangoPiloto = rangoPiloto;

	}

	// GETTERS Y SETTERS
	public int getContador() {
		return contador;
	}
	
	public int getIdPiloto() {
		return idPiloto;
	}

	public String getNomPiloto() {
		return nomPiloto;
	}

	public void setNomPiloto(String nomPiloto) {
		this.nomPiloto = nomPiloto;
	}

	public int getHorasVueloPiloto() {
		return horasVueloPiloto;
	}

	public void setHorasVueloPiloto(int horasVueloPiloto) {
		this.horasVueloPiloto = horasVueloPiloto;
	}

	public String getRangoPiloto() {
		return rangoPiloto;
	}

	public void setRangoPiloto(String rangoPiloto) {
		this.rangoPiloto = rangoPiloto;
	}

}