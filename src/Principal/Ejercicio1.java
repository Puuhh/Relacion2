package Principal;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Algoritmo que pida dos enteros y que indique el mayor y el menor, o si ambos son 
		//iguales
		Scanner teclado = new Scanner(System.in);
		int num1;
		int num2;
		System.out.println("Introduce el primer nummero");
		num1 = teclado.nextInt();
		System.out.println("Introduce el segundo numero");
		num2 = teclado.nextInt();
		if (num1 > num2) {
			System.out.println("El primer numero es mayor que el segundo");
		}
		else if (num2 > num1) {
			System.out.println("El segundo numero es mayor que el primero");
		}
		if (num1 == num2) {
			System.out.println("Los dos numeros son iguales");
		}
		teclado.close();
		}
	}
