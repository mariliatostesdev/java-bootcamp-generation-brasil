package exerciciosindividuais;

import java.util.Arrays;
import java.util.Scanner;

public class H_1Vetores1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int posicao, numEscolhido;
		String continua;

		int[] vetorNum = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };

		// Pesquisar elemento no vetor: primeiro ordenar o Array com .sort e depois
		// procurar com .binarySearch

		Arrays.sort(vetorNum);

		System.out.println("\nDigite um número inteiro para verificar sua posição no Array.");


		for (int i = 0; i < vetorNum.length; i++) {
			numEscolhido = input.nextInt();
			
			input.nextLine(); // Consumindo linha vazia
			
			posicao = Arrays.binarySearch(vetorNum, numEscolhido);

			if (posicao >= 0 && posicao < vetorNum.length) {
				System.out.println("\nO elemento " + numEscolhido + " existe, e é o " + posicao 
						+ "º elemento do Array.");
				System.out.println("\n----------\n");
			} else {
				System.out.println("\nNúmero " + numEscolhido + " não encontrado!");
				System.out.println("\n----------\n");
			}

			System.out.println("\nDeseja realizar outra verificação? (S/N)");
			continua = input.nextLine();

			if (continua.equalsIgnoreCase("N")) {
				System.out.println("\nPrograma finalizado");
				break;
			} else if (continua.equalsIgnoreCase("S")) {
				System.out.println("\nDigite um número inteiro para verificar sua posição no Array.");
			}
		}

		input.close();

	}

}