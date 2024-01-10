package POO;

public class TesteTelefone {

	public static void main(String[] args) {
		Celular celular = new Celular();
		Fixo fixo = new Fixo();
		Publico publico = new Publico();

		Telefone telefone = null;
		// Mas a classe abstrata não pode ser instanciada! E aí?
		// Aqui não estou instanciando, estou criando uma variável (não um objeto!!)

		int n = (int) (Math.random() * 3.0);
		System.out.println("\nO número escolhido aleatoriamente foi: " + n);

		switch (n) {
		case 0:
			telefone = celular;
			break;
		case 1:
			telefone = fixo;
			break;
		case 2:
			telefone = publico;
			break;
		default:
			System.out.println("\nErro inesperado!!!");
		}
		
		if (telefone != null) {
			telefone.discar("81443147");
			telefone.toca(2);
		}
		

	}

}
