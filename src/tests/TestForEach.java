package tests;

public class TestForEach {

	public static void main(String[] args) {
		
		/**
		 * Sintaxe
		 * for (Tipo apelido : coleção) {
		 * 		<comando 1>
		 * 		<comando 2>
		 * }
		 */
		
		String[] vect = new String[] {"Douglas", "Jenifer", "Julia", "Felipe"};
		
		for (int i = 0; i < vect.length; i++) {
			System.out.println(vect[i]);
		}
		
		System.out.println("------------");
		
		for (String names : vect) {
			System.out.println(names);
		}
		
	}

}
