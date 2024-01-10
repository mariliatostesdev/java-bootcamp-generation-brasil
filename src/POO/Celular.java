package POO;

public class Celular extends Telefone {

	public Celular() {
		super("Telefone Celular");
	}
	
	@Override
	public void toca(int codigoToque) {
		
		switch(codigoToque) {
		case 1:
			System.out.println("\nTitititututu Titititututu Titititututu");
			break;
		case 2:
			System.out.println("\nPowwwwwww Powwwwwww");
			break;
		default:
			System.out.println("");
			break;
		}
	}
	
	@Override
	public void discar(String numero) {
		System.out.println("\nO número: " + numero + " é um celular.");
	}
	
}
