package clase;
import java.util.Scanner;

public class identidad {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("ingrese el tamaño de la matriz: ");
		int magnitud1=in.nextInt();
		int matriz [] [] = new int [magnitud1] [magnitud1];
		for (int i=0;i<magnitud1;i++) {
			for (int j=0;j<magnitud1;j++) {
				if(i==j) {
					matriz [i] [j]=1;
				}
				else {
					matriz [i] [j]=0;
				}
				System.out.print(matriz [i] [j] + " ");
				System.out.println();
			}
		}
	}
}
