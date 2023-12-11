package exerciciosindividuais;

import java.util.Scanner;

public class F_LacoIfElse2 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int num;

		System.out.println("\nDigite um número inteiro para verificar se é ímpar ou par:");
		num = leia.nextInt();

		if (num % 2 == 0) {
			if (num > 0) {
				System.out.println("O Número " + num + " é par e positivo!");
			} else if (num < 0) {
				System.out.println("O Número " + num + " é par e negativo!");
			} else {
				System.out.println("O Número " + num + " é par e neutro!");
			}
		} else {
			if (num > 0) {
				System.out.println("O Número " + num + " é ímpar e positivo!");
			} else if (num < 0) {
				System.out.println("O Número " + num + " é ímpar e negativo!");
			}

			leia.close();
		}
	}
}