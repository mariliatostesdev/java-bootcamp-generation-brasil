package exerciciosindividuais;

import java.util.Arrays;
import java.util.Scanner;

public class H_2Matrizes2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		float[][] notasAlunos = new float[10][4];
		float[] mediaAlunos = new float[10];
		String[] mediaFormatada = new String[10];
		float nota, soma = 0;

		System.out.println("Vamos digitar as notas dos 4 bimestres, para cada um dos 10 alunos.");

		for (int linha = 0; linha < 10; linha++) {
			System.out.println("\n-> Aluno " + (linha + 1) + ":\n");
			for (int coluna = 0; coluna < 4; coluna++) {
				System.out.println("\nNota do " + (coluna + 1) + "º bimestre:");
				nota = input.nextFloat();
				notasAlunos[linha][coluna] = nota;
				soma += nota;
			}

			mediaAlunos[linha] = (float) (Math.round((soma / 4.0)*10.0) / 10.0);

			soma = 0;
		}

		System.out.println("\n\nMédia dos alunos: " + Arrays.toString(mediaAlunos));

	}
}