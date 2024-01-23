package topGun;

public class Avion {
	
	//ATRIBUTOS
	
	private int idAvion;
	private String modAvion;
	private int capAvion;
	private Piloto piloto;
	private static int contador = 0;
	private int combustible;
	
	//CONSTRUCTOR
	
	public Avion(String modAvion, int capAvion, Piloto piloto) {
		contador++;
		this.idAvion = contador;
		this.modAvion = modAvion;
		this.capAvion = capAvion;
		this.piloto = piloto;
		combustible = 0;
		
	}

	public void mostrarAvion() {
		System.out.print("Numero avion: "+ idAvion + "| Modelo: " + modAvion+  
				"| Capacidad: " + capAvion + "| Piloto: ");
		piloto.mostrarPiloto();
	}
	//GETTERS Y SETTERS
	
	public int getIdAvion() {
		return idAvion;
	}

	public int getContador() {
		return contador;
		
	}

	public String getModAvion() {
		return modAvion;
	}

	public void setModAvion(String modAvion) {
		this.modAvion = modAvion;
	}

	public int getCapAvion() {
		return capAvion;
	}

	public void setCapAvion(int capAvion) {
		this.capAvion = capAvion;
	}

	public Piloto getPiloto() {
		return piloto;
	}

	public void setPiloto(Piloto piloto) {
		this.piloto = piloto;
	}
	
	public int getCombustible() {
		return combustible;
	}
	
	public void consumirCombustible(int combustible) {
		this.combustible = this.combustible - combustible;
	}
	
	public void veAlRepsol(int combustible) {
		this.combustible = this.combustible + combustible;
	}
	
	
	
}