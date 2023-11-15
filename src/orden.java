import java.util.Scanner;

public class orden {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// VARIABLES

		Scanner teclado = new Scanner(System.in);

		int num1 = 0;
		int num2 = 0;
		int num3 = 0;

		// PROGRAMA

		System.out.println("Introduce 3 números: ");

		num1 = teclado.nextInt();

		num2 = teclado.nextInt();

		num3 = teclado.nextInt();

		if (num1 >= num2) {

			if (num1 >= num3) {
				System.out.print(num1);

				if (num2 >= num3) {
					System.out.print(num2); // 123
					System.out.print(num3);
					if (num2 < num3) {
						System.out.print(num3); // 132
						System.out.print(num2);

					}

				}

			} else { // Num3 es mayor que num1
				System.out.print(num3); // 312
				System.out.print(num1);
				System.out.print(num2);

			}

		} else { // Num2 mayor que num1

			if (num2 >= num3) {

				System.out.print(num2);
				
				if (num1 >= num3) {
					System.out.print(num1); // 213
					System.out.print(num3);
					if (num1 < num3) {
						System.out.print(num3); // 231
						System.out.print(num1);

					}

				}

			} else {
				System.out.print(num3); // 321
				System.out.print(num2);
				System.out.print(num1);

			}

		}

		teclado.close();
	}

}
