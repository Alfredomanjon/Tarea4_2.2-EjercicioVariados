package ejercicios;

import java.util.Scanner;

public class Ejercicio15 {
	public static void main(String[] args) {
		int contador = 0;
		int mayor = 0;
		int menor = 0;
		while (contador < 10) {
			System.out.print("Introduce una nota: ");
			Scanner sc = new Scanner(System.in);
			int nota = sc.nextInt();
			if(nota > 7) {
				mayor++;
				contador++;
			}else if(nota < 7) {
				menor++;
				contador++;
			}
		}
		
		System.out.println("Aprobados: " + mayor);
		System.out.println("Suspensos: " + menor);
	}
	
}
