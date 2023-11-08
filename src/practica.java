
public class practica {
	public static void main(String[] args) {

		int diaSemana = 0;
		int semana = 0;
		int mes = 0;
		while (mes < 12) {
			
			if (mes == 0) {
				System.out.print("Enero" + " ");
			} else if ( mes== 1) {
				System.out.print("Febrero" + " ");
			}
			else if ( mes== 2) {
				System.out.print("Marzo" + " ");
			}
			else if ( mes== 3) {
				System.out.print("Abril" + " ");
			}
			else if ( mes== 4) {
				System.out.print("Mayo" + " ");
			}
			else if ( mes== 5) {
				System.out.print("Junio" + " ");
			}
			else if ( mes== 6) {
				System.out.print("Julio" + " ");
			}
			else if ( mes== 7) {
				System.out.print("Agosto" + " ");
			}
			else if ( mes== 8) {
				System.out.print("Septiembre" + " ");
			}
			else if ( mes== 9) {
				System.out.print("Octubre" + " ");
			}
			else if ( mes== 10) {
				System.out.print("Noviembre" + " ");
			}
			else if ( mes== 11) {
				System.out.print("Diciembre" + " ");
			}
		

				
			while (semana < 4) {
				System.out.print("[");
				while (diaSemana < 7) {

					if (diaSemana == 0) {
						System.out.print("L" + " ");
					} else if (diaSemana == 1) {
						System.out.print("M" + " ");

					} else if (diaSemana == 2) {
						System.out.print("X" + " ");

					} else if (diaSemana == 3) {
						System.out.print("J" + " ");

					} else if (diaSemana == 4) {
						System.out.print("V" + " ");

					} else if (diaSemana == 5) {
						System.out.print("S" + " ");

					} else if (diaSemana == 6) {
						System.out.print("D");

					}

					diaSemana = diaSemana + 1;
				}
				diaSemana = 0;
				semana = semana + 1;
				System.out.print("]");
			}
			
			diaSemana=0;
			semana=0;
			mes = mes +1;
			System.out.println("");
			
		}
	}
}
