package ejercicios;

import java.util.Scanner;

public class Ejercicio20 {
	public static void main(String[] args) {
		int x=1;
		int suma1=0;
		int suma2=0;
		System.out.println("primer lista");
		while (x <= 3) {
			System.out.println("Ingrese un valor:");
			Scanner sc = new Scanner(System.in);
			int valor = sc.nextInt();
			suma1=suma1+ valor;
			x=x+1;
		}   
		System.out.println("Segunda lista");
		x = 1;
		while (x<=3) {
			System.out.println("Ingrese un valor:");
			Scanner sc = new Scanner(System.in);
			int valor = sc.nextInt();
			suma1=suma1+ valor;
			x=x+1;
		}
		if(suma1 == suma2) {
			System.out.println("Listas iguales");
		}
		else if (suma1>suma2) {
			System.out.println("Lista 1 mayor.");
		}
		else if (suma2>suma1) {
				System.out.println("Lista2 mayor.");
		     } 
		    
		}
	}



