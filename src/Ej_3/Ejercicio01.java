/* Algoritmo que imprima la tabla de multiplicar correspondiente a un número comprendido entre uno y diez, 
 * introducido por el usuario, usando un esquema for. */

package Ej_3;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int num;

		// Control para entrada correcta de valores
		do {
			System.out.print("Introduce un entero entre uno y diez: ");
			num = teclado.nextInt();
		} while (num < 1 || num > 10);

		System.out.println("Tabla de multiplicar del " + num);

		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d x %2d = %3d\n", num, i, num * i);
		}

		teclado.close();

	}

}
