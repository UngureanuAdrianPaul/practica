
package practicas;
import java.util.Scanner;

public class NumeroCifra {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num;
		int contador=1;
		int num_emp = 0;
		int num_acab = 0;
		
		do {
			System.out.println("Introduce numero positivo: ");
			num = teclado.nextInt();
		} while (num<0);
		num_acab= num%10;
		System.out.println("el número termina siempre en: "+ (num%10));
		while ((num/10)!=0) {
			num=num/10;			
			contador++;
		}
		num_emp= num;
		System.out.println("El numero tiene "+ contador + " cifras");
		System.out.println("el número empieza en: "+ num_emp);
		
		teclado.close();
	}

}