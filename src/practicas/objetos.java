package practicas;

public class objetos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String [] cadenaInicial = new String[10];
		for (int i= 0; i<3; i++) {
			cadenaInicial[i] = "hola";
			
		}
		ListaFijaCadena cadena1 = new ListaFijaCadena(3,cadenaInicial);
		System.out.println("num elementos: " + cadena1.getNumEle());
		
		for (int i=0; i< cadena1.getNumEle(); i++) {
			System.out.println(cadena1.getArray()[i]);
		}
		
		
	}
}


class ListaFijaCadena {

	private int numEle;
	private String[] array = new String [MAXELE];
	private static final int MAXELE = 10;

	
	public ListaFijaCadena(int numEle, String[] array) {
		super();
		this.numEle = numEle;
		this.array = array;
	}
	
	public int getNumEle() {
		return numEle;
	}

	public void setNumEle(int numEle) {
		this.numEle = numEle;
	}

	public String[] getArray() {
		return array;
	}

	public void setArray(String[] array) {
		this.array = array;
	}

	public static int getMaxele() {
		return MAXELE;
	}

	public void introduceString(String[] cadena) {
		
	}

	
}



