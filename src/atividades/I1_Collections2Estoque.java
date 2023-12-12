package atividades;

import java.util.ArrayList;
import java.util.Scanner;

public class I1_Collections2Estoque {

	public static void main(String[] args) {

		int op;

		Scanner input = new Scanner(System.in);

		ArrayList<String> estoque = new ArrayList();

		do {

			System.out.println("\n-------------------------------------");
			System.out.println("\n\tMenu do Estoque");
			System.out.println("\n(1) Deseja adicionar produtos ao estoque?");
			System.out.println("\n(2) Deseja mostrar produtos do estoque?");
			System.out.println("\n(3) Deseja atualizar produtos ao estoque?");
			System.out.println("\n(4) Deseja remover produtos do estoque?");
			System.out.println("\n(0) Deseja sair do programa?");
			System.out.println("\n-------------------------------------");
			System.out.println("\nDigite sua opção:");
			op = input.nextInt();

			switch (op) {
			case 1:
				input.nextLine();
				System.out.println("\nDigite o produto para adicionar ao estoque: ");
				String produto = input.nextLine();
				estoque.add(produto);
				break;
			case 2:
				input.nextLine();
				System.out.println("\nOs produtos do estoque são: ");
				System.out.println(estoque);
				break;
				
			case 3:
				input.nextLine();
				System.out.println("\nDigite o produto que deseja atualizar:");
				String verifica = input.nextLine();

				if (!estoque.contains(verifica)) {
					System.out.println("\n\tProduto inexistente.\n");
					break;
				} else {
					System.out.println("\nDigite o produto que entrará no lugar do " + verifica + ":");
					String novoProduto = input.nextLine();
					estoque.remove(verifica);
					estoque.add(novoProduto);
					System.out.println(estoque);
				}
				break;
				
			case 4:
				input.nextLine();
				System.out.println("\nDigite o nome do produto para remover do estoque:");
				String produtor = input.nextLine();
				if (estoque.contains(produtor)) {
					estoque.remove(produtor);
				} else {
					System.out.println("\nProduto não existe no estoque!!!");
				}
				
				System.out.println(estoque);
				break;
			case 0:
				System.out.println("\nMuito obrigada por utilizar nosso programa de estoque. \nVolte sempre!!!");
				break;
				default:
					System.out.println("\n\tOpção inválida");

			}
			
		} while (op != 0);
		
	}
}
