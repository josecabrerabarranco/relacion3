/* Algoritmo que calcule el factorial de un número entero introducido por el usuario */

package Ej_3;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double resultado = 1;
		
		System.out.print("Introduce número entero: ");
		int num = teclado.nextInt();
		
		for (int i = 1; i <= num; i++) {
			resultado = resultado * i;
		}	
		
			System.out.printf("El resultado es: %.0f ", resultado);
				
		
		teclado.close();
		
		
	}

}
