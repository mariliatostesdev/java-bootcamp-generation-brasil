package POO.contaBancaria.videosGeneration;

public class ContaCorrente extends ContaBancaria {

	private float limite;

	public ContaCorrente(int numero, int agencia, String tipo, String titular, float saldo, float limite) {
		super(numero, agencia, tipo, titular, saldo);
		this.limite = limite;
	}

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}

	// precisamos aprimorar o método "sacar" para a conta corrente, pois agora temos
	// a variável nova "limite".
	public boolean sacar(float valorASacar) {
		if (this.getSaldo() + this.getLimite() < valorASacar) {
			System.out.println("\n\tSaldo insuficiente.");
			return false;
		}

		this.setSaldo(this.getSaldo() - valorASacar);
		System.out.println("\n\tValor sacado com sucesso.");
		return true;
	}

}
