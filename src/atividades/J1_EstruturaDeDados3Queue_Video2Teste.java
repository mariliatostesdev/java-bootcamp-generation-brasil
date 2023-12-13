package atividades;

public class J1_EstruturaDeDados3Queue_Video2Teste {

	public static void main(String[] args) {

		J1_EstruturaDeDados3Queue_Video2 fila = new J1_EstruturaDeDados3Queue_Video2(3);

		fila.enqueue(10);
		System.out.println("Elemento adicionado na fila: " + fila.pegarFim());
		
		fila.enqueue(20);
		System.out.println("Elemento adicionado na fila: " + fila.pegarFim());
		
		fila.enqueue(30);
		System.out.println("Elemento adicionado na fila: " + fila.pegarFim());
		
		fila.enqueue(40);
		
		fila.dequeue();

	}

}
