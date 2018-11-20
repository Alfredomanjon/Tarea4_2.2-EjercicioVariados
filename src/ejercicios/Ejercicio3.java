package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		int numero;
		System.out.print("Introduce un numero:");
		Scanner sc = new Scanner(System.in);
		numero = sc.nextInt();
		if (numero > 100) {
			System.out.println("Introduce un numero entre 1-99");
		}else if (numero <0) {
			System.out.println("Introduce un numero entre 1-99");
		}
		else if (numero > 10) {
			System.out.println("El numero tiene 2 dígitos");
		}else if (numero > 0) {
			System.out.println("El numero tiene 1 dígitos");
		}
			
		
	}


}