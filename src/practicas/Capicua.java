package practicas;

import java.util.Scanner;

public class Capicua {
	public static void main(String[] args) {

		Scanner introduce = new Scanner(System.in);

		int num = 0;
		
		int cifra = 0;
		int inv = 0;
		int aux = 0;
		do {
			System.out.print("Introduce un número de 3 cifras: ");
			num = introduce.nextInt();

		} while ((num / 1000 != 0) || (num / 100 == 0) || (num / 10 == 0));

		System.out.println("El número es de 3 cifras");
		aux = num;
		while (aux > 0) {

			cifra = aux % 10;
			inv = inv * 10 + cifra;
			aux = aux / 10;

		}
		System.out.println("he salido del bucle");
		if (num == inv) {
			System.out.println("Es capicua");
		} else {
			System.out.println("No es capicua");
		}

		introduce.close();

	}

}