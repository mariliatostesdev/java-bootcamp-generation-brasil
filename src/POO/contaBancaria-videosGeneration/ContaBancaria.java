package POO.contaBancaria.videosGeneration;

public class ContaBancaria {

	private int numero;
	private int agencia;
	private String tipo;
	private String titular;
	private float saldo;
	
	public ContaBancaria() {}
	
	public ContaBancaria(int numero, int agencia, String tipo, String titular, float saldo) {
		super();
		this.numero = numero;
		this.agencia = agencia;
		this.tipo = tipo;
		this.titular = titular;
		this.saldo = saldo;
	}
	//métodos acessores da Classe ContaBancaria
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	public boolean sacar(float valorASacar) {
		if (this.getSaldo() < valorASacar) {
			System.out.println("\nSaldo insuficiente para ser sacado.");
			return false;
		}
		this.setSaldo(this.getSaldo() - valorASacar);
		
		return true;
	}
	
	public void depositar(float valorDepositado) {
		this.setSaldo(this.getSaldo() + valorDepositado);
	}
	
}
