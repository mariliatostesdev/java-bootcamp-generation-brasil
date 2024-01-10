import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStrings {
	public static void main(String[] args) {

		List<String> palavras = new ArrayList<String>();
		palavras.add("alura online");
		palavras.add("editora casa do código");
		palavras.add("caelum");

		Comparator<String> comparador = new ComparadorPorTamanho();

		// Collections.sort(palavras, comparador);
		palavras.sort(comparador);

		System.out.println(palavras);

//		for (String p : palavras) {	// Para cada string(p) em palavras
//			System.out.println(p);
//		}

		Consumer<String> consumidor = new ImprimeNaLinha(); // Para criar uma "variável Consumer, que consome
															// <Strings>", preciso de uma classe que a implemente
															// (class ImprimeNaLinha).
		palavras.forEach(consumidor);

		// Vamos criar agora a classe que vai implementar a interface consumidora,
		// porque o forEach recebe um "consumidor de <Strings>"

	}

}

class ImprimeNaLinha implements Consumer<String> {

	@Override
	public void accept(String s) { // O que vou fazer toda vez que for consumir uma String?
		System.out.println(s);
	}
}

class ComparadorPorTamanho implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		if (s1.length() < s2.length())
			return -1;
		if (s1.length() > s2.length())
			return 1;
		return 0;
	}
}
