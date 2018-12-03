package ejercicios;

import java.util.Scanner;

public class Ejercicio23 {
	public static void main(String[] args) {
		  int numerocuenta;
		  int nombre;
		  int saldo=0;
		  int saldoacreedor=0;
		  do {
			System.out.println("Ingrese un numero de cuenta: ");
			Scanner sc = new Scanner(System.in);
				numerocuenta = sc.nextInt();
		    	if (numerocuenta>=0){
		    		System.out.println("Nombre del cliente: ");
					Scanner sc1 = new Scanner(System.in);
					nombre= sc1.nextInt();
					System.out.println("Saldo actual: ");
					Scanner sc2 = new Scanner(System.in);
					saldo = sc2.nextInt();
		      if (saldo>0){
		        saldoacreedor=saldoacreedor+saldo;
		        System.out.println(nombre + " tiene saldo acreedor ");
		      }
		      else{
		        if (saldo<0){
		          System.out.println(nombre + " tiene saldo deudor ");
		        }
		        else{
		          System.out.println(nombre+" tiene saldo nulo ");
		        }
		      }
		      
		    }
		  }while(numerocuenta>0);
		  System.out.println("Suma total de saldos acreedores: " +saldoacreedor);
	}
}
