package atividades;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class I2_EstruturaDeDados1Queue {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		Queue<String> agenda = new LinkedList<String>();

		int op;

		do {
			System.out.println("\n--------------------------");
			System.out.println("\n\tMenu de Agendamento:");
			System.out.println("\n(1) Adicionar agendamento?");
			System.out.println("\n(2) Mostrar agenda?");
			System.out.println("\n(3) Pesquisar agendamento?");
			System.out.println("\n(4) Agendamento concluído?");
			System.out.println("\n(0) Sair?");
			System.out.println("\n--------------------------");
			System.out.println("\nDigite sua opção:");
			op = input.nextInt();

			switch (op) {
			case 1:
				input.nextLine();
				System.out.println("\nDigite o nome: ");
				agenda.add(input.nextLine());
				break;
			case 2:
				input.nextLine();
				System.out.println("\nNomes agendados: ");
				System.out.println(agenda);
				break;
			case 3:
				input.nextLine();
				System.out.println("\nDigite o nome: ");
				System.out.println("\nEste nome: " + agenda.contains(input.nextLine()));
				break;
			case 4:
				input.nextLine();
				System.out.println("\nNome: " + agenda.remove() + " - atendimento concluído.");
				break;
			default:
				break;
			}

		} while (op != 0);

		input.close();

	}

}
