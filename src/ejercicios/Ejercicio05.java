package ejercicios;

import java.util.Scanner;

public class Ejercicio05 {
	public static void main(String[] args) {
		int numero=0;
		System.out.print("Introduce un numero :");
		Scanner sc = new Scanner(System.in);
		numero = sc.nextInt();
		if (numero>0) {
			System.out.println("El numero " + numero + " es un numero positivo");
		}else if ( numero < 0) {
			System.out.println("El numero " + numero + " es un numero negativo");
		}else {
			System.out.println("El numero " + numero + " es un numero nulo");
		}
		sc.close();
	}
}
