package exerciciosindividuais;

import java.util.Scanner;
import java.util.Stack;

public class J_2EstruturaDeDados1Stack {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Stack<String> livros = new Stack<String>();

		int choice;
		int totalLivros = 0;
		int maximo = 3;
		String novoLivro;
		String continua = "S";

		System.out.println("************************************************");
		System.out.println("\t\tOpções:\n");
		System.out.println("(1) - Adicionar Livro na Pilha");
		System.out.println("(2) - Listar todos os Livros");
		System.out.println("(3) - Retirar Livro da Pilha");
		System.out.println("(0) - Sair");

		while (continua.equalsIgnoreCase("S")) {
			System.out.println("\n************************************************");
			System.out.println("\nO que você deseja?");
			choice = input.nextInt();
			input.nextLine();

			switch (choice) {
			case 1:
				// Add livro (Stack -> push)
				if (totalLivros < maximo) {
					System.out.println("\nQual o nome do livro que deseja adicionar à pilha?");
					novoLivro = input.nextLine();
					livros.push(novoLivro);
					totalLivros++;
					System.out.println("\nLivro " + novoLivro + " adicionado!");
					System.out.println("\nPilha atual: " + livros);
					break;
				} else {
					System.out.println("\nSinto muito, a pilha está lotada. (Máximo 3 livros)");
					break;
				}
			case 2:
				// Listar livros
				if (totalLivros != 0) {
					System.out.println("\nPilha atual: " + livros);
					break;
				} else {
					System.out.println("\nA pilha está vazia! \n" + livros);
					break;
				}
			case 3:
				// Retirar livro da pilha (Stack -> pop)
				if (totalLivros != 0) {
					System.out.println("\nRetirando livro da pilha...");
					System.out.println("\nO livro " + livros.peek() + " foi retirado!");
					livros.pop();
					totalLivros--;
					System.out.println("\nPilha atual: " + livros);
					break;
				} else {
					System.out.println("\nA pilha já está vazia, não há livros para remover.");
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

			input.close();
			
		}
	}
}
