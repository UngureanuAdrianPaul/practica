package practicas;
import java.util.Scanner;


public class Capicua {
	public static void main(String[] args) {
		
		Scanner introduce = new Scanner(System.in);
		
		int num = 0;
		
		do {
			System.out.print("Introduce un número de 3 cifras: ");
			num = introduce.nextInt();
		} while ((num / 1000 != 0) || ((num / 1000 == 0) && (num / 100 == 0) && (num / 10 == 0)));
		introduce.close();
		
	}
	

}
