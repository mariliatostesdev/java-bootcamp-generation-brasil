package atividades;

import java.util.Scanner;

public class H2_ArrayMatriz {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int numeros[][] = new int[3][2];
		int contPares = 0, somaImpar = 0, linha, coluna;

		for (linha = 0; linha < 3; linha++) {
			for (coluna = 0; coluna < 2; coluna++) {

				System.out.println("\nEntre com um número na linha " + linha + ", coluna " + coluna + ": ");
				numeros[linha][coluna] = input.nextInt();

				if (numeros[linha][coluna] % 2 == 0) {
					contPares++;
				} else {
					somaImpar += numeros[linha][coluna];
				}

			}

		}

		System.out.println("\n---Resultado---\n");

		System.out.println("Sua matriz: \n\n\t" + numeros[0][0] + "\t" + numeros[0][1] + "\n\t" 
				+ numeros[1][0] + "\t" + numeros[1][1] + "\n\t" + numeros[2][0] + "\t" + numeros[2][1]);

		System.out.println("\nQuantidade de números pares: " + contPares + ".");

		System.out.println("Soma dos números ímpares: " + somaImpar + ".");

	}
}