package atividades;

import java.util.Scanner;

public class F_IfElse {
	public static void main(String[] args) {
		float n1, n2, n3, media;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com a nota 1: ");
		n1 = leia.nextFloat();
		System.out.println("\nEntre com a nota 2: ");
		n2 = leia.nextFloat();
		System.out.println("\nEntre com a nota 3: ");
		n3 = leia.nextFloat();
		
		media = (n1+n2+n3)/3;
		
		System.out.println("\nMédia aritmética: " + media);
		
		if (media >= 7 && media <= 10) {
			System.out.println("\nVocê foi aprovade!!!");
		} else if (media >= 5 && media < 7) {
			System.out.println("\nVocê ficou de exame!!!");
		} else if (media >= 0 && media < 5){
			System.out.println("\nVocê foi reprovade!!!");
		} else {
			System.out.println("\nMédia inválida!!!");
		}
	}
}