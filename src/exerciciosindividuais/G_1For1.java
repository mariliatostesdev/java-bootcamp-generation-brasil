package exerciciosindividuais;

import java.util.Scanner;

public class G_1For1 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		int numMaior, numMenor, i;

		System.out.println("Escreva um número: ");
		numMenor = read.nextInt();

		System.out.println("Agora escreva um número maior do que " + numMenor);
		numMaior = read.nextInt();

		read.close();

		if (numMenor < numMaior) {
			for (i = numMenor; i >= numMenor && i <= numMaior; i++) {
				if (i % 3 == 0 && i % 5 == 0){
					System.out.println(i + " é múltiplo de 3 e 5");
				}
			}
		} else {
			System.out.println("\nIntervalo inválido.");
		}
	}

}