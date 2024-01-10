package POO.contaBancaria.videosGeneration;

public class TestaControle {

	public static void main(String[] args) {
		
		ControleRemoto novoControle = new ControleRemoto();
		
		System.out.println("\nChamando carro: " + novoControle.controlar("Carro"));
		System.out.println("\nChamando navio: " + novoControle.controlar("Navio", true, true));
		System.out.println("\nChamando avião: " + novoControle.controlar("Avião", true));

	}

}
