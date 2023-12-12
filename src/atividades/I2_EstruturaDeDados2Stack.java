package atividades;

import java.util.Stack;

public class I2_EstruturaDeDados2Stack {

	public static void main(String[] args) {
		
		Stack<String> pilha = new Stack<String>();
		
		pilha.push("Prato Verde");
		pilha.push("Prato Azul");
		pilha.push("Prato Branco");
		pilha.push("Prato Amarelo");
		pilha.push("Prato Vermelho");
		
		System.out.println("\nElementos da Pilha: " + pilha);
		
		pilha.pop();
		
		System.out.println("\nElemento retirado da Pilha: " + pilha);

	}

}
