package ejercicios;

import java.util.Scanner;

public class Ejercicio04 {
	public static void main(String[] args) {
		int numero1 = 0;
		int numero2 = 0;
		int numero3 = 0;
		System.out.print("Introduce numero 1:");
		Scanner sc = new Scanner(System.in);
		numero1 = sc.nextInt();
		System.out.print("Introduce numero 1:");
		Scanner sc1 = new Scanner(System.in);
		numero2 = sc1.nextInt();
		System.out.print("Introduce numero 1:");
		Scanner sc2 = new Scanner(System.in);
		numero3 = sc2.nextInt();
		if(numero1 > numero2 && numero1>numero3) {
			System.out.println(numero1 + " es el mayor numero");
		}else if (numero2 > numero3) {
			System.out.println(numero2 + " es el mayor numero");
		}else {
			System.out.println(numero3 + " es el mayor numero");
		}
		sc.close();
		sc1.close();
		sc2.close();
	}
}
