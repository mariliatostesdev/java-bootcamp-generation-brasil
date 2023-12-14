package POO;

public class TesteEmpregado {

	public static void main(String[] args) {
		
		Empregado[] lista = new Empregado[3];
		
		lista[0] = new Empregado("Eric Antunes",20000);
		lista[1] = new Empregado("Daniel Lugli",35000);
		lista[2] = new Empregado("Ellen Cristina Moreira Arruda",50000);
		
		for(Empregado roda:lista) {
			roda.imprimir();
		}
		
		System.out.println("*******************");
		
		for(Empregado roda:lista) {
			roda.aumentarSalario(10);
			roda.imprimir();
		}
		

	}

}