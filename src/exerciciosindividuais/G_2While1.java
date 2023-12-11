package exerciciosindividuais;

import java.util.Scanner;

public class G_2While1 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		int idade;
		int contMenor21 = 0;
		int contMaior50 = 0;

		System.out.println("Digite uma idade: (Digite um número negativo para finalizar.)");
		idade = read.nextInt();

		while (idade >= 0) {
			if (idade < 21) {
				contMenor21++;
			} else if (idade > 50) {
				contMaior50++;
			}

			System.out.println("Digite uma idade: (Digite um número negativo para finalizar.)");
			idade = read.nextInt();
		}

		read.close();

		System.out.println("Programa finalizado.");

		System.out.println("Total de pessoas menores de 21 anos: " + contMenor21);
		System.out.println("Total de pessoas maiores de 50 anos: " + contMaior50);

	}

}