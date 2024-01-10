package practicas;

import java.util.Scanner;

public class EmpiezaAcaba {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int num1 = 0;
		int num2 = 0;

		System.out.print("Introduce 2 números espabilao: ");

		num1 = teclado.nextInt();
		num2 = teclado.nextInt();

		System.out.println("El número 1 empieza en: " + primera(num1));

		System.out.println("El número 1 termina en: " + ultima(num1));

		System.out.println("El número 1 tiene: " + total(num1) + " cifra/s");

		System.out.println("El número 2 empieza en: " + primera(num2));

		System.out.println("El número 2 termina en: " + ultima(num2));

		System.out.println("El número 2 tiene: " + total(num2) + " cifra/s");

		if ((primera(num1) == primera(num2)) && (ultima(num1) == ultima(num2))) {

			System.out.println("Los números empiezan y acaban por los mismos números");
		} else {
			System.out.println("NO acaban por los mismos números");
		}

		teclado.close();
	}

	public static int total(int num) {
		int contador = 1;
		while ((num / 10) != 0) {
			num = num / 10;
			contador++;
		}
		return contador;
	}

	// METODO PARA ULTIMA CIFRA
	public static int ultima(int num) {

		return (num % 10);

	} 

	// METODO PARA LA PRIMERA CIFRA

	public static int primera(int num) {

		int exp = total(num) - 1;

		int cifraPrimera = num / (int) Math.pow(10, exp);

		return cifraPrimera;
	}

}
