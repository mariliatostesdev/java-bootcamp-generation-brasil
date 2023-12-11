package exerciciosindividuais;

import java.util.Scanner;

public class G_3DoWhile2 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		int num;
		int somaMultiplosDe3 = 0;
		int contMultiplosDe3 = 0;

		do {
			System.out.println("Digite um número:\t(Digite 0 para ver a média de todos os múltiplos de 3)");
			num = read.nextInt();

			if (num % 3 == 0 && num != 0) {
				contMultiplosDe3++;
				somaMultiplosDe3 += num;
			}

		} while (num != 0);
		read.close();

		float media = (float) somaMultiplosDe3 / contMultiplosDe3;

		System.out.println("A média de todos os números múltiplos de 3 é: " + media);

	}

}