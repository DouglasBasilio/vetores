package tests;

public class WrapperClass {

	public static void main(String[] args) {
		
		int x = 20;
		
		/**
		 * colocando o Interger, não preciso usar o casting
		 * wrapper class tem como objetivo tratar os tipos primitos como classes, 
		 * mas de forma transparente, sem preocupação com conversão  
		 */
		Integer obj = x;
		
		System.out.println("Boxing: " + obj);
		
		int y = obj;
		
		System.out.println("Unboxing: " + obj);

	}

}
