package atividades;

import java.util.Scanner;

public class H1_Correcao_H_2Matrizes1 {
	public static void main(String[] args) {

		/*
		 * 
		 * 0,0 0,1 0,2 1,0 1,1 1,2 2,0 2,1 2,2
		 * 
		 */

		int[][] numeros = new int[3][3];
		int somaPrincipal = 0, somaSecundaria = 0, x, y;
		double a = 9.8, b = 6.6, soma;

		Scanner leia = new Scanner(System.in);

		for (x = 0; x < 3; x++) {
			for (y = 0; y < 3; y++) {
				System.out.println("\nEntre com um número: ");
				numeros[x][y] = leia.nextInt();

				if (x == y) {
					System.out.println("O número " + numeros[x][y] + " faz parte da diagonal principal");
					somaPrincipal += numeros[x][y];
				}
				if ((x + y) == 2) {
					System.out.println("O número " + numeros[x][y] + " faz parte da diagonal secundaria");
					somaSecundaria += numeros[x][y];
				}
			}
		}
		System.out.println("\nSomatório da diagonal principal foi de: " + somaPrincipal);
		System.out.println("\nSomatório da diagonal secundária foi de: " + somaSecundaria);

		soma = (a + b) / 3;
		System.out.println("\nSoma: " + soma);
		System.out.printf("\nSoma: %.2f", soma);
	}

}