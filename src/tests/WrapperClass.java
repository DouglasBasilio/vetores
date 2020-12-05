package tests;

public class WrapperClass {

	public static void main(String[] args) {
		
		int x = 20;
		
		/**
		 * colocando o Interger, n�o preciso usar o casting
		 * wrapper class tem como objetivo tratar os tipos primitos como classes, 
		 * mas de forma transparente, sem preocupa��o com convers�o  
		 */
		Integer obj = x;
		
		System.out.println("Boxing: " + obj);
		
		int y = obj;
		
		System.out.println("Unboxing: " + obj);

	}

}
