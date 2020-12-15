package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {

		/**
		 * declarar lista de números inteiros 
		 * não aceita tipos primitivos, exemplo "int"
		 * só aceita wrapper, exemplo "Integer"
		 * <> significa "generics", parametrizar a definição de um tipo, 
		 * informando outro tipo específico
		 */

		List<String> list = new ArrayList<>(); // classe que implementa a interface
		
		/**
		 * add elementos na lista
		 */
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco"); // add elemento posição 2 da lista
		

		System.out.println(list.size()); // tamanho da lista
		
		// tipo da lista String, para cada String x que pertence a list
		// imprima x
		
		for (String x: list) {
			System.out.println(x);
		}
		
		System.out.println("---------------");
		
		// list.remove(1);
		
		// usando um predicado (função Lambda) - retorna V ou F
		// remover todo String x, 
		// tal que a primeira posição do nome seja igual a 'M'
		
		list.removeIf(x -> x.charAt(0) == 'M');
		
		for (String x: list) {
			System.out.println(x);
		}
		
		System.out.println("---------------");
		
		// encontrar a posição de um elemento
		
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		
		// quando não encontra o elemento, retorna -1
		System.out.println("Index of Marco: " + list.indexOf("Marco"));
		
		System.out.println("---------------");
		
		// deixar na lista somente quem tem a letra A no início do nome
		
		/**
		 * 1º converter para stream
		 * 2º fazer a operação Lambda (filter)
		 * 3º voltar para a lista (Collectors)
		 */
		List<String> result = list.stream().
				filter(x -> x.charAt(0) == 'A').
				collect(Collectors.toList());
		
		for (String x: result) {
			System.out.println(x);
		}
		
		System.out.println("---------------");
		
		// Encontrar elemento da lista que atenda um certo predicado
		
		String name = list.stream().
				filter(x -> x.charAt(0) == 'X').
				findFirst().orElse("Nome não encontrado");
		
		/**
		 * o findFirst vai pegar o primeiro elemento da stream
		 * que atenda ao predicado x -> x.charAt(0) == 'A'
		 * se não encontrar, retorna nulo orElse(null)
		 */
		
		System.out.println(name);
	}

}
