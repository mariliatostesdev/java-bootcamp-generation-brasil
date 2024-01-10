package POO;

public class PessoaFisica extends Cliente {

	private String cpf;
	private String rg;

	public PessoaFisica(String nome, int idade, String profissao, float renda, String email, String cpf, String rg) {
		super(nome, idade, profissao, renda, email);
		this.cpf = cpf;
		this.rg = rg;
	}
	
	public void visualizar () {
		super.visualizar();
		System.out.println("\nCPF: " + this.cpf);
		System.out.println("\nRG: " + this.rg);
	}


}
