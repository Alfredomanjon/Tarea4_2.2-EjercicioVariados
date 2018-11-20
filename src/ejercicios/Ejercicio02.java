package ejercicios;

import java.util.Scanner;

public class Ejercicio02 {
	public static void main(String[] args) {
		int nota1 = 0;
		int nota2 = 0;
		int nota3 = 0;
		System.out.print("Primera nota:");
		Scanner sc = new Scanner(System.in);
		nota1 = sc.nextInt();
		System.out.print("Segunda nota:");
		Scanner sc1 = new Scanner(System.in);
		nota2 = sc.nextInt();
		System.out.print("Tercera nota:");
		Scanner sc2 = new Scanner(System.in);
		nota3 = sc.nextInt();
		int promedio = (nota1 + nota2 + nota3)/3;
		if(promedio >= 7) {
			System.out.println("Promocionado");
		}else {
			System.out.println("No Promociona");
		}
		sc.close();
		sc1.close();
		sc2.close();
		
	}
}
