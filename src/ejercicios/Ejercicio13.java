package ejercicios;

import java.util.Scanner;

public class Ejercicio13 {
	public static void main(String[] args) {
		int sueldo = 0;
		int antiguedad = 0;
		System.out.print("Introduce sueldo:");
		Scanner sc1 = new Scanner(System.in);
		sueldo = sc1.nextInt();
		System.out.print("Introduce antigüedad:");
		Scanner sc2 = new Scanner(System.in);
		antiguedad = sc2.nextInt();
		if ( sueldo < 500 && antiguedad > 10) {
			Double suSueldo = sueldo * 1.20;
			System.out.println("Nuevo Sueldo = " + suSueldo);
		}else if ( sueldo < 500 && antiguedad > 5) {
			Double suSueldo = sueldo * 1.05;
			System.out.println("Nuevo Sueldo = " + suSueldo);
		}else {
			System.out.println(sueldo);
		}
		sc1.close();
		sc2.close();
	}
}
