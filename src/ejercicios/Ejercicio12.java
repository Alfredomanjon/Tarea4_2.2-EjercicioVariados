package ejercicios;

import java.util.Scanner;

public class Ejercicio12 {
	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		System.out.print("Introduce x:");
		Scanner sc1 = new Scanner(System.in);
		x = sc1.nextInt();
		System.out.print("Introduce y:");
		Scanner sc2 = new Scanner(System.in);
		y = sc2.nextInt();
		if (x > 0 && y > 0) {
			System.out.println("1º Cuadrante");
		}else if (x < 0 && y > 0) {
			System.out.println("2º Cuadrante");
		}else if(x < 0 && y <0) {
			System.out.println("3º Cuadrante");
		}else if(x > 0 && y < 0) {
			System.out.println("4º Cuadrante");
		}else if( x==0 && y==0) {
			System.out.println("Para ti ander");
		}
		sc1.close();
		sc2.close();
	}
}
