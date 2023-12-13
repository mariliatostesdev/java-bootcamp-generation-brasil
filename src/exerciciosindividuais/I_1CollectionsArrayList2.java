package exerciciosindividuais;

import java.util.ArrayList;
import java.util.Scanner;

public class I_1CollectionsArrayList2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> numeros = new ArrayList<Integer>();

		int num;
		String continua;

		System.out.println("\nDigite 10 números inteiros.");

		for (int i = 0; i < 10; i++) {
			System.out.println("\nDigite o " + (i + 1) + "º número:");
			num = input.nextInt();
			numeros.add(num);
		}

		while (true) {
			System.out.println("\nDigite um número para buscar sua posição na lista.");
			num = input.nextInt();
			input.nextLine();
			if (numeros.contains(num)) {
				System.out.println("\n\nO número " + num + " está localizado na posição " + (numeros.indexOf(num)));
			} else {
				System.out.println("\n\nO número " + num + " não foi encontrado!");
			}
			System.out.println("\n\nDeseja repetir? (S/N)");
			continua = input.nextLine();
			if (!continua.equalsIgnoreCase("S")) {
				System.out.println("\n\nPrograma finalizado.");
				break;
			}
		}

		input.close();
	}

}
