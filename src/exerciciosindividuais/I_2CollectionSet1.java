package exerciciosindividuais;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class I_2CollectionSet1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Set<Integer> numeros = new HashSet<Integer>();

		System.out.println("Digite 10 números inteiros, não repetidos.");

		for (int i = 0; i < 10; i++) {
			System.out.println("\nDigite o " + (i + 1) + "º número:");
			int num = input.nextInt();
			while (numeros.contains(num)) {
				System.out.println("\nEsse número já foi inserido!");
				System.out.println("\nDigite o " + (i + 1) + "º número:");
				num = input.nextInt();
			}
			
			numeros.add(num);

		}

		System.out.println("\n\nLista de dados fornecidos: ");

		Iterator<Integer> iNumeros = numeros.iterator();

		while (iNumeros.hasNext()) {
			System.out.println(iNumeros.next().toString());
		}

		input.close();

	}

}
