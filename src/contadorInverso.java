
public class contadorInverso {

	public static void main(String[] args) {
		
		// Vamos de ir a 1200 a 620 contando de 20 en 20 usando un while, un do while y un for.
		
		int num = 1200;
		
		
		while (num <= 1200 && num>=620) {
			
			System.out.print( num + " ");
			num =num-20;	
		}
		
		System.out.println("");
		
		num=1200;
		
		do {
			System.out.print( num + " ");
			num=num-20;	
		}
		while(num>=620);
			
		System.out.println("");
		
		
		for (int i = 1200 ; i >= 620; i= i-20) {
			System.out.print( i + " ");
		}
			
			

		
	}

}
