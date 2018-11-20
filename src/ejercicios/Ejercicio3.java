package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		int numero;
		System.out.print("Introduce un numero entre 1-99:");
		Scanner sc = new Scanner(System.in);
		numero = sc.nextInt();
		if (numero > 10) {
			System.out.println("Intoduce un numero entre 1-99");
		}
		else if (numero < 10) {
			System.out.println("El numero tiene 2 dígitos");
		}
			
		
	}


}