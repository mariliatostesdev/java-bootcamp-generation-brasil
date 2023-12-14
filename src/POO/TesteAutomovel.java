package POO;

public class TesteAutomovel {
	public static void main(String[] args) {
		// instanciando um objeto da classe AUtomovel

		// E aí, qual construtor 'Automovel' vou usar? Depende dos argumentos que eu
		// passar!
		// Se eu passar argumentos X, Y, Z, vou estar usando o construtor que só pede X,
		// Y e Z!
		Automovel auto1 = new Automovel("Marília Tostes", "Celta", "NTO2022", 2011);

		auto1.imprimirInfo();

		System.out.println("\n\t***************Transferência de Automóvel*************");

		// Vamos modificar nomeProprietario com o set:
		auto1.setNomeProprietario("Natália Olgado");

		// Vamos ver se a proprietária mudou mesmo:
		auto1.imprimirInfo();
		
		// Agora vamos mudar a placa para modelo mercosul, que possui letra no lugar do 2º número:
		System.out.println("\n\t***************Mudança de Placa*************");

		auto1.setPlaca("NTO2T22");
		
		auto1.imprimirInfo();
		
	}

}
