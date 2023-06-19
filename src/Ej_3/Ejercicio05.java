/* Algoritmo que sume los n primeros números enteros, siendo n un número introducido por el usuario */

package Ej_3;

import java.util.Scanner;

public class Ejercicio05 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int num;
		int cont = 1;
		int resultado = 0;

		System.out.print("Introduce número entero: ");
		num = teclado.nextInt();

		System.out.printf("Resultado de sumar todos los enteros desde 0 hasta %d:\n", num);
		
		if (num < 0) {
			int aux = num;
			num = -1;
			cont = aux;
		}

		for (int i = cont; i <= num; i++) {
			System.out.printf(" %d", i);
			resultado = resultado + i;
		}

		System.out.printf("\nEs igual a: %d", resultado);

		teclado.close();
	}

}
