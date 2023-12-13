package atividades;

public class J1_EstruturaDeDados2Stack_Video1 {
	private int tamanhoMaximo;
	private int[] pilha;
	private int topo;

	public J1_EstruturaDeDados2Stack_Video1 (int s) {
		tamanhoMaximo = s;
		pilha = new int[s];
		topo = -1;
	}

	public void push(int item) {
		if (topo == tamanhoMaximo - 1) {
			System.out.println("A pilha esta cheia, nao posso adicionar mais nada");
		} else {
			topo++;
			pilha[topo] = item;
		}
	}

	public void pop() {
		if (topo == -1) {
			System.out.println("A pilha esta vazia, nem tem mais o que tirar daqui");
		} else {
			System.out.println("Elemento retirado da pilha: " + pilha[topo]);
			topo--;
		}
	}

	public int peek() {
		return pilha[topo];
	}
}
