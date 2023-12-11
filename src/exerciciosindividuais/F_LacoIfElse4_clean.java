package exerciciosindividuais;
import java.util.Scanner;
public class F_LacoIfElse4_clean {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		System.out.println("\nA partir de características, chegaremos a possíveis animais.");
		askAnimalType("animal", "Vertebrado", "Invertebrado");

		String adjective1 = read.nextLine();

		if ("Vertebrado".equalsIgnoreCase(adjective1)) {
			processVertebrado(read);
		} else if ("Invertebrado".equalsIgnoreCase(adjective1)) {
			processInvertebrado(read);
		}

		read.close(); // Fechar o Scanner para evitar vazamento de recursos.
	}

	private static void processVertebrado(Scanner read) {
		askAnimalType("vertebrado", "Ave", "Mamífero");
		String adjective2 = read.nextLine();

		if ("Ave".equalsIgnoreCase(adjective2)) {
			processAve(read);
		} else if ("Mamífero".equalsIgnoreCase(adjective2)) {
			processMamifero(read);
		}
	}

	private static void processAve(Scanner read) {
		askAnimalType("ave", "Carnívora", "Onívora");
		String adjective3 = read.nextLine();

		if ("Carnívora".equalsIgnoreCase(adjective3)) {
			printFinalAnimal("Águia");
		} else {
			printFinalAnimal("Pomba");
		}
	}

	private static void processMamifero(Scanner read) {
		askAnimalType("mamífero", "Onívoro", "Herbívoro");
		String adjective3 = read.nextLine();

		if ("Onívoro".equalsIgnoreCase(adjective3)) {
			printFinalAnimal("Ser Humano");
		} else {
			printFinalAnimal("Vaca");
		}
	}

	private static void processInvertebrado(Scanner read) {
		askAnimalType("invertebrado", "Inseto", "Anelídeo");
		String adjective2 = read.nextLine();

		if ("Inseto".equalsIgnoreCase(adjective2)) {
			processInseto(read);
		} else if ("Anelídeo".equalsIgnoreCase(adjective2)) {
			processAnelideo(read);
		}
	}

	private static void processInseto(Scanner read) {
		askAnimalType("inseto", "Hematófago", "Herbívoro");
		String adjective3 = read.nextLine();

		if ("Hematófago".equalsIgnoreCase(adjective3)) {
			printFinalAnimal("Pulga");
		} else {
			printFinalAnimal("Lagarta");
		}
	}

	private static void processAnelideo(Scanner read) {
		askAnimalType("anelídeo", "Hematófago", "Onívoro");
		String adjective3 = read.nextLine();

		if ("Hematófago".equalsIgnoreCase(adjective3)) {
			printFinalAnimal("Sanguessuga");
		} else {
			printFinalAnimal("Minhoca");
		}
	}
	
	private static void askAnimalType(String type, String option1, String option2)
	{
		System.out.println("Esse " + type + " é: \n\t- " + option1 + " \n\t- " + option2);
	}
	
	private static void printFinalAnimal(String finalAnimal)
	{
		System.out.println("Seu animal é um(a) " + finalAnimal + "!");
	}
}