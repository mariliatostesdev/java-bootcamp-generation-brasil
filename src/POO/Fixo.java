package POO;

public class Fixo extends Telefone {

	public Fixo() {
		super("Telefone Fixo");
	}

	@Override
	public void toca(int numToques) {
		for (int i = 0; i < numToques; i++) {
			System.out.println("\nTrimmmmmmm Trimmmmmmm");
		}
	}

	@Override
	public void discar(String numero) {
		System.out.println("\nO número: " + numero + " é um telefone fixo.");
	}
}
