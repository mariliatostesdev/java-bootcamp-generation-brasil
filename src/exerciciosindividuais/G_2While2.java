package exerciciosindividuais;

import java.util.Scanner;

public class G_2While2 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		int genero, areaDev = 0, numRespostas = 0, devsBackEnd = 0, mulheresCisTransFront = 0,
				homensCisTransMobileMaior40 = 0, naoBinariosFullMenor30 = 0;
		String simOuNao;
		String opcoesGenero = "Com qual gênero se identifica? (Número Inteiro)\n" + "1 – Mulher Cis\r\n"
				+ "2 – Homem Cis\r\n" + "3 – Não Binário\r\n" + "4 – Mulher Trans\r\n" + "5 – Homem Trans\r\n"
				+ "6 – Outros\r\n";

		String opcoesAreaDev = "Qual a sua área de desenvolvimento? (Número Inteiro)\n" + "1 – Backend\n"
				+ "2 – Frontend\n" + "3 – Mobile\n" + "4 – FullStack\n";
		boolean desejaContinuar = true;
		float idade, somaIdades = 0, mediaIdades = 0f;

		while (desejaContinuar) {
			numRespostas += 1;

			System.out.println("Olá, colaborador(a)!\nQual a sua idade? (Número Inteiro)");
			idade = read.nextFloat();
			somaIdades += idade;
			mediaIdades = somaIdades / numRespostas;

			System.out.println(opcoesGenero);
			genero = read.nextInt();

			while (genero < 1 || genero > 6) {
				System.out.println(opcoesGenero);
				genero = read.nextInt();
			}

			System.out.println(opcoesAreaDev);
			areaDev = read.nextInt();
			read.nextLine();

			while (areaDev < 1 || areaDev > 4) {
				System.out.println(opcoesAreaDev);
				areaDev = read.nextInt();
				read.nextLine();
			}

			if (areaDev == 1) {
				devsBackEnd++;
			}

			if ((genero == 1 || genero == 4) && areaDev == 2) {
				mulheresCisTransFront++;
			}

			if ((genero == 2 || genero == 5) && areaDev == 3 && idade > 40) {
				homensCisTransMobileMaior40++;
			}

			if (genero == 3 && areaDev == 4 && idade < 30) {
				naoBinariosFullMenor30++;
			}

			System.out.println("\n-----\n\nVocê deseja continuar a leitura dos dados de um novo colaborador? (S/N)");
			simOuNao = read.nextLine();

			if (simOuNao.equalsIgnoreCase("N")) {
				desejaContinuar = false;

				System.out.println("\nO número de pessoas desenvolvedoras Backend é: " + devsBackEnd);
				System.out.println(
						"O número de Mulheres Cis e Trans desenvolvedoras Frontend é: " + mulheresCisTransFront);
				System.out.println("O número de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos é: "
						+ homensCisTransMobileMaior40);
				System.out.println("O número de Não Binários desenvolvedores FullStack menores de 30 anos é: "
						+ naoBinariosFullMenor30);
				System.out.println("O número total de pessoas que responderam à pesquisa é: " + numRespostas);
				System.out.printf("A média de idade das pessoas que responderam à pesquisa é: %.2f", mediaIdades);
			}
		}
		read.close();
	}
}