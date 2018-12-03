package ejercicios;

import java.util.Scanner;

public class Ejercicio21 {
	public static void main(String[] args) {
		int x = 1;
		int pares = 0;
		int impares = 0;
		System.out.println("Cuantos números ingresará:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while (x <= n) {
			System.out.println("Ingrese un valor:");
			Scanner sc1 = new Scanner(System.in);
			int valor = sc1.nextInt();
				if (valor%2 == 0) {
				     pares=pares+1;
				}else {
				     impares=impares+1;
				}
				    x=x+1;
		}
		System.out.println("Cantadad de pares: " + pares);
		System.out.println("Cantidad de impares: " + impares);

	}
	
}
