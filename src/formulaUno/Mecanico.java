package formulaUno;
import java.util.Random;

public class Mecanico extends Persona implements Comparable {
	
	//ATRIBUTOS
	
	private final int VELOCIDAD;
	
	//CONSTRUCTOR
	
	public Mecanico(int edad, String nombre, int dni) {
		super(edad, nombre, dni);
		Random aleatorio = new Random();
		this.VELOCIDAD = aleatorio.nextInt(10);
		//this.VELOCIDAD = this.getDni();
	}
	
	//GETTERS Y SETTERS

	public int getVelocidad() {
		return VELOCIDAD;
	}
	
	public boolean equals(Object object) {
		
		if (object instanceof Mecanico) {
			
			return (this.VELOCIDAD == (((Mecanico) object).VELOCIDAD));
			
		} else {
			return false;
			
		}
		
	}
	
	@Override
	public int compareTo(Object o) {
		
		if (this.VELOCIDAD > ((Mecanico) o).VELOCIDAD ) return 1;
		
		if (this.VELOCIDAD < ((Mecanico) o).VELOCIDAD ) return -1;
		
		return 0;
	}


}
