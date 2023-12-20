package practicas;

import java.util.Scanner;

public class Capicua {
	public static void main(String[] args) {

		Scanner introduce = new Scanner(System.in);

		int num = 0;
		int cifra = 0;
		int inv = 0;
		int aux = 0;

		System.out.print("Introduce un número: ");
		num = introduce.nextInt();

		aux = num;
		while (aux > 0) {

			cifra = aux % 10;
			inv = inv * 10 + cifra;
			aux = aux / 10;

		}

		if (num == inv) {
			System.out.println("Es capicua");
		} else {
			System.out.println("No es capicua");
		}

		introduce.close();

	}

}