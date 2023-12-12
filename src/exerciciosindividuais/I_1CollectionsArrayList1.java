package exerciciosindividuais;
import java.util.ArrayList;
import java.util.Scanner;

public class I_1CollectionsArrayList1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		ArrayList<String> cores = new ArrayList<String>();
		
		String cor;			
		//	Se eu quisesse já inserir um valor: "String c = String.valueOf("Cores")";
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Digite a cor " + (i+1) + ":");
			cor = input.nextLine();
			cores.add(cor);
		}
		
		System.out.println("\n\nCores em ordem de adição: " + cores.toString());
		
		cores.sort(null);
		
		System.out.println("\n\nCores em ordem crescente: " + cores.toString());
		
		input.close();
	}
	
}
