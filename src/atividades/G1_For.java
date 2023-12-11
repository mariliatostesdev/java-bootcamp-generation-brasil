package atividades;

import java.util.Scanner;

public class G1_For {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

		String nome;

		int contador;

		System.out.println(" As vagas são limitadas, INSCREVA-SE JÁ!");

		for (contador = 1; contador < 4; contador++) {
			System.out.println("\nVocê foi o " + contador + "! digite seu nome: ");
			nome = read.nextLine();
		}

		System.out.println("Vagas esgotadas");



	}

}