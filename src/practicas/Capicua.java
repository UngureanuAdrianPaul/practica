package practicas;
import java.util.Scanner;


public class Capicua {
	public static void main(String[] args) {
		
		Scanner introduce = new Scanner(System.in);
		
		int num = 0;
		boolean correcto = false;
		
		
		do {
			System.out.print("Introduce un número de 3 cifras: ");
			num = introduce.nextInt();
			if (num/1000==0) {
				if(num/100 != 0) {
					if(num/10 !=0) {
						correcto = true;
						
					}
					
				}
				
			}
		} while (!correcto);
		
		System.out.println("El número es de 3 cifras");
		
		introduce.close();
		
	}
	

}
