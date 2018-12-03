package ejercicios;

import java.util.Scanner;

public class Ejercicio22 {
	public static void main(String[] args) {
		int valor;
		int suma = 0;
		do {
			System.out.println("Ingrese un valor (9999 para finalizar)");
			Scanner sc = new Scanner(System.in);
			valor = sc.nextInt();
			if (valor != 9999) {
				suma = suma + valor;
			}
		} while (valor != 9999);
		System.out.println("Valor acumulado total: " + suma);
		if (suma > 0) {
			System.out.println("El valor acumulado es mayor a cero");
		} else {
			if (suma == 0) {
				System.out.println("El valor acumulado es cero");
			} else {
				System.out.println("El valor acumulado es menor a cero");
			}
		}
	}
}
