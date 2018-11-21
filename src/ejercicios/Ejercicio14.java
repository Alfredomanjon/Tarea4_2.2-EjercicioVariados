package ejercicios;

public class Ejercicio14 {
	public static void main(String[] args) {
		int numero1 = 10;
	    int numero2 = 12;
	    int numero3 = 3;
	    int min = numero1;
	    int max = numero1;

	     if (numero2 < min) {
	          min = numero2;
	        } else if (numero2 > max) {
	          max = numero2;
	        }

	        if (numero3 < min) {
	          min = numero3;
	        } else if (numero3 > max) {
	            max = numero3;
	        }

	        System.out.println("Minimo: " + min);
	        System.out.println("Maximo: " + max);
	}
}
