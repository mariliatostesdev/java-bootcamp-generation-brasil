package exerciciosindividuais;
import java.util.Scanner;
public class F_LacoSwitch3 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		float numero1, numero2, resultado = 0;
		int codigoOperacao;
		String simboloOperacao = null;
		System.out.println("\nVamos realizar cálculos matemáticos entre dois números. \nOBS: Se for um número quebrado, use vírgula, e não ponto.\n\n\tDigite o 1º número:");
		numero1 = leia.nextFloat();
		System.out.println("\n\tDigite o 2º número:");
		numero2 = leia.nextFloat();
		System.out.println("Qual operação deseja realizar?");
		System.out.println("1- Soma");
		System.out.println("2- Subtração");
		System.out.println("3- Multiplicação");
		System.out.println("4- Divisão");
		codigoOperacao = leia.nextInt();
		leia.close();
		if (codigoOperacao < 1 || codigoOperacao > 4) {
			System.out.println("\nOperação Inválida!");
		} else {
			switch (codigoOperacao) {
			case 1:
				resultado = numero1 + numero2;
				simboloOperacao = " + ";
				break;
			case 2:
				resultado = numero1 - numero2;
				simboloOperacao = " - ";
				break;
			case 3:
				resultado = numero1 * numero2;
				simboloOperacao = " x ";
				break;
			case 4:
				resultado = numero1 / numero2;
				simboloOperacao = " ÷ ";
				break;
			}
			System.out.println("\nResultado: \n" + numero1 + simboloOperacao + numero2 + " = " + resultado);
		}
	}
}