package ejercicios;

import java.util.Scanner;

public class Ejercicio17 {
	public static void main(String[] args) {
		System.out.print("Cuantas sueldos quieres introducir?: ");
		Scanner sc = new Scanner(System.in);
		int sueldos = sc.nextInt();
		int mas = 0;
		int menos = 0;
		while (sueldos > 0) {
			System.out.print("Introduce sueldo " + sueldos + ": ");
			Scanner sc1 = new Scanner(System.in);
			int sueldo = sc1.nextInt();
			if (sueldo > 100 && sueldo < 300) {
				menos++;
			}else if (sueldo > 100) {
				mas++;
			}
			sueldos--;
		}
		System.out.println("Cobran menos de 300: " + menos);
		System.out.println("CObran mas de 300: " + mas);
	}
}
