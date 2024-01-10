package testesEstudosIndividuais;

interface Operacao {
    int calcular(int a, int b);
}

public class ExpressoesLambda {

	public static void main(String[] args) {
        // Implementação da interface usando expressão lambda
        Operacao soma = (a, b) -> a + b;
        
        // Utilizando a expressão lambda para realizar uma operação
        int resultado = soma.calcular(5, 3);
        
        System.out.println("Resultado da soma: " + resultado);
    }
}
