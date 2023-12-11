package exerciciosindividuais;

import java.util.Arrays;
import java.util.Scanner;

public class H_2Matrizes1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int linha, coluna;
		int[][] matrizNum = new int[3][3]; // Matriz com 3 linhas e 3 colunas

		for (linha = 0; linha < matrizNum.length; linha++) {
			for (coluna = 0; coluna < matrizNum[0].length; coluna++) {
				System.out.println("Digite o valor da posição: linha " + linha + ", coluna " + coluna + ": ");
				matrizNum[linha][coluna] = input.nextInt();
			}
		}

		int[] elemDiagPrincipal = {matrizNum[0][0], matrizNum[1][1], matrizNum[2][2]};
//		Arrays.toString(elemDiagPrincipal);

		int[] elemDiagSecundaria = {matrizNum[0][2], matrizNum[1][1], matrizNum[2][0]};
//		Arrays.toString(elemDiagPrincipal);

		int somaPrincipal = 0;
		int somaSecundaria = 0;

		for (int elemento : elemDiagPrincipal) {
			somaPrincipal += elemento;
		}
		for (int elemento : elemDiagSecundaria) {
			somaSecundaria += elemento;
		}


		System.out.println("\n\nTodos os elementos da Diagonal Principal: " + Arrays.toString(elemDiagPrincipal)
				+ "\nTodos os elementos da Diagonal Secundária: " + Arrays.toString(elemDiagSecundaria)
				+ "\nA Soma de todos os elementos da Diagonal Principal: " + somaPrincipal
				+ "\nA Soma de todos os elementos da Diagonal Secundária: " + somaSecundaria);

	}

}