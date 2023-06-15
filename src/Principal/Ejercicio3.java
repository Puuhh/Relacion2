package Principal;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Algoritmo que pida tres números distintos de tipo float e indique cual es el que ocupa la 
		//posición central si los tres se ordenasen
		
		Scanner teclado = new Scanner(System.in);
		float num1;
		float num2;
		float num3;
		System.out.println("Introduce el primer numero");
		num1 = teclado.nextFloat();
		System.out.println("Introduce el segundo numero");
		num2 = teclado.nextFloat();
		System.out.println("Introduce el  numero");
		num3 = teclado.nextFloat();
		
		if ((num1>num2 && num1<num3) || (num1>num3 && num1<num2)) {
			System.out.println(" El numero "+num1+" es el que ocupa la posicion central");
		}
		else if ((num2>num1 && num2<num3) || (num2>num3 && num2<num1)) {
			System.out.println(" El numero "+num2+" es el que ocupa la posicion central");
		}
		
		else {
			System.out.println(" El numero "+num3+ " es el que ocupa la posicion central");
		}
		teclado.close();
		}

	}


