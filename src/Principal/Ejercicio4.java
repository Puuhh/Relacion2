package Principal;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Algoritmo que pida tres números de tipo entero y compruebe si es posible que exista un 
		//triángulo con esas dimensiones
		Scanner teclado = new Scanner(System.in);
		int lado1;
		int lado2;
		int lado3;
		System.out.println("Introduce el primer lado");
		lado1=teclado.nextInt();
		System.out.println("Introduce el segundo lado");
		lado2=teclado.nextInt();
		System.out.println("Introce el tercer lado");
		lado3=teclado.nextInt();
		if ((lado1<(lado2+lado3)) && (lado2<(lado1+lado3)) && (lado3<(lado1+lado2))) {
			System.out.println("El triangulo puede existir");}
		else {System.out.println("El triangulo no puede existir");}
		teclado.close();
		}

	}


