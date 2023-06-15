package Principal;

import java.util.Scanner;
import java.util.StringJoiner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Dadas dos casillas de un tablero de ajedrez por la fila y columna que ocupan, comprobar 
		//si están en la misma fila, columna, o en la misma diagonal. 
		Scanner teclado = new Scanner(System.in);
		int columna1;
		int columna2;
		int fila1;
		int fila2;
		System.out.println("Introduce columna 1");
		columna1=teclado.nextInt();
		System.out.println("Introduce fila 1");
		fila1=teclado.nextInt();
		System.out.println("Introduce columna 2");
		columna2=teclado.nextInt();
		System.out.println("Introduce fila 2");
		fila2=teclado.nextInt();
		if ((columna1==columna2) && (fila1==fila2)) {
			System.out.println("Es la misma pieza");}
		else if (columna1==columna2) {
			System.out.println("Las dos piezas estan en las misma columna");}
		else if (fila1==fila2) {
			System.out.println("Las dos piezas estan en la misma fila");}
		else if ((columna1- columna2 == -(fila1-fila2))) {
			System.out.println("Las piezas estan en diagonal");}
		else if ((columna2-columna1 == (fila2-fila1))){
			System.out.println("Las piezas estan en diagonal");}
		else {System.out.println("Las piezas no estan en diagonal");
		
		}
		teclado.close();
		}
		
		

	}


