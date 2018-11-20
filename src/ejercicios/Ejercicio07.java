package ejercicios;

import java.util.Scanner;

public class Ejercicio07 {
	public static void main(String[] args) {
		Double porcentaje;
		System.out.print("Introduce un porcentaje:");
		Scanner sc = new Scanner(System.in);
		porcentaje = sc.nextDouble();
		if (porcentaje < 50) {
			System.out.println("Fuera de Nivel");
		}else if(porcentaje >= 50 && porcentaje < 75) {
			System.out.println("Nivel regular");
		}else if(porcentaje >= 75 && porcentaje < 90) {
			System.out.println("Nivel medio");
		}else if(porcentaje >= 90) {
			System.out.println("Nivel maximo");
		}
		sc.close();
	}
}
