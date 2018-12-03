package ejercicios;

import java.util.Scanner;

public class Ejercicio24 {
	public static void main(String[] args) {
		int x;
		int base;
		int altura;
		int superficie;
		int contador = 0;
		for (int f = 1; f <= 3; f++) {
			System.out.println("Ingrese la base: ");
			Scanner sc = new Scanner(System.in);
			base = sc.nextInt();
			System.out.println("Ingrese la altura: ");
			Scanner sc1 = new Scanner(System.in);
			altura = sc1.nextInt();
			superficie = base * altura / 2;
			if (superficie > 12) {
				contador++;
			}
			System.out.println("Triángulo numero: " + f);
			System.out.println("Base: " + base);
			System.out.println("Altura: " + altura);
			System.out.println("Superficie: " + superficie);
		}
		System.out.println("Cantidad de triángulos con superficie mayor a 12: " + contador);
	}
}
