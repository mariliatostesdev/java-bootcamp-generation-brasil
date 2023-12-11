package atividades;

import java.util.Scanner;

public class G3_Correcao_G_2While2 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		int idade, genero, categoria, back = 0, front = 0, mobile = 0, fullstack = 0;
		float media = 0, cont = 0, soma = 0;
		String continua = "S";
		String opcoesGenero = "Com qual gênero se identifica? (Número Inteiro)\n" + "1 – Mulher Cis\r\n"
				+ "2 – Homem Cis\r\n" + "3 – Não Binário\r\n" + "4 – Mulher Trans\r\n" + "5 – Homem Trans\r\n"
				+ "6 – Outros\r\n";

		String opcoesCategoria = "Qual a sua área de desenvolvimento? (Número Inteiro)\n" + "1 – Backend\n"
				+ "2 – Frontend\n" + "3 – Mobile\n" + "4 – FullStack\n";

		while (continua.equals("S")) {
			System.out.println("Digite a idade: ");
			idade = read.nextInt();

			System.out.println(opcoesGenero);
			genero = read.nextInt();

			// Fica em loop até o usuário escrever 1, 2 ou 3
			while (genero < 1 || genero > 6) {
				System.out.println(opcoesGenero);
				genero = read.nextInt();
			}

			System.out.println(opcoesCategoria);
			categoria = read.nextInt();

			while (categoria < 1 || categoria > 4) {
				System.out.println(opcoesCategoria);
				categoria = read.nextInt();
			}

			if (categoria == 1) {
				back++;
			}

			if (categoria == 2 && (genero == 1 || genero == 4)) {
				front++;
			}

			if (categoria == 3 && (genero == 2 || genero == 5) && idade > 40) {
				mobile++;
			}

			if (categoria == 4 && genero == 3 && idade < 30) {
				fullstack++;
			}

			cont++;

			soma += idade;

			System.out.println("Deseja continuar? (S/N)");
			read.nextLine(); // ou -> read.skip("\\R?");
			continua = read.nextLine().toUpperCase();

		}

		media = soma / cont;

		System.out.println("\nO número de pessoas desenvolvedoras Backend é: " + back);
		System.out.println("O número de Mulheres Cis e Trans desenvolvedoras Frontend é: " + front);
		System.out.println("O número de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos é: " + mobile);
		System.out.println("O número de Não Binários desenvolvedores FullStack menores de 30 anos é: " + fullstack);
		System.out.println("O número total de pessoas que responderam à pesquisa é: " + cont);
		System.out.printf("A média de idade das pessoas que responderam à pesquisa é: %.2f", media);

	}

}