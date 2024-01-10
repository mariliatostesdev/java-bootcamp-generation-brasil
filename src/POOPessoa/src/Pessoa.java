
public class Pessoa {
	public String nome;
	public String email;
	public String cpf;

	public String exibirDados() {
		return "=== Dados da Pessoa ===" + "\n" + "Nome: " + this.nome + "\n" + "Email: " + this.email + "\n" + "CPF: "
				+ this.cpf;
	}

	public static void main(String[] args) {
	// Definindo um objeto pessoa.
	Pessoa andre = new Pessoa();
    
    andre.nome = "André Silva";
    andre.email = "andre@email.com";
    andre.cpf = "1111111-11";
    System.out.println(andre.exibirDados());

     //Definindo um outro objeto pessoa.
     Pessoa helen = new Pessoa();
     helen.nome = "Helen Cardoso";
     helen.email = "helen@email.com";
     helen.cpf = "2222222-22";
     System.out.println(helen.exibirDados());
	}
}