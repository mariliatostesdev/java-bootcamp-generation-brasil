package atividades;

public class J1_EstruturaDeDados3Queue_Video2 {
	private int tamanhoMaximo;
	private int[] fila;
	private int inicio;
	private int fim;
	private int total;

	public J1_EstruturaDeDados3Queue_Video2(int s) {
		tamanhoMaximo = s;
		fila = new int[s];
		inicio = 0;
		fim = -1;
		total = 0;
	}

	public int pegarInicio() {
		return fila[inicio];
	}

	public int pegarFim() {
		return fila[fim];
	}

	public boolean checarCheio() {
		return total == tamanhoMaximo;
	}

	public boolean checarVazio() {
		return total == 0;
	}

	public void enqueue(int item) {
		if (checarCheio()) {
			System.out.println("A fila já está cheia, não é possível inserir mais elementos.");
		} else {
			fim++;
			fila[fim] = item;
			total++;
		}
	}

	public void dequeue() {
		if (checarVazio()) {
			System.out.println("A fila já está vazia, não é possível remover mais elementos.");
		} else {
			System.out.println("Elemento removido da fila: " + fila[inicio]);
			inicio++;
			total--;
		}
	}

}
