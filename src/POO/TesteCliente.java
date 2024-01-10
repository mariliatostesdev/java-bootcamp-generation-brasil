package POO;

public class TesteCliente {

	public static void main(String[] args) {

		Cliente c1 = new Cliente("Marília Tostes", 25, "Dev Jr", 5000, "marilia@marilia.com");
		PessoaFisica pf = new PessoaFisica("Claudia Tostes", 58, "Servidora Pública", 10000, "claudia@claudia.com",
				"123.456.789-45", "78.945.621-8");
		PessoaJuridica pj = new PessoaJuridica("Rafael Tostes", 27, "Game Dev", 6000, "rafael@rafael.com",
				"45.456.123/0001-00");

		System.out.println("\n**************************");
		c1.visualizar();
		System.out.println("\n**************************");
		pf.visualizar();
		System.out.println("\n**************************");
		pj.visualizar();
		System.out.println("\n**************************");

	}

}
