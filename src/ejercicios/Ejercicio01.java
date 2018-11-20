package ejercicios;

import java.util.Scanner;

public class Ejercicio01 {
	public static void main(String[] args) {
		System.out.print("Introduce un numero: ");
		Scanner sc = new Scanner(System.in);
		int numero1 = sc.nextInt();
		System.out.print("Introduce otro numero: ");
		Scanner sc1 = new Scanner(System.in);
		int numero2 = sc1.nextInt();
		int suma = 0;
		int resta = 0;
		int multiplicaion = 0;
		int division = 0;
		if(numero1 > numero2) {
			suma = numero1 + numero2;
			resta = numero1 - numero2;
			System.out.println("Suma: " + suma);
			System.out.println("Resta: " + resta);
		}else if (numero1 < numero2) {
			multiplicaion = numero1 * numero2;
			division = numero1 / numero2;
			System.out.println("multiplicacion: " + multiplicaion);
			System.out.println("Division: " + division);
			
		}
		sc.close();
		sc1.close();
	}
}
