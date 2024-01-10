package POO.contaBancaria.videosGeneration;

public class TestaConta {

	public static void main(String[] args) {
		// Instanciar um Objeto da Classe ContaBancaria
//		ContaBancaria novaConta = new ContaBancaria();
		ContaCorrente novaCC = new ContaCorrente(32, 33, "Conta Corrente", "Tadeu", 4000.0f, 3000.0f);
		
		System.out.println("\nSaldo Inicial: " + novaCC.getSaldo());
		novaCC.sacar(1500.0f);
		System.out.println("\nSaldo pós saque: " + novaCC.getSaldo());
		
		
		// passar individualmente os valores da nova conta, usando métodos
		// acessores SET para alterar/inserir os valores
		
//		novaConta.setNumero(32);
//		novaConta.setAgencia(453);
//		novaConta.setTipo("Conta Corrente");
//		novaConta.setTitular("Marília Tostes");
//		novaConta.setSaldo(2345);
//		
		
		// Agora vamos usar o método acessor GET para imprimir no console
		// as informações que acabamos de inserir no Objeto novaConta.
//		System.out.println("Numero da conta: " + novaConta.getNumero());
//		System.out.println("Número da agência: " + novaConta.getAgencia());
//		System.out.println("Tipo da conta: " + novaConta.getTipo());
//		System.out.println("Titular da conta: " + novaConta.getTitular());
//		System.out.println("Saldo da conta: " + novaConta.getSaldo());
	
	}

}
