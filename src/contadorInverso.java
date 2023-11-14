import java.util.Scanner;

public class contadorInverso {

	public static void main(String[] args) {

		// Vamos de ir a 1200 a 620 contando de 20 en 20 usando un while, un do while y
		// un for.

		// VARIABLES
		Scanner teclado = new Scanner(System.in);

		int num = 1200;
		int max = 0;
		int min = 0;
		int salto = 0;
		

		// BUCLES

		while (num <= 1200 && num >= 620) {

			System.out.print(num + " ");
			num = num - 20;
		}

		System.out.println("");

		num = 1200;

		do {
			System.out.print(num + " ");
			num = num - 20;
		} while (num >= 620);

		System.out.println("");

		for (int i = 1200; i >= 620; i = i - 20) {
			System.out.print(i + " ");
		}
		System.out.println("");
		System.out.println("");
		
		//BUCLE DE MAXIMOS Y MINIMOS
		
		
		System.out.print("Introduce un número máximo: ");
		max = teclado.nextInt();
		
		System.out.print("Introduce un número mínimo: ");
		min = teclado.nextInt();
		
		while (max<min) {
		
		System.out.print("Introduce otro número mínimo: ");
		min = teclado.nextInt();
			
		}
		
		System.out.print("Introduce un salto entre números: ");
		salto = teclado.nextInt();
	
		for (int i=max ; i>=min; i-= salto) {
			System.out.print( i + " ");
			
		}
			
		
		
		
		teclado.close();
	}

}
