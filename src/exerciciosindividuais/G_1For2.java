package exerciciosindividuais;

import java.util.Scanner;

public class G_1For2 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		int i;
		int num;
		int contPares = 0; 
		int contImpares = 0;

		for (i = 1; i <= 10; i++) {
			System.out.println("\nDigite o " + i + "º número: ");
			num = read.nextInt();


			if (num % 2 == 0) {
				contPares++;
			} else {
				contImpares++;
			}

		}


		System.out.println("\n----------");
		System.out.println("\nTotal de números pares: " + contPares);
		System.out.println("\nTotal de números ímpares: " + contImpares);

	}


}