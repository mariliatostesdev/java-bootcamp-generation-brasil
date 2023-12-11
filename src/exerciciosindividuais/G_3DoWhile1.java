package exerciciosindividuais;

import java.util.Scanner;

public class G_3DoWhile1 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		int numero;
		int somaPositivos = 0;

		do {

			System.out.println("Digite um número:\t(Digite 0 para ver a soma)");
			numero = read.nextInt();

			if (numero >= 0) {
				somaPositivos += numero;
			}

		} while (numero != 0);
		read.close();
		System.out.println("\nA soma dos números positivos é: " + somaPositivos);
	}

}