package clase;

import java.util.Scanner;

public class funciontriangularsuperior {
	public static void main(String args[]) {
		//inicio del programa
		
		Scanner in = new Scanner(System.in);
		System.out.println("porfavor ingrese el numero de filas: ");
		int filas=in.nextInt();
		System.out.println("porfavor ingrese el numero de columnas: ");
		int columnas=in.nextInt();
		int matriz [] [] = new int [filas] [columnas];
		
		if(filas != columnas) {
			System.out.println("las filas y columnas deben ser iguales");
		}
		else {
			System.out.println("ingrese los elementos: ");
			for(int i=0;i<filas;i++) {
				for(int j=0;j<filas;j++) {
					matriz [i] [j]=in.nextInt();
				}
			}
		}
		
		System.out.println("la matriz de entrada es : ");
		for(int i=0;i<filas;i++) {
			for(int j=0;j<filas;j++) {
				System.out.print(matriz[i] [j]+ " ");
			}
			System.out.println();	
		}
		
		System.out.println("la triangular inferior es : ");
		for(int i=0;i<filas;i++) {
			for(int j=0;j<filas;j++) {
				if (j>i)
					System.out.print("0 ");
				else
					System.out.print(matriz [i] [j]+ " ");
			}
			System.out.println();
		}
		in.close();
	}
}