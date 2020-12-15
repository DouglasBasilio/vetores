package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {

		/**
		 * declarar lista de n�meros inteiros 
		 * n�o aceita tipos primitivos, exemplo "int"
		 * s� aceita wrapper, exemplo "Integer"
		 * <> significa "generics", parametrizar a defini��o de um tipo, 
		 * informando outro tipo espec�fico
		 */

		List<String> list = new ArrayList<>(); // classe que implementa a interface
		
		/**
		 * add elementos na lista
		 */
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco"); // add elemento posi��o 2 da lista
		

		System.out.println(list.size()); // tamanho da lista
		
		// tipo da lista String, para cada String x que pertence a list
		// imprima x
		
		for (String x: list) {
			System.out.println(x);
		}
		
		System.out.println("---------------");
		
		// list.remove(1);
		
		// usando um predicado (fun��o Lambda) - retorna V ou F
		// remover todo String x, 
		// tal que a primeira posi��o do nome seja igual a 'M'
		
		list.removeIf(x -> x.charAt(0) == 'M');
		
		for (String x: list) {
			System.out.println(x);
		}
		
		System.out.println("---------------");
		
		// encontrar a posi��o de um elemento
		
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		
		// quando n�o encontra o elemento, retorna -1
		System.out.println("Index of Marco: " + list.indexOf("Marco"));
		
		System.out.println("---------------");
		
		// deixar na lista somente quem tem a letra A no in�cio do nome
		
		/**
		 * 1� converter para stream
		 * 2� fazer a opera��o Lambda (filter)
		 * 3� voltar para a lista (Collectors)
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
				findFirst().orElse("Nome n�o encontrado");
		
		/**
		 * o findFirst vai pegar o primeiro elemento da stream
		 * que atenda ao predicado x -> x.charAt(0) == 'A'
		 * se n�o encontrar, retorna nulo orElse(null)
		 */
		
		System.out.println(name);
	}

}
