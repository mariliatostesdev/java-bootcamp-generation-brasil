package exerciciosindividuais;

import java.util.Scanner;

public class C_SalarioLiquido {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		float salariobruto, adicionalnoturno, horasextras, descontos, salarioliquido;

		System.out.println("Digite o Salário Bruto: ");
		salariobruto = leia.nextFloat();
		System.out.println("Digite O Adicional Noturno: ");
		adicionalnoturno = leia.nextFloat();
		System.out.println("Digite as Horas Extras: ");
		horasextras = leia.nextFloat();
		System.out.println("Digite os Descontos: ");
		descontos = leia.nextFloat();

		salarioliquido = (salariobruto + adicionalnoturno + (horasextras * 5) - descontos);

		System.out.println("O Salário Líquido é de: R$" + salarioliquido);

		leia.close();
		
	}
}