package atividades;

public class J1_EstruturaDeDados2Stack_Video2Teste {

	public static void main(String[] args) {

		J1_EstruturaDeDados2Stack_Video1 pilha = new J1_EstruturaDeDados2Stack_Video1(3);

		pilha.push(10);
		System.out.println("Elemento adicionado ao topo: " + pilha.peek());
		
		pilha.push(20);
		System.out.println("Elemento adicionado ao topo: " + pilha.peek());
		
		pilha.push(30);
		System.out.println("Elemento adicionado ao topo: " + pilha.peek());
		
		pilha.push(40);
		
		pilha.pop();

	}

}
