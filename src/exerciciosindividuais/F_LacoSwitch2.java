package exerciciosindividuais;

import java.util.Scanner;

public class F_LacoSwitch2 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String nomeColaborador, cargoColaborador = null;
		int codigoCargoColaborador;
		float salarioInicial, reajuste = 1, salarioFinal;
		System.out.println("\nQual o nome do(a) colaborador(a)?");
		nomeColaborador = leia.nextLine();
		System.out.println("\nQual o código do cargo do(a) colaborador(a)? (1 a 6)");
		codigoCargoColaborador = leia.nextInt();
		System.out.println("\nQual o salário inicial do(a) colaborador(a)? (sem . e ,)");
		salarioInicial = leia.nextFloat();
		leia.close();
		switch (codigoCargoColaborador) {
		case 1:
			cargoColaborador = "Gerente";
			reajuste = 1.1f;
			break;
		case 2:
			cargoColaborador = "Vendedor(a)";
			reajuste = 1.07f;
			break;
		case 3:
			cargoColaborador = "Supervisor(a)";
			reajuste = 1.09f;
			break;
		case 4:
			cargoColaborador = "Motorista";
			reajuste = 1.06f;
			break;
		case 5:
			cargoColaborador = "Estoquista";
			reajuste = 1.05f;
			break;
		case 6:
			cargoColaborador = "Técnico(a) de TI";
			reajuste = 1.08f;
			break;
		default:
			System.out.println("Código inválido. Insira um número inteiro de 1 a 6.");
			break;
		}
		salarioFinal = salarioInicial * reajuste;
		System.out.println("\n -> Nome do(a) colaborador(a): " + nomeColaborador);
		System.out.println("\n -> Cargo: " + cargoColaborador);
		System.out.println("\n -> Salário: R$" + salarioFinal);
	}
}