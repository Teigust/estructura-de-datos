package clase;

public class edd {
	public static void main(String [] args) {
		
		//Declaracion de variables
		int m1 [] [] = new int [3] [3];
		int m2 [] [] = new int [3] [3];
		int m3 [] [] = new int [3] [3];
		int matriz_resultado [] [] = new int [3] [3];
		
		//relleno de la matriz 1
		
		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1.length; j++) {
				m1 [i] [j] = (int) (Math.random() * 10);	
			}
		}
		
		//relleno de la matriz 2
		for (int i = 0; i < m2.length; i++) {
			for (int j = 0; j < m2.length; j++) {
				m2 [i] [j] = (int) (Math.random() * 10);
			}
		}
		
		//relleno de la matriz 3
		
		for (int i = 0; i < m3.length; i++) {
			for (int j = 0; j < m3.length; j++) {
				m3 [i] [j] = (int) (Math.random() * 10);
			}
		}
		
		//relleno del resultado de las matrices
		for (int i = 0; i < matriz_resultado.length; i++) {
			for (int j = 0; j < matriz_resultado.length; j++) {
				matriz_resultado[i] [j] = (m1 [i] [j] + m2 [i] [j]) * m3 [i] [j];
				
			}
		}
		
		//imprimiendo matrices en pantalla
		
		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1.length; j++) {
				System.out.print("[ " + m1 [i] [j] + " ]");
			}
			
			if (i == 1) {
				System.out.print("   +   ");
			} else {
				System.out.print("       ");
			}
			
			for (int j = 0; j < m2.length; j++) {
				System.out.print("[ " + m2 [i] [j] + " ]");
			}
			
			if (i == 1) {
				System.out.print("   *   ");
			} else {
				System.out.print("       ");
			}
			
			for (int j = 0; j < m3.length; j++) {
				System.out.print("[ " + m3 [i] [j] + " ]");
			}
			
			if (i == 1) {
				System.out.print("   =   ");
			} else {
				System.out.print("       ");
			}
			
			for (int j = 0; j < matriz_resultado.length; j++) {
				System.out.print("[ " + matriz_resultado [i] [j] + " ]");
			}
			
		System.out.println("");
		}
		
	} 
}
