package atividades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class I1_Collections1List {

	public static void main(String[] args) {

		List<Integer> minhaLista = new ArrayList<Integer>();

		minhaLista.add(2); // add -> adiciona valores ao ArrayList
		minhaLista.add(1);
		minhaLista.add(5);
		minhaLista.add(8);
		minhaLista.add(2);
		minhaLista.add(1);
		minhaLista.add(3);

		for (Integer listaElementos : minhaLista) {
			System.out.println(listaElementos);
		}

		System.out.println("\nRemovendo um elemento da lista:");
		System.out.println();
		minhaLista.remove(0); // remove -> remove dados baseado nos índices

		for (Integer listaElementos : minhaLista) {
			System.out.println(listaElementos); // debugging
		}
		
		int primeiroElemento = minhaLista.get(0);
		System.out.println("\nO primeiro elemento é: " + primeiroElemento);
		System.out.println("--------------------------");

		for (int i = 0; i < minhaLista.size(); i++) {
			System.out.println("\nElemento: " + minhaLista.get(i));
		}

		System.out.println("--------------------------");

		Collections.sort(minhaLista);
		
		System.out.println("\nDepois de ordenado:");
		System.out.println(minhaLista);
		System.out.println();
		
		Set<Integer> meuSet = new HashSet<Integer>(); 
		
		meuSet.add(4);	// adicionar elementos pra dentro do HashSet
		meuSet.add(1);
		meuSet.add(2);
		meuSet.add(1);
		meuSet.add(2);
		meuSet.add(0);
		
		Iterator<Integer> iMeuSet = meuSet.iterator();
		
		while (iMeuSet.hasNext()) {		
			System.out.println(iMeuSet.next());	
		}
		
		
	}

}
