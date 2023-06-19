/* Algoritmo que imprima la tabla de multiplicar correspondiente a un número comprendido entre uno y diez, 
 * introducido por el usuario, usando un esquema do while. 
 * Nota: En los tres ejercicios anteriores, el programa ha de controlar mediante 
 * un esquema do-while, que el número está comprendido entre 1 y 10. */

package Ej_3;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int num;
		int cont = 1;

		do {
			System.out.print("Introduce un entero entre uno y diez: ");
			num = teclado.nextInt();
		} while (num < 1 || num > 10);

		System.out.println("Tabla de multiplicar del " + num);

		do {
			System.out.printf("%d x %2d = %3d\n", num, cont, num * cont);
			cont++;
		} while (cont <= 10);

		teclado.close();

	}

}
