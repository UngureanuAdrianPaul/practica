
public class cadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(uneCadenas("hola ", uneCadenas("adios", uneCadenas(" que", " tal"))));
		pasoCadenaA("hola ADIoS",true);
		System.out.println (numOcurrencias(" hola mundo",'u'));
		
	}
	//Devuelve un String que es la union de los parametros de entrada.
	
	static String uneCadenas(String cadena1, String cadena2) {
		
		return  cadena1 + cadena2;
		
	}
	
	
	//Modifica el String de entrada a mayusculas o minusculas dependiendo del segundo parametro
	
	static void pasoCadenaA(String cadena , boolean mayus) {
			
		if (mayus) {
			
			cadena = cadena.toUpperCase();
			
		} else {
			cadena = cadena.toLowerCase();
			
		}
		System.out.println(cadena);
	}
	
	//Devuleve el numero de caracteres que se repiten pasado como parametro en el strig
	static int numOcurrencias(String cadena, char caracter) {
		int num = 0;
		
		for (int i=0; i<cadena.length(); i++ ) {
			
			if ( cadena.charAt(i) == caracter) {
				num++;
			}
			
		}
		return num;
	}
	
}
