package exerciciosindividuais;

import java.util.Scanner;

public class F_LacoIfElse1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		int A, B, C, somaAB;

		System.out.println("Dê um valor inteiro para A: ");
		A = leia.nextInt();
		System.out.println("Dê um valor inteiro para B: ");
		B = leia.nextInt();
		System.out.println("Dê um valor inteiro para C: ");
		C = leia.nextInt();

		leia.close();
		somaAB = A + B;

		if (somaAB > C) {
			System.out.println("A Soma de A + B é Maior do que C");
		} else if (somaAB < C) {
			System.out.println("A Soma de A + B é Menor do que C");
		} else {
			System.out.println("A Soma de A + B é Igual a C");
		}
	}
}