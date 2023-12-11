package atividades;

import java.util.Scanner;

public class G3_DoWhile {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		int resultado, opcao;

		do {
			System.out.println("\n--Calculadora que só multiplica por 5-- ");
			System.out.println("\nDigite um numero: ");
			opcao = read.nextInt();
			resultado = opcao * 5;

			System.out.println("\n\no resultado da multiplicação é: " + resultado);
			System.out.println("\n Entre com outro numero ou digite 0 para sair: ");
			opcao = read.nextInt();

			read.close();

		} while (opcao != 0);

		System.out.println("\n-- Obrigada por usar nossa Calculadora futurista! -- ");
	}
}