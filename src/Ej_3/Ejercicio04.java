/* Algoritmo que escriba los números impares comprendidos entre dos enteros introducidos por el usuario. */

package Ej_3;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int num1, num2;

		System.out.print("Introduce primer número entero: ");
		num1 = teclado.nextInt();
		System.out.print("Introduce segundo número entero: ");
		num2 = teclado.nextInt();

		System.out.printf("Listado de numeros impares entre %d y %d:\n", num1, num2);

		// Si el numero final es menor que el inicial, se invierten
		if (num1 > num2) {
			int aux = num1;
			num1 = num2;
			num2 = aux;
		}
		// Compara si es par el valor inicial y en ese caso le añade uno para hacerlo impar
		// Esto evita el if dentro del bucle for y permite incrementar el contador de 2 en 2
		if (num1 % 2 == 0)
			num1++;

		for (int i = num1; i <= num2; i = i + 2) {
			System.out.print(i + " ");
		}

		teclado.close();
	}

}
