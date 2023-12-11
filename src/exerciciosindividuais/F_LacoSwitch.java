package exerciciosindividuais;

import java.util.Scanner;

public class F_LacoSwitch {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int operacao;
		float saldo = 1000, valorSaque, valorDeposito;
		System.out.println("\nDigita a operação desejada: ");
		System.out.println("\n\t1- Saldo");
		System.out.println("\n\t2- Saque");
		System.out.println("\n\t3- Depósito");
		operacao = read.nextInt();
		if (operacao >= 1 && operacao <= 3) {
			switch (operacao) {
			case 1:
				System.out.println("\nSeu saldo atual é de R$" + saldo);
				break;
			case 2:
				System.out.println("\nQual valor deseja sacar?");
				valorSaque = read.nextFloat();
				if (valorSaque <= saldo) {
					System.out.println("\nSaque de R$" + valorSaque + " efetuado com sucesso! \nSeu saldo atual é de R$"
							+ (saldo - valorSaque));
				} else {
					System.out.println("\nSaldo insuficiente. Seu saldo atual é de " + saldo);
				}
				break;
			case 3:
				System.out.println("\nQual valor deseja depositar?");
				valorDeposito = read.nextFloat();
				System.out.println("\nDepósito de R$" + valorDeposito
						+ " efetuado com sucesso! \nSeu saldo atual é de R$" + (saldo + valorDeposito));
				break;
			}
		} else {
			System.out.println("\nOperação inválida!");
		}
		read.close();
	}
}