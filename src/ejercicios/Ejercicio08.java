package ejercicios;

import java.util.Scanner;

public class Ejercicio08 {
	public static void main(String[] args) {
		int dia;
		int mes;
		System.out.print("Introduce un dia: ");
		Scanner sc = new Scanner(System.in);
		dia = sc.nextInt();
		System.out.print("Introduce un mes: ");
		Scanner sc1 = new Scanner(System.in);
		mes = sc.nextInt();
		if (dia == 25 && mes == 12) {
			System.out.println("¡Es navidad! Dameeeeee los regalos");
		}else {
			System.out.println("No es navidad");
		}
		sc.close();
		sc1.close();
	}
}
