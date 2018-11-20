package ejercicios;

import java.util.Scanner;

public class Ejercicio10 {
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		System.out.print("Introduce numero 1:");
		Scanner sc1 = new Scanner(System.in);
		num1 = sc1.nextInt();
		System.out.print("Introduce numero 2:");
		Scanner sc2 = new Scanner(System.in);
		num2 = sc2.nextInt();
		System.out.print("Introduce numero 3:");
		Scanner sc3 = new Scanner(System.in);
		num3 = sc3.nextInt();
		if(num1 < 10 && num2 < 10 && num3 < 10) {
			System.out.println("Todos los numeros son menores a diez");
		}else {
			System.out.println("Tienen que ser iguales");
		}
		sc1.close();
		sc2.close();
		sc3.close();
	}
}
