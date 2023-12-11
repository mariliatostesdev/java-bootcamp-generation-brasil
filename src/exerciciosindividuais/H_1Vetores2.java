package exerciciosindividuais;

import java.util.Scanner;

public class H_1Vetores2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] numeros = new int[10];
		float somaVetores = 0, mediaVetores;

		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Digite o " + (i + 1) + "º número:");
			numeros[i] = input.nextInt();
			somaVetores += numeros[i];
		}

		System.out.println("\n\nElementos nos índices ímpares:");
		for (int i = 0; i < numeros.length; i++) {
			if (i % 2 != 0) {
				System.out.print(numeros[i] + " ");
			}
		}

		System.out.println("\n\nElementos de valor par:");
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] % 2 == 0) {
				System.out.print(numeros[i] + " ");
			}
		}

		mediaVetores = somaVetores / 10;

		input.close();
		
		System.out.println("\n\nSoma de todos os elementos do vetor: " + somaVetores);
		System.out.println(
				"\nA Média de todos os elementos do vetor, "
				+ "armazenada em uma variável do tipo real: " + mediaVetores);

	}

}
