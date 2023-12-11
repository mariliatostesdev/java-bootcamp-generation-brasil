package exerciciosindividuais;

import java.util.Scanner;

public class F_LacoIfElse3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int idadeDoador;
		boolean ehPrimeiraDoacao;
		String nomeDoador;

		System.out.println("Qual o nome completo do(a) doador(a)?");
		nomeDoador = leia.nextLine();
		System.out.println("Qual a idade do(a) doador(a)?");
		idadeDoador = leia.nextInt();

		if (idadeDoador >= 18 && idadeDoador < 60) {
			System.out.println("\nEba! " + nomeDoador + " está apto(a) a doar sangue!");
		} else if (idadeDoador >= 60 && idadeDoador <= 69) {
			System.out.println("É a 1ª doação do(a) doador(a)? \n\tDigite 'true' para sim \n\tDigite 'false' para não.");
			ehPrimeiraDoacao = leia.nextBoolean();

			if (ehPrimeiraDoacao) {
				System.out.println("\nInfelizmente " + nomeDoador + " não está apto(a) a doar sangue.");
			} else {
				System.out.println("\nEba! " + nomeDoador + " está apto(a) a doar sangue!");
			}
		} else {
			System.out.println("\nInfelizmente " + nomeDoador + " não possui idade suficiente para doar sangue.");
		}
		leia.close();
	}
}