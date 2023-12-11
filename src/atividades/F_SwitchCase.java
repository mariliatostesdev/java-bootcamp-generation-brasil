package atividades;

import java.util.Scanner;

public class F_SwitchCase {
	public static void main(String[] args) {
		
		int op;

		Scanner leia = new Scanner(System.in);

		System.out.println("\n\t\tMenu de emoções: ");
		System.out.println("\n1- Gratidão");
		System.out.println("\n2- Amor");
		System.out.println("\n3- Felicidade");
		System.out.println("\n4- Contentamento");
		System.out.println("\n5- Orgulho");
		System.out.println("\nDigite a sua opção: ");
		
		op = leia.nextInt();
		
		switch (op) {
		case 1:
			System.out.println("\nSentimento de Gratidão");
			break;
		case 2:
			System.out.println("\nSentimento de Amor");
			break;
		case 3:
			System.out.println("\nSentimento de Felicidade");
			break;
		case 4:
			System.out.println("\nSentimento de Contentamento");
			break;
		case 5:
			System.out.println("\nSentimento de Orgulho");
			break;
		default:
			System.out.println("\nOpção Inválida!!!");
		}
		
	}
}