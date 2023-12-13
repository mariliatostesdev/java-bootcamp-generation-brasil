package exerciciosindividuais;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class J_1EstruturaDeDados1Queue {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Queue<String> clientes = new LinkedList<String>();

		int maximo = 5;
		int totalClientes = 0;
		int choice;
		String continua = "S";
		String novoCliente;

		System.out.println("************************************************");
		System.out.println("\t\tOpções:\n");
		System.out.println("(1) - Adicionar Clientes na Fila");
		System.out.println("(2) - Listar todos os Clientes");
		System.out.println("(3) - Retirar Cliente da Fila");
		System.out.println("(0) - Sair");
		
		while (continua.equalsIgnoreCase("S")) {
			System.out.println("\n************************************************");
			System.out.println("\nO que você deseja?");
			choice = input.nextInt();
			input.nextLine();

			switch (choice) {
			case 1:
				// Add cliente (Queue -> add)
				if (totalClientes < maximo) {
					System.out.println("\nQual o nome do cliente que deseja adicionar à fila?");
					novoCliente = input.nextLine();
					clientes.add(novoCliente);
					totalClientes++;
					System.out.println("\nCliente " + novoCliente + " adicionado!");
					System.out.println("\nFila atual: " + clientes);
					break;
				} else {
					System.out.println("\nSinto muito, a fila está lotada. (Máximo 5 clientes)");
					break;
				}
			case 2:
				// Listar clientes (
				if (totalClientes != 0) {
					System.out.println("\nFila atual: " + clientes);
					break;
				} else {
					System.out.println("\nA fila está vazia! \n" + clientes);
					break;
				}
			case 3:
				// Retirar pessoa da lista (Queue -> remove)
				if (totalClientes != 0) {
					System.out.println("\nRetirando pessoa da fila...");
					System.out.println("\nO cliente " + clientes.peek() + " foi chamado!");
					clientes.remove();
					totalClientes--;
					System.out.println("\nFila atual: " + clientes);
					break;
				} else {
					System.out.println("\nA fila já está vazia, não há clientes para remover.");
					break;
				}
			case 0:
				// Finalizar programa
				System.out.println("\nPrograma finalizado!");
				System.out.println("\n\nObrigada, volte sempre!");
				continua = "N";
				break;
			default:
				System.out.println("\nOpção inválida.");
				break;
			}

		}
		
		input.close();

	}

}
