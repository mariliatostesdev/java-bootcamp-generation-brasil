package optional;

import java.util.Optional;

public class TesteOptional {

	public static void main(String[] args) {
		
		String[] palavras = new String[10];
		
		Optional<String> checaNulo = Optional.ofNullable(palavras[5]);

		if(checaNulo.isPresent()) {
			String palavra = palavras[5].toLowerCase();
			System.err.println(palavra);
		} else {
			System.out.println("\nA palavra selecionada é nula!");
		}
		
	}

}
