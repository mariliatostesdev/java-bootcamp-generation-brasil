package exerciciosindividuais;

import java.util.Scanner;

public class B_MediaEscolar {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		float media, soma = 0;

		int i;
		float[] numeros = new float[4];

		for (i = 0; i < 4; i++) {
			System.out.println("Digite a nota do Trimestre " + (i + 1) + ": ");
			numeros[i] = (float) leia.nextFloat();
			soma += numeros[i];
		}

		media = soma / numeros.length;

		System.out.println("A média do aluno é: " + media);

		leia.close();

	}
}