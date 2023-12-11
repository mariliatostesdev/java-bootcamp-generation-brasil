package exerciciosindividuais;

import java.util.Scanner;

public class A_SomaSalario {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		float salario, abono, novoSalario;
		
		System.out.println("Digite o Salário: ");
		salario = leia.nextFloat();
		System.out.println("Digite o Abono: ");
		abono = leia.nextFloat();
		
		novoSalario = salario + abono;
		System.out.println("\nSeu novo salário é: " + novoSalario);

		leia.close();
		
		
	}
}