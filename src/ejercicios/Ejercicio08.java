package ejercicios;

import java.util.Scanner;

public class Ejercicio08 {
	public static void main(String[] args) {
		int dia;
		System.out.print("Introduce un dia:");
		Scanner sc = new Scanner(System.in);
		dia = sc.nextInt();
		if (dia == 25) {
			System.out.println("¡Es navidad! Dameeeeee los regalos");
		}else {
			System.out.println("No es navidad");
		}
		sc.close();
	}
}
