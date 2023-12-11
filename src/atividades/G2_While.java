package atividades;

import java.util.Scanner;

public class G2_While {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		int resultado = 0, opcao, num;

		System.out.println("\n-- Calculadora que só multiplica por 5 -- ");
		System.out.println("\nDigite um número diferente de 0: ");
		opcao = read.nextInt();

		while (opcao != 0) {
			resultado = opcao * 5;
			System.out.println(opcao + " x 5 = " + resultado);

			System.out.println("\nDigite outro número, ou digite 0 para sair.");
			opcao = read.nextInt();
		}

		System.out.println("\n-- Obrigada por usar nossa Calculadora futurista! -- ");

	}

}