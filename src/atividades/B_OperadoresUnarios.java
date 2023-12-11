
package atividades;

// Operadores Unários e Operadores de Atribuição

public class B_OperadoresUnarios {

	public static void main(String[] args) {
		int x = 10;
		int y = 8;

		System.out.println("\nTransformar em Número negativo: " + (x + y));

		System.out.println("\nPré Incrementar: x = ++ y");

		x = ++y;
		// Quando fazemos dessa forma, o valor de x e de y passa a ser 9

		// y foi incrementado, então virou 9.
		// e quando colocamos "++" antes do y, o incremento acontece antes de alterar x

		System.out.println("\nValor de X: " + x);
		System.out.println("\nValor de Y: " + y);

	}
}