package exerciciosindividuais;

import java.util.Scanner;

public class D_CalculoDiferenca {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		float[] numeros = new float[4];
		float diferenca;
		int i;

		for (i=0; i < 4; i++) {
			System.out.println("Digite o " + (i + 1) + "º número: ");
			numeros[i] = (float) leia.nextFloat();
		}

		diferenca = (numeros[0] * numeros[1]) - (numeros[2] * numeros[3]);

		System.out.println("A diferença do produto entre o n1 e n2 pelo produto entre o n3 e o n4 é:\n" + diferenca);

		leia.close();

	}
}