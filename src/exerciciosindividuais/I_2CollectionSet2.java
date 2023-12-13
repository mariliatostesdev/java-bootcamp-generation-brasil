package exerciciosindividuais;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class I_2CollectionSet2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Set<Integer> numeros = new HashSet<Integer>();

		int num;
		String continua;
		int[] numAdd = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };

		for (int elem : numAdd) {
			numeros.add(elem); // Se fosse add Strings: "String c = String.valueOf("Cores")";
		}
		
		System.out.println("Temos uma lista de 10 números inteiros.");
		
		while (true) {
			System.out.println("\nDigite o número que deseja buscar na lista:");
			num = input.nextInt();
			input.nextLine();
			
			if (numeros.contains(num)) {
				System.out.println("\n\nO número " + num + " foi encontrado!");
				
				System.out.println("\n-----------------------------");
				System.out.println("\nDeseja continuar? (S/N)");
				continua = input.nextLine();
				
				if (!continua.equalsIgnoreCase("S")) {
					System.out.println("\n---------- Programa finalizado ----------");
					break;
				}
			} else {
				System.out.println("\nO número " + num + " não foi encontrado.");
				System.out.println("\n---------- Programa finalizado ----------");
				break;
			}
		}
		
		input.close();

	}

}
