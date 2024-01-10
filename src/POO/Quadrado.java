package POO;

public class Quadrado extends BaseFigura implements Figuras{

	public Quadrado(double lado, String nome) {
		super(lado, lado, nome);
		nomeClasse = "Quadrado";  // Só pra ficar mais fácil de entender e visualizar
	}

	@Override
	public double getDiagonal() {
		return Math.sqrt(2)*lado1;
	}




}
