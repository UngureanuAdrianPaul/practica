import java.util.Scanner;

public class strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner escaner;
		escaner = new Scanner(System.in);
		int indice = 0;

		String cadena = escaner.nextLine();
		for (int i = 0; i < cadena.length(); i++) {

			if (i % 2 == 0) {
	
				imprimeBro(i, cadena.toUpperCase());
			} else {

				imprimeBro(i, cadena);
			}

		}

		escaner.close();
	}

	static void imprimeBro(int indice, String cadena) {
		System.out.println("El carácter número " + indice + "de la cadena " + cadena + " es: " + cadena.charAt(indice));

	}

}