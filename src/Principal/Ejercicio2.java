package Principal;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Algoritmo que pida 3 números e indique cual es el menor de los tres
		
		Scanner teclado = new Scanner(System.in);
		int num1;
		int num2;
		int num3;
		System.out.println("Introduce el primer numero");
		num1 = teclado.nextInt();
		System.out.println("Introduce el segundo numero");
		num2 = teclado.nextInt();
		System.out.println("Introduce el tercer numero");
		num3 = teclado.nextInt();
		if (num1<num2 && num1<num3) {
			System.out.println(" El numero "+num1+" es el mas pequeño ");
		}
		else if (num2<num3 && num2<num1) {
			System.out.println(" El numero "+num2+" es el mas pequeño ");
		}
		else if (num3<num2 && num3<num1) {
			System.out.println(" El numero "+num3+" es el mas pequeño ");
		}
		else {
			System.out.println("Los tres numeros son iguales");
		}
		teclado.close();
		}
				
				

	}
