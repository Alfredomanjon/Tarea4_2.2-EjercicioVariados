package ejercicios;

import java.util.Scanner;

public class Ejercicio16 {
	public static void main(String[] args) {
		System.out.print("Cuantas alturas quieres introducir?: ");
		Scanner sc = new Scanner(System.in);
		int alturas = sc.nextInt();
		int contador = alturas;
	    double suma = 0;
		while (contador > 0) {
			System.out.print("Introduce altura " + contador + ": ");
			Scanner sc1 = new Scanner(System.in);
			double altura = sc1.nextDouble();
			suma = suma + altura;
			contador--;
		}
		Double media = suma / alturas ;
		System.out.println("La media de altura es " + media);
	}
}
