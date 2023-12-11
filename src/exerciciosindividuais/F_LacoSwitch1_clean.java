package exerciciosindividuais;

import java.util.Scanner;

public class F_LacoSwitch1_clean {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int codigoProduto, qtdeProduto, precoTotal;
		String produtoEscolhido;
		String[] produtos = {"Cachorro Quente", "X-Salada", "X-Bacon", "Bauru", "Refrigerante",
				"Suco de Laranja" };
		int[] precos = {10, 15, 18, 12, 8, 13 };
		System.out.println("\nMenu de produtos: ");
		System.out.println("1- Cachorro Quente (R$10)");
		System.out.println("2- X-Salada (R$15)");
		System.out.println("3- X-Bacon (R$18)");
		System.out.println("4- Bauru (R$12)");
		System.out.println("5- Refrigerante (R$8)");
		System.out.println("6- Suco de Laranja (R$13)");
		System.out.println("\nQual o número do lanche que você deseja?");
		codigoProduto = leia.nextInt();
		produtoEscolhido = produtos[codigoProduto-1];
		System.out.println("\nQuantas unidades de " + produtoEscolhido + " você deseja?");
		qtdeProduto = leia.nextInt();
		
		leia.close();	
		
		precoTotal = precos[codigoProduto-1] * qtdeProduto;
		System.out.println("\nVocê pediu " + qtdeProduto + " unidade(s) de " + produtoEscolhido
				+ ".\nO valor total do seu pedido é de R$" + precoTotal + ".");
	}
}