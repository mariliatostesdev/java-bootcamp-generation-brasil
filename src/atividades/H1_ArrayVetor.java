package atividades;

import java.util.Scanner;

public class H1_ArrayVetor {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		float media[] = new float[4];
		String nomes[] = new String[4];
		float n1, n2, n3, mediaGeral, somaMedia = 0;

		for (int i = 0; i < 4; i++) {
			System.out.println("\n\nPreencha com as notas do(a) aluno(a).");
			System.out.println("Qual o nome do(a) aluno(a)?");
			nomes[i] = input.nextLine();

			System.out.println("Entre com a primeira nota: ");
			n1 = input.nextFloat();
			System.out.println("Entre com a segunda nota: ");
			n2 = input.nextFloat();
			System.out.println("Entre com a terceira nota: ");
			n3 = input.nextFloat();

			input.nextLine(); // Consumir quebra de linha pendente após nextFloat();

			media[i] = (n1 + n2 + n3) / 3;

			System.out.println("A média do(a) aluno(a) " + nomes[i] + " foi de: " + media[i]);

			somaMedia += media[i];
		}

		input.close();

		mediaGeral = somaMedia / media.length;
		System.out.println("\n\n--Informações salvas com sucesso.--\n\nMédia geral dos alunos: " + mediaGeral);

		for (int i = 0; i < 4; i++) {
			System.out.println("\n\tMédia do(a) aluno(a) " + nomes[i] + ": " + media[i]);
		}
	}

}