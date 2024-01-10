package POO;

public class PessoaJuridica extends Cliente {
	
	private String cnpj;

	public PessoaJuridica(String nome, int idade, String profissao, float renda, String email, String cnpj) {
		super(nome, idade, profissao, renda, email);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public void visualizar () {
		super.visualizar();
		System.out.println("\nCNPJ: " + this.cnpj);
	}

}
