package atividades;

// Operadores Relacionais e Operadores Lógicos
public class D_OperadoresRelacionais {
    public static void main(String[] args) {
    
        int x = 10; 
        int y = 5;
        boolean resul, resul2, resul3, resul4, resposta;
        
        // Operadores Relacionais
        resul = x >= y;
        System.out.println("O valor de x é maior do que o valor de y? " + resul);
        resul2 = x != y;
        System.out.println("O valor de x é diferente do valor de y? " + resul2);
    
        resul3 = x == y;
        System.out.println("O valor de x é maior do que o valor de y? " + resul3);
        resul4 = x == y;
        System.out.println("O valor de x é menor do que o valor de y? " + resul4);
    
        
     // Operadores Lógicos - Conjunção
        System.out.println("\nOperadores Lógicos - Conjunção ");
        resposta = resul & resul3;
        System.out.println("A resul e resul3 são verdadeiras? " + resposta);
        
        // Operadores Lógicos - Disjunção
        System.out.println("\nOperadores Lógicos - Disjunção ");
        resposta = resul || resul4;
        System.out.println("A resul ou resul4 são verdadeiras? " + resposta);
        
    }
}
