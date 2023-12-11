package exerciciosindividuais;

import java.util.Scanner;

public class F_LacoIfElse4 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		String adjective1, adjective2, adjective3;
		System.out.println("\nA partir de características, chegaremos a possíveis animais.");
		System.out.println("\nO animal é: \n\t- Vertebrado \n\t- Invertebrado");
		adjective1 = read.nextLine();
		if (adjective1.equalsIgnoreCase("Vertebrado")) {
			System.out.println("Esse vertebrado é: \n\t- Ave \n\t- Mamífero");
			adjective2 = read.nextLine();
			if (adjective2.equalsIgnoreCase("Ave")) {
				System.out.println("Essa ave é: \n\t- Carnívora \n\t- Onívora");
				adjective3 = read.nextLine();
				if (adjective3.equalsIgnoreCase("Carnívora")) {
					System.out.println("Seu animal é uma Águia!");
				} else if (adjective3.equalsIgnoreCase("Onívora")) {
					System.out.println("Seu animal é uma Pomba!");
				} else {
					System.out.println("\nOpção inválida.");
				}
			} else if (adjective2.equalsIgnoreCase("Mamífero")) {
				System.out.println("Esse mamífero é: \n\t- Onívoro \n\t- Herbívoro");
				adjective3 = read.nextLine();
				if (adjective3.equalsIgnoreCase("Onívoro")) {
					System.out.println("Seu animal é o Homem!");
				} else if (adjective3.equalsIgnoreCase("Herbívoro")) {
					System.out.println("Seu animal é uma Vaca!");
				} else {
					System.out.println("\nOpção inválida.");
				}
			} else {
				System.out.println("\nOpção inválida.");
			}
		} else if (adjective1.equalsIgnoreCase("Invertebrado")) {
			System.out.println("Esse invertebrado é: \n\t- Inseto \n\t- Anelídeo");
			adjective2 = read.nextLine();
			if (adjective2.equalsIgnoreCase("Inseto")) {
				System.out.println("Esse inseto é: \n\t- Hematófago \n\t- Herbívoro");
				adjective3 = read.nextLine();
				if (adjective3.equalsIgnoreCase("Hematófago")) {
					System.out.println("Seu animal é uma Pulga!");
				} else if (adjective3.equalsIgnoreCase("Herbívoro")) {
					System.out.println("Seu animal é uma Lagarta!");
				} else {
					System.out.println("\nOpção inválida.");
				}
			} else if (adjective2.equalsIgnoreCase("Anelídeo")) {
				System.out.println("Esse anelídeo é: \n\t- Hematófago \n\t- Onívoro");
				adjective3 = read.nextLine();
				if (adjective3.equalsIgnoreCase("Hematófago")) {
					System.out.println("Seu animal é uma Sanguessuga!");
				} else if (adjective3.equalsIgnoreCase("Onívoro")) {
					System.out.println("Seu animal é uma Minhoca!");
				} else {
					System.out.println("\nOpção inválida.");
				}
			}
		} else {
			System.out.println("\nOpção inválida.");
		}
		
		read.close();
	}
}