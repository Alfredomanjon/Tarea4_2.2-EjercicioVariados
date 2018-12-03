package ejercicios;

import java.util.Scanner;

public class Ejercicio25 {
	public static void main(String[] args) {
		int suma=0;
		int valor;
		for(int f=1;f<=10;f++){
			System.out.println("Ingreseme un numero bitte:");
			Scanner sc = new Scanner(System.in);
			valor = sc.nextInt();
		    	if (f>5){
		      suma=suma+valor;
		    }
		  }
		  System.out.println("La suma de los últimos cinco valores ingresados es: " + suma);
	
	}
}
